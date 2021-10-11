package za.co.discovery.das.logic.flow;

import za.co.discovery.das.domain.dto.AccountDto;
import java.util.List;

public interface ShowAccountBalanceFlow {
    List<AccountDto> getAccountBalances();
    AccountDto getAccountBalancesQuery(Float balance);
}
