package za.co.discovery.das.domain.dto;

import za.co.discovery.das.domain.persistence.Account;
import za.co.discovery.das.domain.persistence.Account_Type;
import za.co.discovery.das.domain.persistence.Currency;
import java.io.Serializable;

public class AccountDto implements Serializable {
    private static final long serialVersionUID = -5295761932141640569L;
    private String accountDescription;
    private String currency;
    private Float accountBalance;

    public AccountDto() {
    }

    public AccountDto(String accountDescription, String currency, Float accountBalance) {
        this.accountDescription = accountDescription;
        this.currency = currency;
        this.accountBalance = accountBalance;
    }

    public AccountDto(Account account) {
    }

    public String getAccountDescription() {
        return accountDescription;
    }

    public void setAccountDescription(String accountDescription) {
        this.accountDescription = accountDescription;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Float getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(Float accountBalance) {
        this.accountBalance = accountBalance;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
