package test;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ChatroomTester.class, MessageCreatorTester.class /* add more classes here */})
class AllTests {
	// runs all tests, remains empty
}
