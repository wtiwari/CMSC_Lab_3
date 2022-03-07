import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradebookTester {
	Gradebook gradebook1;
	Gradebook gradebook2;
	@BeforeEach
	void setUp() throws Exception {
		gradebook1 = new Gradebook(5);
		//call addScore
		gradebook1.addScore(68);
		gradebook1.addScore(100);
		gradebook1.addScore(80);
		gradebook2 = new Gradebook(5);
		//call addScore 
		gradebook2.addScore(78);
		gradebook2.addScore(75);
		gradebook2.addScore(100);
		
	}

	@AfterEach
	void tearDown() throws Exception {
		gradebook1 = null;
		gradebook2 = null;
	}

	@Test
	void testGradebook() {
		
	}

	@Test
	void testScoreSize() {
		
	}

	@Test
	void testAddScore() {
		assert(" 68.0 100.0 80.0 0.0 0.0".equals(gradebook1.toString()));
		assert(" 78.0 75.0 100.0 0.0 0.0".equals(gradebook2.toString()));
		
		
	}

	@Test
	void testSum() {
		assertEquals(248.0, gradebook1.sum());
		assertEquals(253.0 ,gradebook2.sum());
		
	}

	@Test
	void testMinimum() {
		assertEquals(68.0, gradebook1.minimum());
		assertEquals(75.0 ,gradebook2.minimum());
		
	}

	@Test
	void testFinalScore() {
		assertEquals(180, gradebook1.finalScore());
		assertEquals(178 ,gradebook2.finalScore());
		
	}

	@Test
	void testToString() {
		
	}

}
