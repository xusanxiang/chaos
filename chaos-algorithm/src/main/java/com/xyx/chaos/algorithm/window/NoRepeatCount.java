package com.xyx.chaos.algorithm.window;

import java.util.HashMap;

/**
 * @author xuyexin
 * @version V1.0
 * @Title: NoRepeatCount
 * @Package com.xyx.chaos.algorithm.hash
 * @Description:
 * @date 20/11/2 下午11:01
 */
public class NoRepeatCount {
	/**
	 * 定一个字符串，请你找出其中不含有重复字符的 最长子串的长度
	 * @param s
	 * @return
	 */
	public int noRepeatCount(String s){
		int max = 0;
		int left = 0;
		HashMap<Character, Integer> hashMap = new HashMap<>();
		for (int i=0; i<s.length(); i++){
			if (hashMap.containsKey(s.charAt(i))){
				//如果中间有字符串重复，不做最大判断，下一个字符的前重复位置可能在很靠前位置，形成循环
				left = Math.max(left, hashMap.get(s.charAt(i)) + 1);
			}
			hashMap.put(s.charAt(i), i);
			max = Math.max(max, i-left+1);
		}
		return max;
	}
}