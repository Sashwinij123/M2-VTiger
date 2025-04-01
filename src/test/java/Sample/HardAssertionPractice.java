package Sample;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertionPractice {
	
	@Test
	public void strictLevelComparison()
	{
		String expectedName="Sash";
		String actualName="Sash";
		
		Assert.assertEquals(actualName, expectedName);
		System.out.println("Hard assertion strict level completed");
	}
	
	public void containsLevelComparison()
	{
		String a1="Don";
		String a2="London";
		
		Assert.assertTrue(a2.contains(a1));
		System.out.println("Hard assertion contains level completed");
	}
		}

