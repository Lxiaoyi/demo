package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Test
	public void contextLoads() {
		int a = 2;
		int b = 5;
		//int c = ++a;
		System.out.println(a++);
		//int d = ++b;
		System.out.println(++a);
		System.out.println(a+b);
	}

}

