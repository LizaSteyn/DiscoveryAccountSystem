package za.co.discovery.das.logic.flow.implimentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import za.co.discovery.das.domain.dto.AccountTypeDto;
import za.co.discovery.das.logic.flow.FetchAccountTypeFlow;
import za.co.discovery.das.translator.flow.AccountTypeTranslator;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Transactional
@Component
public class FetchAccountTypeFlowImpl implements FetchAccountTypeFlow {
    private final AccountTypeTranslator accountTypeTranslator;

    @Autowired
    public FetchAccountTypeFlowImpl(AccountTypeTranslator accountTypeTranslator){
        this.accountTypeTranslator = accountTypeTranslator;
    }

    @Override
    public List<AccountTypeDto> getAllAccountTypes() {
       List<AccountTypeDto> accountTypeDto = new ArrayList<>();
       accountTypeDto.add(new AccountTypeDto("Miles"));
       return accountTypeDto;
       //return accountTypeTranslator.getAllAccountTypes();
    }
}
