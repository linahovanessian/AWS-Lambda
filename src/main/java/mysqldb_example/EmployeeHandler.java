package mysqldb_example;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import mysqldb_example.dao.EmployeeDao;
import mysqldb_example.dao.EmployeeDaoImpl;
import mysqldb_example.pojo.Employee;

/**
 * @author linahovanessian on 7/6/18.
 */
public class EmployeeHandler implements RequestHandler<Employee, String> {
    @Override
    public String handleRequest(Employee employee, Context context) {
        //a Pojo based request is sent
        //the employee is save in the Mysql instance on AWS

        EmployeeDao employeeDao = new EmployeeDaoImpl();
        int[] result = employeeDao.insertEmployee( employee );
        for (int i : result) {
            System.out.println( i );
        }

        return employee.getName();
    }
}
