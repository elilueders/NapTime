package tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestChildSleepLogic1.class, TestChildSleepLogic2.class, TestChildSleepLogic3.class })
public class AllTests {

}
