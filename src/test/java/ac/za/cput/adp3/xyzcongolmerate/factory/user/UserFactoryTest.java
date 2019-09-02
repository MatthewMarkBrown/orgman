package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.User;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserFactoryTest {

    //TODO: implement method body ONLY!
    @Test
    public void buildUser() {
        User user = UserFactory.buildUser("user.com", "Matthew","Brown");
        Assert.assertNotNull(user);
        Assert.assertNotNull(user);
        System.out.println("User: " +  user);
    }
}