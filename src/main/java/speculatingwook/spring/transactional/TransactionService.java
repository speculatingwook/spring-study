package speculatingwook.spring.transactional;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class TransactionService {

    @Transactional
    public void performTransaction(boolean shouldFail) {
        System.out.println(">> Executing transactional method.");
        if (shouldFail) {
            throw new RuntimeException("Simulated failure.");
        }
    }
}
