package com.cg.project.mainclass;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.project.services.GreetingsServices;

public class MainClass {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("projectBeans.xml");
		GreetingsServices greetingsServices = (GreetingsServices) context.getBean("greetingsServices");
		greetingsServices.sayHello("Tony Stark");
	}
}
