package Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

public class PropsReader {

    private static final String resourcesDir = "src" + File.separator + "main"+ File.separator +"resources"+ File.separator;
    private static Properties properties = new Properties();






    public static String getPropValuesForEnv(String prop) {

        String propFileName =  resourcesDir +"env.properties";
        String result = null;
        try {
            result = readFile(prop, propFileName);
        } catch (FileNotFoundException e) {
        e.getMessage ();
        }

        return result;
    }

    public static String readActionFromFile(){

        String filePath =  resourcesDir +"smartActionAnalysePurchase.txt";
        String result = null;
        try {
            result = readFile(filePath, Charset.defaultCharset());
        } catch (Exception e) {
           e.getMessage();
        }

        return result;
    }

    private static String readFile(String filePath, Charset encoding)
            throws IOException
    {
        byte[] encoded = Files.readAllBytes(Paths.get(filePath));
        return new String(encoded, encoding);
    }

    private static String readFile(String prop, String propFileName) throws FileNotFoundException {
        FileInputStream in = new FileInputStream(propFileName);
        String result = "";

        try {

            if (in != null) {
                properties.load(in);
            } else {
                throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
            }


            // get the property
            result = properties.getProperty(prop);

        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
        return result;
    }
}
