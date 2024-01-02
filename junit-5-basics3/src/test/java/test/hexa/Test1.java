package test.hexa;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.hexaware.MathUtil;
class Test1 {
	//The annotation @Test tells the junit what to test 
	@Test
	void test1() {
		//fail("Not yet implemented");
		int target=2+2;
		Assertions.assertEquals(target, MathUtil.add(2, 2),"Error->");

	}
	
	@Test
	void test2() {
		//fail("Not yet implemented");
		int target=2+3;
		Assertions.assertEquals(target, MathUtil.add(2, 3),"Error->");

	}

}
