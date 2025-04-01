package testCaseRepo;

import org.testng.annotations.Test;

import ObjectRepository.CreatingNewLeadPage;
import ObjectRepository.HomePage;
import ObjectRepository.LeadsPage;
import genricUtility.BaseClass;

public class TC_002 extends BaseClass {
	
	@Test(groups={"Smoke","Sanity"})
	public void LE_001()throws Exception
	{
		HomePage hp=new HomePage(driver);
		hp.clickOnLeadsMenu();
		
		LeadsPage lep=new LeadsPage(driver);
		lep.clickOnCreatingNewLeadIcon();
		
		String lName=eUtil.getDataFromExcelFile("Leads", 5, 1);
		String company=eUtil.getDataFromExcelFile("Leads", 5, 2);
		String leadSource=eUtil.getDataFromExcelFile("Leads", 5, 3);
		String noOfEmployees=eUtil.getDataFromExcelFile("Leads", 5, 4);
		String mobile=eUtil.getDataFromExcelFile("Leads", 5, 5);
		CreatingNewLeadPage cnlp=new CreatingNewLeadPage(driver);
		cnlp.createNewLead(lName ,company , leadSource ,noOfEmployees ,mobile);

	}
}
