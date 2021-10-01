package za.co.discovery.das.domain.persistence;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "ACCOUNT", schema = "DISCOVERY")
public class Account implements Serializable{
    private static final long serialVersionUID = 8635203948340305228L;
    private Long accountID;
    private Member memberID;
    private Currency currencyType;
    private Account_Type accountTypeDescription;
    private Float accountBalance;
    private Set<Transaction> transAccountID;

    public Account() {
    }

    public Account(Long accountID, Member memberID, Currency currencyType, Account_Type accountTypeDescription, Float accountBalance) {
        this.accountID = accountID;
        this.memberID = memberID;
        this.currencyType = currencyType;
        this.accountTypeDescription = accountTypeDescription;
        this.accountBalance = accountBalance;
    }

    @Id
    @SequenceGenerator(name = "Account_Seq", sequenceName = "DISCOVERY.Account_Seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Account_Seq")
    @Column(name = "Account_ID")
    public Long getAccountID() {
        return accountID;
    }

    public void setAccountID(Long accountID) {
        this.accountID = accountID;
    }

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "Member_ID")
    public Member getMemberID() {
        return memberID;
    }

    public void setMemberID(Member memberID) {
        this.memberID = memberID;
    }

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "Currency_ID")
    public Currency getCurrencyType() {
        return currencyType;
    }

    public void setCurrencyType(Currency currencyType) {
        this.currencyType = currencyType;
    }

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "Acc_Type_ID")
    public Account_Type getAccountTypeDescription() {
        return accountTypeDescription;
    }

    public void setAccountTypeDescription(Account_Type accountTypeDescription) {
        this.accountTypeDescription = accountTypeDescription;
    }

    @Column(name = "Account_Balance")
    public Float getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(Float accountBalance) {
        this.accountBalance = accountBalance;
    }

    @OneToMany(targetEntity = Transaction.class, fetch = FetchType.LAZY, mappedBy = "transAccountID", orphanRemoval = true, cascade = CascadeType.PERSIST)
    public Set<Transaction> getTransAccountID() {
        return transAccountID;
    }

    public void setTransAccountID(Set<Transaction> transAccountID) {
        this.transAccountID = transAccountID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(accountID, account.accountID) && Objects.equals(memberID, account.memberID) && Objects.equals(currencyType, account.currencyType) && Objects.equals(accountTypeDescription, account.accountTypeDescription) && Objects.equals(accountBalance, account.accountBalance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountID, memberID, currencyType, accountTypeDescription, accountBalance);
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountID=" + accountID +
                ", memberID=" + memberID +
                ", currencyType=" + currencyType +
                ", accountTypeDescription=" + accountTypeDescription +
                ", accountBalance=" + accountBalance +
                '}';
    }
}
