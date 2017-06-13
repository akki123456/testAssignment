package com.newscorp.test.truncate.truncateStrategy;

import org.junit.Assert;
import org.junit.Test;

public class ReplaceMiddleStringWithConstantTest {
	
	ReplaceMiddleStringWithConstant rms = new ReplaceMiddleStringWithConstant();
	
	@Test
	public void testCase1(){
		rms.setTruncatedReplacement(" ... (truncated) ... ");
		String result = rms.truncate("123456789012345678901234567890",25);
		System.out.println(result);
		Assert.assertEquals("12 ... (truncated) ... 90",result);
		
		 result = rms.truncate("123456789012345678901234567890" ,   31);
		Assert.assertEquals("123456789012345678901234567890",result);
		
		 result = rms.truncate("1234567890" ,   5);
			Assert.assertEquals("1234567890",result);
		
	}

}
