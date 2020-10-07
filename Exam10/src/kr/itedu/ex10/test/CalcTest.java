package kr.itedu.ex10.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import kr.itedu.ex10.Calc;

class CalcTest {

	@Test
	void test() {
		Assert.assertEquals(5,Calc.sum(2, 3));
		Assert.assertEquals(13,Calc.sum(10, 3));
		Assert.assertEquals(15,Calc.sum(6, 9));
		
		Assert.assertEquals(18,Calc.sum(9, 9));
		
		Assert.assertEquals(0,Calc.sum(0, 0));
	}

}
