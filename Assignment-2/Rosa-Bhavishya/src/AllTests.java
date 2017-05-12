import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ displayTest.class, rollnoRangeTest.class, searchClassTest.class, searchNameTest.class,
		searchRnoTest.class })
public class AllTests {

}
