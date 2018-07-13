package mysqldb_example.dao;

import mysqldb_example.connection.AWSDBConnection;
import mysqldb_example.pojo.Employee;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

/**
 * @author linahovanessian on 7/6/18.
 */
public class EmployeeDaoImpl implements EmployeeDao {
    @Override
    public List<Employee> findAll() {
        return null;
    }

    @Override
    public int[] insertEmployee(Employee employee) {

        Connection connection = null;
        try {
            connection = AWSDBConnection.getInstance().getConnection();
            Statement statement = connection.createStatement();
            String createTable =
                    "create table IF NOT EXISTS Employee( EmpID  int NOT NULL,Name varchar(255) NOT " +
                            "NULL, PRIMARY KEY (EmpID))";

            String insert =
                    "insert into Employee (EmpID, Name) values(" + employee.getId() + ", '" + employee.getName() + "')";
            statement.addBatch( createTable );
            statement.addBatch( insert );
            int[] result = statement.executeBatch();
            return result;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

    @Override
    public void deleteEmployeeById(int id) {

    }

    /**
     *
     * @param query String The query to be executed
     * @return a ResultSet object containing the results or null if not available
     * @throws SQLException
     */
  /*  public ResultSet query(String query) throws SQLException{
        statement = db.conn.createStatement();
        ResultSet res = statement.executeQuery(query);
        return res;
    }
    /**
     * @desc Method to insert data to a table
     * @param insertQuery String The Insert query
     * @return boolean
     * @throws SQLException

    public int insert(String insertQuery) throws SQLException {
        statement = db.conn.createStatement();
        int result = statement.executeUpdate(insertQuery);
        return result;

    }*/

}
