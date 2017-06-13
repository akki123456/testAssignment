package com.newscorp.test.truncate.truncateStrategy;

import org.springframework.beans.factory.annotation.Value;


/*
 * Implementations of truncate strategy to replace
 *  middle of the string with a constant
 * 
 */
public class ReplaceMiddleStringWithConstant implements TruncateStrategy {

	@Value("${truncate.replacement: ... (truncated) ... }")
	String truncatedReplacement;

	 public String truncate(String detailedString, int desiredLength,
			Object... paramList){
		if(detailedString==null||detailedString.length()==0){
			return detailedString;
		}
		int truncatedReplacementLength  = truncatedReplacement.length();
		if(truncatedReplacementLength>=desiredLength){
			return detailedString;
		}
		int detailedStringLength = detailedString.length();		
		if(detailedStringLength<=desiredLength){
			return detailedString;
		}

		int replacementIndex = (desiredLength-truncatedReplacementLength)/2;

		String replacedString = detailedString.substring(0, replacementIndex) +truncatedReplacement
				+ detailedString.substring(detailedStringLength-replacementIndex);
		return replacedString;
	}

	public String getTruncatedReplacement() {
		return truncatedReplacement;
	}


	public void setTruncatedReplacement(String truncatedReplacement) {
		this.truncatedReplacement = truncatedReplacement;
	}


	
}
