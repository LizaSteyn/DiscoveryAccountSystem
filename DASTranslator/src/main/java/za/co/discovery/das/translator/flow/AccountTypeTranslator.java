package za.co.discovery.das.translator.flow;

import za.co.discovery.das.domain.dto.AccountTypeDto;
import java.util.List;

public interface AccountTypeTranslator {
    List<AccountTypeDto> getAllAccountTypes();
}
