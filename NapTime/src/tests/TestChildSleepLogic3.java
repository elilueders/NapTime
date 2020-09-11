package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Child;
import model.ChildSleepLogic;

public class TestChildSleepLogic3 {
	// is cleared for a 1 hour nap
	ChildSleepLogic sleepLogic = new ChildSleepLogic();
	Child child = new Child("Lewis", 4, 5, true);

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
		assertEquals(1, sleepLogic.amtHoursClearedForSleep(child), 0.01);
	}

}
