package mongodbemployeeservice.demo.Dao;

import mongodbemployeeservice.demo.Model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee,String> {
}
