package com.cg.project.services;

import org.springframework.stereotype.Component;

@Component(value = "greetingsServices")
public class GreetingServicesImpl1 implements GreetingsServices
{

	@Override
	public void sayHello(String name) {
		System.out.println("Hello "+ name);
		
	}

	@Override
	public void sayGoodBye(String name) {
		System.out.println("GoodBye "+ name);
		
	}

}
