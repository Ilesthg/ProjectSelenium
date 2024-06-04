package Lap.Utility;

import Lap.Base.BaseModeloparaLap;
import Utility.BaseMode;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public  class Screenshots extends BaseModeloparaLap {


    public  static void takeScreenS() throws IOException {
        Date dt = new Date();
       String fileDate =  dt.toString().replace(" ", "-").replace(":","-");


        File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File("src/test/java/ssEvidence/"+fileDate+".png"));

    }
}
