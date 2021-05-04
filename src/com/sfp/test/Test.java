package com.sfp.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.sfp.beans.Employee;

public class Test {
public static void main(String[] args) {
	BeanFactory beaFactory=new XmlBeanFactory(new ClassPathResource("com\\sfp\\common\\application-context.xml"));
	Employee employee=beaFactory.getBean("employee",Employee.class);
	System.out.println(employee);
}
}
