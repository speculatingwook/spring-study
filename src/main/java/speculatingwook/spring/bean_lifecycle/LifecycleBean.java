package speculatingwook.spring.bean_lifecycle;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class LifecycleBean {
    public LifecycleBean() {
        System.out.println("LifecycleBean: Constructor called");
    }

    @PostConstruct
    public void init() {
        System.out.println("LifecycleBean: @PostConstruct - init method called");
    }

    @PreDestroy
    public void cleanup() {
        System.out.println("LifecycleBean: @PreDestroy - cleanup method called");
    }
}
