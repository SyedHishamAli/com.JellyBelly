package com.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public final class Utils {


    private static Properties properties = new Properties();
    static {
        try {
        	FileInputStream fs=new FileInputStream(System.getProperty("user.dir")+"//src//com//config//config.properties");
            properties.load(fs);
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(-1);
        }
    }

    private Utils() {
    }

    public static String getProperty(String property) {
        return properties.getProperty(property);
    }

    public static Object[][] populateExcelDataProvider() throws Exception {

       // int iterationIndex = Integer.parseInt(IterationIndex.get());
        Object[][] excelData;

       
            excelData = new Object[ExcelUtils.ExcelWSheet.getLastRowNum()][1];
            for (int count = 0; count < ExcelUtils.ExcelWSheet.getLastRowNum(); count++) {
                excelData[count][0] = count + 1;
            }

        

        return excelData;
    }
}
