package za.co.discovery.das.translator.flow;

import za.co.discovery.das.domain.dto.AccountDto;
import java.util.List;

public interface AccountTranslator {
    List<AccountDto> getAccountBalances();
    AccountDto getAccountBalancesQuery(Float balance);
}
