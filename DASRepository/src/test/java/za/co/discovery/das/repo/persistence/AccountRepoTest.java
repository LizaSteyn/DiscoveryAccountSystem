package za.co.discovery.das.repo.persistence;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.expression.spel.ast.NullLiteral;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import za.co.discovery.das.domain.persistence.Account;
import za.co.discovery.das.repo.config.RepoTestConfig;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@DataJpaTest
@ContextConfiguration(classes = {RepoTestConfig.class})
public class AccountRepoTest {

    @Autowired
    AccountRepo accountRepo;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getAccountBalancesQuery() {
        List<Float> balances = (List<Float>) accountRepo.getAccountBalancesQuery(Float.parseFloat("0"));
        assertNotNull(balances);
    }

}