package it.plansoft.BusinessManagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class EmployeeService {
	
	//@Autowired
	//private EmployeeRepository employeeRepository;
	
	public void getAllemployees() {
		/*
		List<Employee> employees = new ArrayList<>();
		employeeRepository.findAll()
		 .forEach(employees::add);
		return employees;
		*/
	}
	
	public void getEmployee(String id) {
		//void -> Optional<Employee>
		//return employeeRepository.findById(id);
	}

	public void addEmployee() {
		//Employee employee
		//employeeRepository.save(employee);
	}

	public void updateEmployee(String id) {
		//Employee employee
		//employeeRepository.save(employee);
		
	}

	public void deleteEmployee(String id) {
		//employeeRepository.deleteById(id);
	}
}
