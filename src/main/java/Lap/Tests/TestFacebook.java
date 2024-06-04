package Lap.Tests;


import Lap.Base.BaseModeloparaLap;
import Lap.PageModels.HomePageFacebook;
import Utility.BaseMode;
import org.testng.annotations.Test;

public class TestFacebook extends BaseModeloparaLap {

    @Test
    public void Login(){
        HomePageFacebook.Login();
    }

}
