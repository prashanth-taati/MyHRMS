package calTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import calculator.library.caltypes;
import utils.AppUtils;

public class addtest extends AppUtils
{	

	@Test
	public void addingnumb() throws InterruptedException
	{
		caltypes total = new caltypes();
		boolean res =total.adding();
		Assert.assertTrue(res);
		
	}
	
	
}
