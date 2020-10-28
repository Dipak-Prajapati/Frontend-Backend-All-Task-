package com.dips.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dips.dto.EmployeeDto;
import com.dips.entities.Employee;
import com.dips.exception.ResourceNotFoundException;
import com.dips.repository.EmployeeRepository;
import com.dips.service.EmployeeService;

@RestController
public class EmployeeController {

	//@Autowired
	//private EmployeeService employeeService;
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	ModelMapper modelMapper = new ModelMapper();
	
	@GetMapping("/test")
	public String Test()
	{
		return "Test The API";
	}
	
	@GetMapping("/employees")
	public List<Employee> getAllEmployees()
	{
		return employeeRepository.findAll();
	}
	
	@GetMapping("/employees/{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable(value = "id") Long employeeId) throws ResourceNotFoundException
	{
		Employee employee = employeeRepository.findById(employeeId).orElseThrow(()-> new ResourceNotFoundException("Employee not found for this id :"+employeeId));
		return ResponseEntity.ok().body(employee);	
	}
	
	@PostMapping("/saveEmployee")
	public Employee createEmployee(@Valid @RequestBody EmployeeDto employeeDto) {
		System.out.println("hello"+employeeDto.getEmail());
		Employee employee = modelMapper.map(employeeDto,Employee.class);
		System.out.println("hello"+employee.getEmail());
		return employeeRepository.save(employee);
	}
	
	@PutMapping("/employees/{id}")
	public ResponseEntity<Employee> updateEmployee(@PathVariable(value = "id") Long employeeId,
			@Valid @RequestBody EmployeeDto employeeDto) throws ResourceNotFoundException {
		Employee employee = employeeRepository.findById(employeeId).orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + employeeId));
		
		employee = modelMapper.map(employeeDto,Employee.class);
		employee.setId(employeeId);
		System.out.println("Employee : "+employee.getId()+employee.getName()+employee.getEmail()+"Employee DTO :"+employeeDto.getId()+employeeDto.getName()+employeeDto.getEmail());
		return ResponseEntity.ok(employeeRepository.save(employee));
	}
	
	@DeleteMapping("/employees/{id}")
	public Map<String, Boolean> deleteEmployee(@PathVariable(value = "id") Long employeeId)
			throws ResourceNotFoundException {
		Employee employee = employeeRepository.findById(employeeId)
				.orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + employeeId));

		employeeRepository.delete(employee);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}
	
}
