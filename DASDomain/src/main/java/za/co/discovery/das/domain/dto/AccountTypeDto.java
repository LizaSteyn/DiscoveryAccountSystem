package za.co.discovery.das.domain.dto;

import za.co.discovery.das.domain.persistence.Account;
import za.co.discovery.das.domain.persistence.Account_Type;
import java.io.Serializable;
import java.util.List;

public class AccountTypeDto implements Serializable {
    private static final long serialVersionUID = 2337084268466643164L;
    private String accountTypeDescription;

    public AccountTypeDto() {
    }

    public AccountTypeDto(String accountTypeDescription) {
        this.accountTypeDescription = accountTypeDescription;
    }

    public AccountTypeDto(Account_Type accountType) {
        this.setAccountTypeDescription(accountType.getAccountDescription());
    }

    public String getAccountTypeDescription() {
        return accountTypeDescription;
    }

    public void setAccountTypeDescription(String accountTypeDescription) {
        this.accountTypeDescription = accountTypeDescription;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
