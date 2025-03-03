import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PIPprCoreTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testIncrementareCod() {
		fail("Not yet implemented");
	}

	@Test
	void testSum() {
		int x = PIPprCore.sum(10, 20);
		assertEquals(x, 30);
		assertEquals(0, PIPprCore.sum(-10,  +10));
		//fail("Not yet implemented");
	}

	@Test
	void testSumElemente() {
		fail("Not yet implemented");
	}

	@Test
	void testEsteEmailValid() {
		fail("Not yet implemented");
	}

}
