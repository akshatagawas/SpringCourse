package com.example.learn_spring_framework.examples.a1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;




// Business Class
@Component
class YourBusinessClass{
	
	

//	@Autowired
	Dependency1 dependency1;
//	@Autowired
	Dependency2 dependency2;
	
//	@Autowired
	public YourBusinessClass(Dependency1 dependency1, Dependency2 dependency2) {
		super();
		System.out.println("Constructor Injection");
		this.dependency1 = dependency1;
		this.dependency2 = dependency2;
	}

//	@Autowired
//	public void setDependency1(Dependency1 dependency1) {
//		System.out.println("Setter Injection 1");
//		this.dependency1 = dependency1;
//	}
//	
//	@Autowired
//	public void setDependency2(Dependency2 dependency2) {
//		System.out.println("Setter Injection 2");
//		this.dependency2 = dependency2;
//	}
	
	
	
	
	public String toString() {
		return "Using "+dependency1+" and "+dependency2;
	}
}

// Dependency 1
@Component
class Dependency1{
	
}

// Dependency 2
@Component
class Dependency2{
	
}



@Configuration
@ComponentScan
public class DependencyInjectionLauncherApplication2 {

	public static void main(String[] args) {
		
		try(var context = new AnnotationConfigApplicationContext(DependencyInjectionLauncherApplication2.class)){
			
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			System.out.println(context.getBean(YourBusinessClass.class));
			
		}
		
	}

}
