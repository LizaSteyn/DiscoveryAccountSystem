package za.co.discovery.das.logic.flow;

import za.co.discovery.das.domain.dto.AccountTypeDto;
import java.util.List;

public interface FetchAccountTypeFlow {
    List<AccountTypeDto> getAllAccountTypes();
}
