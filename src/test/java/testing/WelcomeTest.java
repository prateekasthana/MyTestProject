package testing;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import com.test.Welcome;

public class WelcomeTest {

	@Test
	public void testSayHello() {
		//fail("Not yet implemented");
		
		Welcome welcome = new Welcome();
		
		Assert.assertEquals("Simple Test ", "hello", welcome.sayHello());
	
	}

}
