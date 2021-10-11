package za.co.discovery.das.logic.flow.implimentation;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import za.co.discovery.das.domain.dto.AccountDto;

import java.util.List;

import static org.junit.Assert.*;

public class ShowAccountBalanceFlowImplTest {
    private ShowAccountBalanceFlowImpl showAccountBalanceFlowTest;

    @Before
    public void setUp() throws Exception {
        showAccountBalanceFlowTest = new ShowAccountBalanceFlowImpl(null);
    }

    @After
    public void tearDown() throws Exception {
        showAccountBalanceFlowTest = null;
    }

    @Test
    public void getAccountBalances() {
        List<AccountDto> balances = showAccountBalanceFlowTest.getAccountBalances();
        assertNotNull(balances);
    }

    @Test
    public void getAccountBalancesQuery() {
        List<Float> balances = (List<Float>) showAccountBalanceFlowTest.getAccountBalancesQuery(Float.parseFloat("0"));
        assertNotNull(balances);
    }
}