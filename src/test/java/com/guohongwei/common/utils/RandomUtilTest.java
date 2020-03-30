package com.guohongwei.common.utils;


import org.junit.Test;

public class RandomUtilTest {

	@Test
	public void test() {
		//int i = RandomUtil.random(1, 3);
		/*
		 * int[] is = RandomUtil.subRandom(1, 10, 3); for (int i : is) {
		 * System.out.println(i); }
		 */
		String string = RandomUtil.randomString(3);
		
		System.out.println(string);
	}
	@Test
	public void test2() {
		String str=" ";
		//boolean b = StringUtil.hasLength(str);
		//boolean c = StringUtil.hasText(str);
		//System.out.println(c);
		String name = StringUtil.generateChineseName();
		System.out.println(name);
	}
}
