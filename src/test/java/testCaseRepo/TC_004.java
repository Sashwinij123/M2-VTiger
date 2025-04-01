package testCaseRepo;

import org.testng.annotations.Test;

import ObjectRepository.CreatingNewLeadPage;
import ObjectRepository.HomePage;
import ObjectRepository.LeadsPage;
import genricUtility.BaseClass;

public class TC_004 extends BaseClass{
	
	@Test(groups= {"Sanity"})
	public void CON_001() throws Exception
	{
		HomePage hp=new HomePage(driver);
		hp.clickOnLeadsMenu();
		
		LeadsPage lep=new LeadsPage(driver);
		lep.clickOnCreatingNewLeadIcon();
		
		String fName=eUtil.getDataFromExcelFile("Contacts", 2, 1);
		String lName=eUtil.getDataFromExcelFile("Contacts", 2, 2);
		String title=eUtil.getDataFromExcelFile("Contacts", 2, 3);
		
		CreatingNewLeadPage cnlp=new CreatingNewLeadPage(driver);
		cnlp.createNewLead(fName,lName,title);
        
	}

}
