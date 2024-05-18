package testcases;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import Utils.Apputils;

public class sendmailtest extends Apputils
{
	@Parameters({"email"})
	@Test
	public void sendmail(String mailid)
	{
		
		System.out.println("Mail Send To" + mailid);
		
	}
	
}
