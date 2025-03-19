package speculatingwook.spring.transactional;

import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionException;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.SimpleTransactionStatus;

public class DummyTransactionManager implements PlatformTransactionManager {

    @Override
    public TransactionStatus getTransaction(TransactionDefinition definition) throws TransactionException {
        System.out.println("DummyTransactionManager: Transaction started.");
        return new SimpleTransactionStatus();
    }

    @Override
    public void commit(TransactionStatus status) throws TransactionException {
        System.out.println("DummyTransactionManager: Transaction committed.");
    }

    @Override
    public void rollback(TransactionStatus status) throws TransactionException {
        System.out.println("DummyTransactionManager: Transaction rolled back.");
    }
}