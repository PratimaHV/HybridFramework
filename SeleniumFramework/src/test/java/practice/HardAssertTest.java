package practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertTest {
@Test
public void creatCustomerTest()
{
	System.out.println("Step1");
	System.out.println("Step2");
	Assert.assertEquals("A", "B");
	System.out.println("Step3");
	System.out.println("Step4");
	
}
@Test
public void modifyCustomerTest()
{
	System.out.println("......................");
	System.out.println("Step1");
	System.out.println("Step2");
	System.out.println("Step3");
}
}
