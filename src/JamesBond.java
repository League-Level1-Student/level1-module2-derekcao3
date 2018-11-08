import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class JamesBond {

	@Test
public void findCode() {
	int x =5;
	Vault vault = new Vault(50);
	assertEquals(vault.tryCode(50), true);
	assertNotEquals(vault.tryCode(10), true);
}
}
