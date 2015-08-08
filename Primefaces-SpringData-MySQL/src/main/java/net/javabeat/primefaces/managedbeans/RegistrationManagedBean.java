package net.javabeat.primefaces.managedbeans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import net.javabeat.springdata.beans.RegistrationService;
import net.javabeat.springdata.jpa.data.Employee;

import com.google.common.collect.Lists;

@ManagedBean
@SessionScoped
public class RegistrationManagedBean {
	
	private Employee employee = new Employee();
	
	private List<Employee> employees = new ArrayList<Employee>();
	
	//@ManagedProperty(value="#{registrationService}")
	private RegistrationService service;

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public List<Employee> getEmployees() {
		this.employees = Lists.newArrayList(this.service.getEmployeeRepository().findAll());
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}


	public RegistrationService getService() {
		return service;
	}

	public void setService(RegistrationService service) {
		this.service = service;
	}

	public String register(){
		this.service.getEmployeeRepository().save(this.employee);
		this.employee = new Employee();
		return "";
	} 
	
}
