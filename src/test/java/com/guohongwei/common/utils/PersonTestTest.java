package com.guohongwei.common.utils;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;

public class PersonTestTest {

	@Test
	public void test() {
		List<Person> list=new ArrayList<Person>();//将创建好的10000个对象存到list集合
		for (int i = 0; i < 10000; i++) {//for循环创建10000个对象
			Person p=new Person();
			//名称选择stringutil的工具类
			p.setName(StringUtil.generateChineseName());
			//年龄选择randomutil的工具类的random
			p.setAge(RandomUtil.random(1, 120));
			//介绍选择stringutil的randomChineseString
			p.setAbout(StringUtil.randomChineseString(140));
			//日期默认为当前系统时间
			p.setCreated(new Date());
			//增加到list集合
			list.add(p);
		}
		for (Person person : list) {
			System.out.println(person);
		}
	}

}
