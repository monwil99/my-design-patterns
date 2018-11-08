package decorator.pattern.spring.demo;

import org.springframework.stereotype.Component;

@Component("delegate")
public class SampleImpl implements Sample{
    @Override
    public void doJob(){
			System.out.println(" I am from Concrete Component-I am closed for modification.");
    }
}
