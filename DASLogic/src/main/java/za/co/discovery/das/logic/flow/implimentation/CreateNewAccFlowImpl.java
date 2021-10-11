package za.co.discovery.das.logic.flow.implimentation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import za.co.discovery.das.domain.dto.AccountDto;
import za.co.discovery.das.domain.dto.AccountTypeDto;
import za.co.discovery.das.domain.dto.MemberDto;
import za.co.discovery.das.logic.flow.CreateNewAccFlow;
import za.co.discovery.das.translator.flow.AccountTypeTranslator;
import za.co.discovery.das.translator.flow.MemberTranslator;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Component
public class CreateNewAccFlowImpl implements CreateNewAccFlow {
    private static final Logger LOGGER = LoggerFactory.getLogger(CreateNewTransFlowImpl.class);
    private final MemberTranslator memberTranslator;
    private final AccountTypeTranslator accountTypeTranslator;

    @Autowired
    public CreateNewAccFlowImpl(MemberTranslator memberTranslator, AccountTypeTranslator accountTypeTranslator) {
        this.memberTranslator = memberTranslator;
        this.accountTypeTranslator = accountTypeTranslator;
    }

    @Override
    public List<AccountTypeDto> getAllAccountTypes() {
        return accountTypeTranslator.getAllAccountTypes();
    }

    @Override
    public List<MemberDto> getAllMembers() {
        return memberTranslator.getAllMembers();
    }

    @Override
    public AccountDto createAccount(AccountDto accountDto) {
        return null;
    }
}
