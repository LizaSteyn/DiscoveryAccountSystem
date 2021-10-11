package za.co.discovery.das.translator.flow.implimentation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import za.co.discovery.das.domain.dto.AccountTypeDto;
import za.co.discovery.das.domain.persistence.Account_Type;
import za.co.discovery.das.repo.persistence.AccountTypeRepo;
import za.co.discovery.das.translator.flow.AccountTypeTranslator;

import java.util.ArrayList;
import java.util.List;

@Component
public class AccountTypeTranslatorImp implements AccountTypeTranslator {
    private static final Logger LOGGER = LoggerFactory.getLogger(AccountTypeTranslatorImp.class);
    private final AccountTypeRepo accountTypeRepo;

    @Autowired
    public AccountTypeTranslatorImp(AccountTypeRepo accountTypeRepo) {
        this.accountTypeRepo = accountTypeRepo;
    }

    @Override
    public List<AccountTypeDto> getAllAccountTypes() {
        List<AccountTypeDto> accountTypeDtos = new ArrayList<>();
        try{
            for (Account_Type accountType : accountTypeRepo.findAll()){
                accountTypeDtos.add(new AccountTypeDto(accountType));
            }
        }
        catch (Exception e) {
            throw new RuntimeException("Unable to read from the database", e);
        }
        return null;
    }
}
