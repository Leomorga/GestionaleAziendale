package it.plansoft.BusinessManagement.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public List<Employee> getAllemployees() {
		List<Employee> employees = new ArrayList<>();
		employeeRepository.findAll()
		 .forEach(employees::add);
		return employees;
	}
	
	public Optional<Employee> getEmployee(Long id) {
		return employeeRepository.findById(id);
	}

	public void addEmployee(Employee employee) {
		employeeRepository.save(employee);
	}

	public void updateEmployee(Long id, Employee employee) {
		employeeRepository.save(employee);
		
	}

	public void deleteEmployee(Long id) {
		employeeRepository.deleteById(id);
	}

	public double getSalary(Long id) {
		double baseSalary = employeeRepository.findById(id).get().getPayRoll().getSalary();
		int promotions = employeeRepository.findById(id).get().getPayRoll().getPromotions();
		int extraHours = employeeRepository.findById(id).get().getTimeBank().getExtraHours();
		int dailyHours = employeeRepository.findById(id).get().getTimeBank().getDailyHours();
		return baseSalary+(promotions)+(extraHours*(baseSalary/30*dailyHours)*1.7);
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
