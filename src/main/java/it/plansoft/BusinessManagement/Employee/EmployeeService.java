package it.plansoft.BusinessManagement.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
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

	public double getSalary(Long id) {
		
		return 0;
	}

	public void promote(Employee employee, Long id) {
		// TODO Auto-generated method stub
		
	}

	public void changePosition(Employee employee, Long id) {
		// TODO Auto-generated method stub
		
	}

	public void changeSalary(Employee employee, Long id) {
		// TODO Auto-generated method stub
		
	}

	public void changeDailyHours(Employee employee, Long id) {
		// TODO Auto-generated method stub
		
	}

	public void setActualHours(Employee employee, Long id) {
		// TODO Auto-generated method stub
		
	}
}
