package com.newscorp.test.truncate.service;

import java.util.List;

import com.newscorp.test.truncate.truncateStrategy.TruncateStrategy;

/*
 * Interface for various implementations of relating different truncateStrategies.
 * Implementations can be using all the strategies, best of the strategies etc.
 */
public interface TruncateService {
	public String truncate(String detailedString,int length,
			List<TruncateStrategy>strategyList,List<Object> paramList);
}
