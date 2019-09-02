package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.UserRole;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserRoleFactoryTest {

    //TODO: implement method body ONLY!
    @Test
    public void buildUserRole() {
        UserRole userRole = UserRoleFactory.buildUserRole("2", "Test.com","3");
        Assert.assertNotNull(userRole);
        Assert.assertNotNull(userRole);
        System.out.println("User: " +  userRole);
    }
}