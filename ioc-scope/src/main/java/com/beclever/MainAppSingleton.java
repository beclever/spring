package com.beclever;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAppSingleton {
   public static void main(String[] args) {
      //test prototype scope
      ApplicationContext context = new ClassPathXmlApplicationContext("Beans2.xml");
      HelloWorld objA = (HelloWorld) context.getBean("helloWorld");
      objA.setMessage("I'm object A");
      objA.getMessage();
      HelloWorld objB = (HelloWorld) context.getBean("helloWorld");
      objB.getMessage();
   }
}