package speculatingwook.spring.di_interface;

public class DIImpl implements DI {

    @Override
    public void inject() {
        System.out.println("injected");
    }
}
