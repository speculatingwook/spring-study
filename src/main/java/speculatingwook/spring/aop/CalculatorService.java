package speculatingwook.spring.aop;

public class CalculatorService {
    public int add(int a, int b) {
        System.out.println("Executing CalculatorService.add()");
        return a + b;
    }
}