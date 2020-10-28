package com.dips.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.dips.entities.Employee;
import com.dips.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements UserDetailsService{

	@Autowired
	private EmployeeRepository employeeRepository;	
	
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		short enabled = 1;
		Employee employee = employeeRepository.findByEmailAndEnabled(email, enabled);
		GrantedAuthority authority = new SimpleGrantedAuthority(employee.getRole());
		return new User(employee.getEmail(), employee.getPassword(), Arrays.asList(authority));
	}
	
}
