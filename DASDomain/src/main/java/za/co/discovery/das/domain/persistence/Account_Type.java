package za.co.discovery.das.domain.persistence;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "ACCOUNT_TYPE", schema = "DISCOVERY")
public class Account_Type implements Serializable{
    private static final long serialVersionUID = -1945413139916878452L;
    private Long accountTypeID;
    private String accountDescription;
    private Set<Account> accountID;

    public Account_Type() {
    }

    public Account_Type(Long accountTypeID, String accountDescription) {
        this.accountTypeID = accountTypeID;
        this.accountDescription = accountDescription;
    }

    @Id
    @SequenceGenerator(name = "Account_Type_Seq", sequenceName = "DISCOVERY.Account_Type_Seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Account_Type_Seq")
    @Column(name = "Acc_Type_ID")
    public Long getAccountTypeID() {
        return accountTypeID;
    }

    public void setAccountTypeID(Long accountTypeID) {
        this.accountTypeID = accountTypeID;
    }

    @Column(name = "Acc_Type_Description")
    public String getAccountDescription() {
        return accountDescription;
    }

    public void setAccountDescription(String accountDescription) {
        this.accountDescription = accountDescription;
    }

    @OneToMany(targetEntity = Account.class, fetch = FetchType.LAZY, mappedBy = "accountType", orphanRemoval = true)
    public Set<Account> getAccountID() {
        return accountID;
    }

    public void setAccountID(Set<Account> accountID) {
        this.accountID = accountID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account_Type that = (Account_Type) o;
        return Objects.equals(accountTypeID, that.accountTypeID) && Objects.equals(accountDescription, that.accountDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountTypeID, accountDescription);
    }

    @Override
    public String toString() {
        return "Account_Type{" +
                "accountTypeID=" + accountTypeID +
                ", accountDescription='" + accountDescription + '\'' +
                '}';
    }
}
