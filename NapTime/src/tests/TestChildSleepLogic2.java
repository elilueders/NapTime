package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Child;
import model.ChildSleepLogic;

public class TestChildSleepLogic2 {
	// in 2 hours will be cleared for a .5 hour nap
	ChildSleepLogic sleepLogic = new ChildSleepLogic();
	Child child = new Child("Maxine", 2, 6.5, false);

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testIsClearedForSleep() {
		assertFalse(sleepLogic.isClearedForSleep(child));
	}

	@Test
	public void testHoursUntilClearedForSleep() {
		assertEquals(2.0, sleepLogic.hoursUntilClearedForSleep(child), 0.01);
	}
	
	@Test
	public void testAmtHoursClearedForSleep() {
		assertEquals(0.0, sleepLogic.amtHoursClearedForSleep(child), 0.01);
	}

}
