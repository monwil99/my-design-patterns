package decorator.pattern.spring.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Example1 implements Sample {

    @Autowired
    @Qualifier("delegate")
    private SampleImpl delegate;

    public void doJob() {
        delegate.doJob();
    	System.out.println("I am explicitly from Ex_1");
    }

}

class DecoratorPatternEx
{
    public static void main(String[] args)
    {
            System.out.println("***Decorator pattern Demo***");
            

    		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
    		context.scan("decorator.pattern.spring.demo");
    		context.refresh();

    		Example1 ex = context.getBean(Example1.class);
    		ex.doJob();
    		Example2 ex2 = context.getBean(Example2.class);
    		ex2.doJob();


    		context.close();


    }
}