package mysqldb_example.connection;

import mysqldb_example.util.PropertyUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

/**
 * @author linahovanessian on 7/6/18.
 */
public final class AWSDBConnection {


    private static AWSDBConnection db;
    private Connection conn;


    private AWSDBConnection() throws Exception {
        Properties properties = PropertyUtil.readPropertiesFile( "/config.properties" );
        String url = properties.getProperty( "database.url" );
        String dbName = properties.getProperty( "database.name" );
        String driver = properties.getProperty( "jdbc.driver" );
        String userName = properties.getProperty( "database.username" );
        String password = properties.getProperty( "database.password" );

        Class.forName( driver ).newInstance();
        this.conn = DriverManager.getConnection( url+dbName,userName,password );
    }

    /**
     * @return AWSDBConnection Database connection object
     */
    public static synchronized AWSDBConnection getInstance() throws Exception {
        if (db == null) db = new AWSDBConnection();
        return db;

    }

    public Connection getConnection() {
        return conn;
    }
}
