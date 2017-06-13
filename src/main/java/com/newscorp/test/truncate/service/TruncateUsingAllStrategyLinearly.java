package com.newscorp.test.truncate.service;

import java.util.List;

import com.newscorp.test.truncate.truncateStrategy.TruncateStrategy;

/*
 * Truncate Service implementation to use all the strategies 
 * provided one after one and return the final result
 */
public class TruncateUsingAllStrategyLinearly implements TruncateService{

	//@Override
	public String truncate(String detailedString,int length,
			List<TruncateStrategy> strategyList, List<Object> paramList) {
		String result = detailedString;
		for(TruncateStrategy strat : strategyList){
			result = strat.truncate(result,length, paramList);
		}
		return result;
	}

}
