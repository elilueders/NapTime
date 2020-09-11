package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Child;
import model.ChildSleepLogic;

public class TestChildSleepLogic1 {
	// is cleared for a 1.5 hour nap
	ChildSleepLogic sleepLogic = new ChildSleepLogic();
	Child child = new Child("Frances", 4, 5.5, false);

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testIsClearedForSleep() {
		assertTrue(sleepLogic.isClearedForSleep(child));
	}

	@Test
	public void testHoursUntilClearedForSleep() {
		assertEquals(0.0, sleepLogic.hoursUntilClearedForSleep(child), 0.01);
	}
	
	@Test
	public void testAmtHoursClearedForSleep() {
		assertEquals(1.5, sleepLogic.amtHoursClearedForSleep(child), 0.01);
	}

}
