package speculatingwook.spring.circular_dependency;

public class BeanA {
    private BeanB beanB;

    // setter 주입을 통한 의존성 주입
    public void setBeanB(BeanB beanB) {
        this.beanB = beanB;
    }

    public void doSomething() {
        System.out.println("BeanA is doing something.");
        beanB.doSomething();
    }
}