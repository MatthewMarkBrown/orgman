package ac.za.cput.adp3.xyzcongolmerate.factory.org;

import ac.za.cput.adp3.xyzcongolmerate.domain.org.OrganisationUser;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class OrganisationUserFactoryTest {

    //TODO: implement method body ONLY!
    @Test
    public void buildOrganisationUser() {
        OrganisationUser organisationUser = OrganisationUserFactory.buildOrganisationUser("Test org", "orguser.com");
        Assert.assertNotNull(organisationUser.getOrgCode());
        Assert.assertNotNull(organisationUser);
        System.out.println("Organisation User" +  organisationUser.getOrgCode());
    }
}