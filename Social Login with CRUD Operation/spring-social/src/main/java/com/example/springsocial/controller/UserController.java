package com.example.springsocial.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springsocial.exception.BadRequestException;
import com.example.springsocial.exception.ResourceNotFoundException;
import com.example.springsocial.model.AuthProvider;
import com.example.springsocial.model.User;
import com.example.springsocial.payload.UserDto;
import com.example.springsocial.repository.UserRepository;
import com.example.springsocial.security.CurrentUser;
import com.example.springsocial.security.UserPrincipal;

@RestController
public class UserController {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private PasswordEncoder passwordEncoder;

	ModelMapper modelMapper = new ModelMapper();

	@GetMapping("/user/me")
	@PreAuthorize("hasRole('USER')")
	public User getCurrentUser(@CurrentUser UserPrincipal userPrincipal) {
		return userRepository.findById(userPrincipal.getId())
				.orElseThrow(() -> new ResourceNotFoundException("User", "id", userPrincipal.getId()));
	}

	@GetMapping("/users")
	public ResponseEntity<List<User>> getAllUsers() throws Exception {

		List<User> user = userRepository.findAll();

		if (user == null || user.isEmpty()) {
			return new ResponseEntity<List<User>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<User>>(user, HttpStatus.OK);
	}

	@PutMapping("/users/{id}")
	public ResponseEntity<User> updatePerson(@Valid @RequestBody UserDto userDto, @PathVariable int id)
			throws Exception {

		System.out.println("id" + id);
		User user = userRepository.findById((long) id)
				.orElseThrow(() -> new BadRequestException("User Not Found for thid id ::" + id));

		// Creating user's account
		User user2 = new User();
		// user.setName(signUpRequest.getName());
		// user.setEmail(signUpRequest.getEmail());
		user2 = modelMapper.map(userDto, User.class);
		user2.setId((long) id);
		user2.setPassword(userDto.getPassword());
		user2.setProvider(AuthProvider.local);

		user2.setPassword(passwordEncoder.encode(user2.getPassword()));

		User result = userRepository.save(user2);

		// user2 = userRepository.save(user);

		if (result != null) {
			return new ResponseEntity<>(user, HttpStatus.CREATED);
		} else {
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}
	}

	@DeleteMapping("/users/{id}")
	public Map<String, Boolean> deleteEmployee(@PathVariable(value = "id") Long id) throws ResourceNotFoundException {
		User user = userRepository.findById(id)
				.orElseThrow(() -> new BadRequestException("User not found for this id :: " + id));

		userRepository.delete(user);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}

}
