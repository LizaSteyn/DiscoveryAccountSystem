package za.co.discovery.das.domain.persistence;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "CURRENCY", schema = "DISCOVERY")
public class Currency implements Serializable{
    private static final long serialVersionUID = 2625473651181791238L;
    private Long currencyID;
    private String currencyType;
    private Set<Account> accountCurrencyID;
    private Set<Rate> rateCurrencyID;


    public Currency() {
    }

    public Currency(Long currencyID, String currencyType) {
        this.currencyID = currencyID;
        this.currencyType = currencyType;
    }

    @Id
    @SequenceGenerator(name = "Currency_Seq", sequenceName = "DISCOVERY.Currency_ID", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Currency_Seq")
    @Column(name = "Currency_ID")
    public Long getCurrencyID() {
        return currencyID;
    }

    public void setCurrencyID(Long currencyID) {
        this.currencyID = currencyID;
    }

    @Column(name = "Currency_Type")
    public String getCurrencyType() {
        return currencyType;
    }

    public void setCurrencyType(String currencyType) {
        this.currencyType = currencyType;
    }

    @OneToMany(targetEntity = Account.class, fetch = FetchType.LAZY, mappedBy = "currencyType", orphanRemoval = true)
    public Set<Account> getAccountCurrencyID() {
        return accountCurrencyID;
    }

    public void setAccountCurrencyID(Set<Account> accountCurrencyID) {
        this.accountCurrencyID = accountCurrencyID;
    }

    @OneToMany(targetEntity = Rate.class, fetch = FetchType.LAZY, mappedBy = "rateCurrencyID", orphanRemoval = true)
    public Set<Rate> getRateCurrencyID() {
        return rateCurrencyID;
    }

    public void setRateCurrencyID(Set<Rate> rateCurrencyID) {
        this.rateCurrencyID = rateCurrencyID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Currency currency = (Currency) o;
        return Objects.equals(currencyID, currency.currencyID) && Objects.equals(currencyType, currency.currencyType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currencyID, currencyType);
    }

    @Override
    public String toString() {
        return "Currency{" +
                "currencyID=" + currencyID +
                ", currencyType='" + currencyType + '\'' +
                '}';
    }
}
