package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.UserDemography;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class UserDemographyFactoryTest {

    //TODO: implement method body ONLY!
    @Test
    public void buildUserDemography() {
        UserDemography userDemography = UserDemographyFactory.buildUserDemography("user.com", "TestTitle","3","5",new Date());
        Assert.assertNotNull(userDemography);
        Assert.assertNotNull(userDemography);
        System.out.println("User Demo: " +  userDemography);
    }
}