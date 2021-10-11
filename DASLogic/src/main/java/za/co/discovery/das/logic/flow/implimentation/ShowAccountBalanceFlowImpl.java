package za.co.discovery.das.logic.flow.implimentation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import za.co.discovery.das.domain.dto.AccountDto;
import za.co.discovery.das.logic.flow.ShowAccountBalanceFlow;
import za.co.discovery.das.translator.flow.AccountTranslator;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Component
public class ShowAccountBalanceFlowImpl implements ShowAccountBalanceFlow {
    private static final Logger LOGGER = LoggerFactory.getLogger(ShowAccountBalanceFlowImpl.class);
    private final AccountTranslator accountTranslator;

    @Autowired
    public ShowAccountBalanceFlowImpl(AccountTranslator accountTranslator) {
        this.accountTranslator = accountTranslator;
    }

    @Override
    public List<AccountDto> getAccountBalances() {
        return accountTranslator.getAccountBalances();
    }

    @Override
    public AccountDto getAccountBalancesQuery(Float balance) {
        return accountTranslator.getAccountBalancesQuery(balance);
    }
}
