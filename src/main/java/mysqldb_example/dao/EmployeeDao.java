package mysqldb_example.dao;

import mysqldb_example.pojo.Employee;

import java.util.List;

/**
 * @author linahovanessian on 7/6/18.
 */
public interface EmployeeDao {

    List<Employee> findAll();

    int[] insertEmployee(Employee employee);

    void deleteEmployeeById(int id);
}
