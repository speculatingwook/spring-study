package speculatingwook.spring.circular_dependency;

public class BeanB {
    private BeanA beanA;

    // setter 주입을 통한 의존성 주입
    public void setBeanA(BeanA beanA) {
        this.beanA = beanA;
    }

    public void doSomething() {
        System.out.println("BeanB is doing something.");
    }
}
