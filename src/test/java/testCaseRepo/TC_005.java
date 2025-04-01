package testCaseRepo;

import org.testng.annotations.Test;

import ObjectRepository.CreatingNewContactsPage;
import ObjectRepository.HomePage;
import ObjectRepository.LeadsPage;
import genricUtility.BaseClass;

public class TC_005 extends BaseClass {
	
	@Test(groups= {"Smoke"})
	public void CON_002() throws Exception
	{
		HomePage hp = new HomePage(driver);
		hp.clickOnLeadsMenu();
		
		LeadsPage lep = new LeadsPage(driver);
		lep.clickOnCreatingNewLeadIcon();
		
		String lName = eUtil.getDataFromExcelFile("Contacts", 5, 1);
		String mobile = eUtil.getDataFromExcelFile("Contacts", 5, 2);
		String email = eUtil.getDataFromExcelFile("Contacts", 5, 3);
		String title = eUtil.getDataFromExcelFile("Contacts", 5, 3);
		
		CreatingNewContactsPage cncp=new CreatingNewContactsPage(driver);
		cncp.createNewContacts(lName, title, email, mobile);
	}

}
