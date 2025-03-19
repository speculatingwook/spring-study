package speculatingwook.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class Application {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("aop-application.xml");
        CalculatorService calculator = context.getBean("calculatorService", CalculatorService.class);
        int sum = calculator.add(5, 3);
        System.out.println("Sum: " + sum);
    }
}
