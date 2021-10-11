package za.co.discovery.das.translator.flow.implimentation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import za.co.discovery.das.domain.dto.AccountDto;
import za.co.discovery.das.domain.persistence.Account;
import za.co.discovery.das.repo.persistence.AccountRepo;
import za.co.discovery.das.translator.flow.AccountTranslator;
import java.util.List;

@Component
public class AccountTranslatorImpl implements AccountTranslator {
    private static final Logger LOGGER = LoggerFactory.getLogger(AccountTranslatorImpl.class);
    private final AccountRepo accountRepo;

    public AccountTranslatorImpl(AccountRepo accountRepo) {
        this.accountRepo = accountRepo;
    }


    @Override
    public List<AccountDto> getAccountBalances() {
        return null;
    }

    @Override
    public AccountDto getAccountBalancesQuery(Float balance) {
        try{
            Account account = accountRepo.getAccountBalancesQuery(balance);
            return new AccountDto(account);
        }
        catch (Exception e)
        {
            throw new RuntimeException("Unable to read from the database.", e);
        }
    }
}
