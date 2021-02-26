package it.plansoft.BusinessManagement.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	private EmployeeService employeeService;
	
	private Logger log = LoggerFactory.getLogger(EmployeeController.class);
	
	@GetMapping("/employees")
	public List<String> getAllEmployees() {
		log.info("getAllEmployees");
		return Arrays.asList("ciao", "doge");
		
		//employeeService.getAllEmployees();
	}
	
	@GetMapping("employees/{id}")
	public void getEmployee(@PathVariable Long id){
		log.info("getEmployee");
		//void -> Optional<Employee>
		//employeeService.getEmployee(id);
	}
	
	@PostMapping("/employees")
	public void addEmployee(@RequestBody Employee employee) {
		log.info("addEmployee");
		//employeeService.addEmployee(employee);
	}
	
	@DeleteMapping("/employees/{id}")
	public void deleteEmployee(@PathVariable Long id) {
		log.info("deleteEmployee");
		//employeeService.deleteEmployee(id);
	}
	
	
	@PutMapping("/employees/{id}")
	public void updateEmployee(@RequestBody Employee employee, @PathVariable Long id) {
		log.info("updateEmployee");
		//void -> Optional<Employee>
		//employeeService.updateEmployee(employee, id);
	}
	
	@GetMapping("employees/{id}/salary")
	public double getSalary(@PathVariable Long id) {
		return employeeService.getSalary(id);
	}
	
	@PutMapping("employees/{id}/promotion")
	public void promote(@RequestBody Employee employee, @PathVariable Long id) {
		employeeService.promote(employee, id);
	}
	
	@PutMapping("employees/{id}/position")
	public void changePosition(@RequestBody Employee employee, @PathVariable Long id) {
		employeeService.changePosition(employee, id);
	}
	
	@PutMapping("employees/{id}/salary")
	public void changeSalary(@RequestBody Employee employee, @PathVariable Long id) {
		employeeService.changeSalary(employee, id);
	}
	
	@PutMapping("employees/{id}/dailyhours")
	public void changeDailyHours(@RequestBody Employee employee, @PathVariable Long id) {
		employeeService.changeDailyHours(employee, id);
	}
	
	@PutMapping("employees/{id}/actualHours")
	public void setActualHours(@RequestBody Employee employee, @PathVariable Long id) {
		employeeService.setActualHours(employee, id);
	}
}
