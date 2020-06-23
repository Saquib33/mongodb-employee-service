package mongodbemployeeservice.demo.Service;

import mongodbemployeeservice.demo.Model.Employee;

import java.util.List;

public interface EmployeeService {
    public Employee createEmployee(Employee employee);
    public List<Employee> getAllEmployees();
}
