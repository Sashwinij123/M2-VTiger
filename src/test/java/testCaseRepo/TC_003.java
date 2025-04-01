package testCaseRepo;

import org.testng.annotations.Test;

import ObjectRepository.CreatingNewLeadPage;
import ObjectRepository.HomePage;
import ObjectRepository.LeadsPage;
import genricUtility.BaseClass;

public class TC_003 extends BaseClass{
	
	@Test(groups= {"Regression"})
	public void LE_001()throws Exception
	{
		HomePage hp=new HomePage(driver);
		hp.clickOnLeadsMenu();
		
		LeadsPage lep=new LeadsPage(driver);
		lep.clickOnCreatingNewLeadIcon();
		
		String lName=eUtil.getDataFromExcelFile("Leads", 8, 1);
		String company=eUtil.getDataFromExcelFile("Leads", 8, 2);
		String noOfEmployees=eUtil.getDataFromExcelFile("Leads", 8, 3);
		String mobile=eUtil.getDataFromExcelFile("Leads", 8, 4);
		String email=eUtil.getDataFromExcelFile("Leads", 8, 5);
		String city=eUtil.getDataFromExcelFile("Leads", 8, 6);
		String country=eUtil.getDataFromExcelFile("Leads", 8, 7);
		String state=eUtil.getDataFromExcelFile("Leads", 8, 8);
		CreatingNewLeadPage cnlp=new CreatingNewLeadPage(driver);
		cnlp.createNewLead(lName,company,noOfEmployees,mobile,email,city,country,state);
        
	}

}
