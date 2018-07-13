package mysqldb_example.util;


import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author linahovanessian on 7/11/18.
 */
public class PropertyUtil {


    public static Properties readPropertiesFile(String fileName) {

        try (InputStream is = PropertyUtil.class.getResourceAsStream( fileName );){
            Properties prop = new Properties();
            prop.load( is );
            return prop;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }




}
