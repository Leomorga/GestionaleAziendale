package it.plansoft.BusinessManagement.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sun.org.slf4j.internal.Logger;


@RestController
public class EmployeeController {
	
	//private EmployeeService employeeService
	
	//private Logger log = 
	
	@GetMapping("/employees")
	public List<String> getAllEmployees() {
		return Arrays.asList("ciao", "doge");
		
		//employeeService.getAllEmployees();
	}
	
	@GetMapping("employees/{id}")
	public void getEmployee(@PathVariable Long id){
		//void -> Optional<Employee>
		//employeeService.getEmployee(id);
	}
	
	@PostMapping("/employees")
	public void addEmployee(@RequestBody Employee employee) {
		//employeeService.addEmployee(employee);
	}
	
	@DeleteMapping("/employees/{id}")
	public void deleteEmployee(@PathVariable Long id) {
		//employeeService.deleteEmployee(id);
	}
	
	
	@PutMapping("/employees/{id}")
	public void updateEmployee(@RequestBody Employee employee, @PathVariable Long id) {
		//void -> Optional<Employee>
		//employeeService.updateEmployee(employee, id);
	}
}
