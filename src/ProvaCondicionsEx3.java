import org.junit.Assert;
import org.junit.Test;

public class ProvaCondicionsEx3 {

	@Test
	public void test() {
		Primordial p1 = new Primordial();
		Assert.assertTrue("Veritat que primordial(8) > 200", p1.get_primordial(8) > 200);
		Assert.assertFalse("Es fals que primordial(6) > 30", p1.get_primordial(6) > 30);
		Assert.assertTrue("Veritat que primordial(2) <= 2", p1.get_primordial(2) <= 2);
	}
	
}