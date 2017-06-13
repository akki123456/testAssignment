package com.newscorp.test.truncate.truncateStrategy;

/*
 * interface for truncateStrategy. Implementations can have 
 * strategies depending on various params.
 */

public interface TruncateStrategy {

	
	public String truncate(String detailedString ,
			int desiredLength, Object... paramList);
}
