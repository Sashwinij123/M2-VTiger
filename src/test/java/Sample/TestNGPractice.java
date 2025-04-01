package Sample;

import org.testng.annotations.Test;

public class TestNGPractice {
	 @Test 
	 public void createUser()
	 {
		 System.out.println("User Creator");
	 }
	
	 public void modifyUser()
	 {
		 System.out.println("user modified");
	 }
	 @Test
	 public void deleteUser()
	 {
		 System.out.println("user deleted");
	 }

}
