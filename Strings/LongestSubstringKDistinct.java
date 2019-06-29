package com.indra.CodingPatterns.SlidingWindow;
/*Given a string, find the length of the longest substring in it with no more 
 * than K distinct characters.
 * 
 * Input: String="araaci", K=2
   Output: 4
   Explanation: The longest substring with no more than '2' distinct 
   characters is "araa".
 * 
 * */

import java.util.*;

class LongestSubstringKDistinct {
	public int longSubString(String s, int k){
		int maxLen = 0;
		int windowStart = 0;
		Map<Character, Integer> frequencyMap = new HashMap<Character, Integer>();
		// making range
		for(int windowEnd= 0; windowEnd < s.length(); windowEnd++ ){
			char rightChar = s.charAt(windowEnd);
			frequencyMap.put(rightChar, frequencyMap.getOrDefault(rightChar, 0)+1);
			//shrink the window until we have k distinct charcters in frequencyMap
			while(frequencyMap.size() > k){
				char leftChar = s.charAt(windowStart);
				frequencyMap.put(leftChar, frequencyMap.get(leftChar) - 1);
				if(frequencyMap.get(leftChar) == 0){
					frequencyMap.remove(leftChar);
				}
				windowStart++;
			}
			maxLen = Math.max(maxLen, windowEnd- windowStart +1);
		}
		return maxLen;
	}
	public static void main(String[] args){
		LongestSubstringKDistinct obj = new LongestSubstringKDistinct();
		System.out.println(obj.longSubString("araaci", 2));
	}
	
}
