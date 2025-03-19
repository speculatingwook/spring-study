package speculatingwook.spring.transactional;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class Application {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("transactional-application.xml");
        TransactionService service = context.getBean(TransactionService.class);

        System.out.println("=== 정상 실행 ===");
        service.performTransaction(false);

        System.out.println("\n=== 예외 발생 실행 ===");
        try {
            service.performTransaction(true);
        } catch (Exception ex) {
            System.out.println("Exception caught: " + ex.getMessage());
        }
    }
}
