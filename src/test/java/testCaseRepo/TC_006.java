package testCaseRepo;

import org.testng.annotations.Test;

import ObjectRepository.CreatingNewContactsPage;
import ObjectRepository.HomePage;
import ObjectRepository.LeadsPage;
import genricUtility.BaseClass;

public class TC_006 extends BaseClass
{
	
	@Test(groups= {"Regression"})
	public void CON_003() throws Exception
	{
		HomePage hp = new HomePage(driver);
		hp.clickOnLeadsMenu();
		
		LeadsPage lep = new LeadsPage(driver);
		lep.clickOnCreatingNewLeadIcon();
		
		String lName = eUtil.getDataFromExcelFile("Contacts", 8, 1);
		String mobile = eUtil.getDataFromExcelFile("Contacts", 8, 2);
		String email = eUtil.getDataFromExcelFile("Contacts", 8, 3);
		String mailingCity = eUtil.getDataFromExcelFile("Contacts", 8, 4);
		String mailingState = eUtil.getDataFromExcelFile("Contacts", 8, 5);
		String mailingCountry = eUtil.getDataFromExcelFile("Contacts", 8, 6);
		CreatingNewContactsPage cncp=new CreatingNewContactsPage(driver);
		cncp.createNewContacts(lName, email, mobile, mailingCity, mailingState, mailingCountry);
	}

}
