package speculatingwook.spring.di_interface;

public class TargetClass {
    private final DI di;

    public TargetClass(DI di) {
        this.di = di;
    }

    public void implFunction() {
        di.inject();
    }
}
