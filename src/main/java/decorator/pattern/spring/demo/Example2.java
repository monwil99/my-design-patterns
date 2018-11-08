package decorator.pattern.spring.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class Example2 implements Sample {
    @Autowired
    @Qualifier("delegate")
    private SampleImpl delegate;

    public void doJob() {
        delegate.doJob();
    	System.out.println("I am explicitly from Ex_2");
    }	
}