package za.co.discovery.das.domain.persistence;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "RATE", schema = "DISCOVERY")
public class Rate implements Serializable{
    private static final long serialVersionUID = -334666464688435332L;
    private Long rateID;
    private Currency rateCurrencyID;
    private LocalDate rateDate;
    private Float rateConversion;
    private Set<Transaction> transRateID;

    public Rate() {
    }

    public Rate(Long rateID, Currency rateCurrencyID, LocalDate rateDate, Float rateConversion) {
        this.rateID = rateID;
        this.rateCurrencyID = rateCurrencyID;
        this.rateDate = rateDate;
        this.rateConversion = rateConversion;
    }

    @Id
    @SequenceGenerator(name = "Rate_Seq", sequenceName = "DISCOVERY.Rate_Seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Rate_Seq")
    @Column(name = "Rate_ID")
    public Long getRateID() {
        return rateID;
    }

    public void setRateID(Long rateID) {
        this.rateID = rateID;
    }

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "Currency_ID")
    public Currency getRateCurrencyID() {
        return rateCurrencyID;
    }

    public void setRateCurrencyID(Currency rateCurrencyID) {
        this.rateCurrencyID = rateCurrencyID;
    }

    @Column(name = "Rate_Date")
    public LocalDate getRateDate() {
        return rateDate;
    }

    public void setRateDate(LocalDate rateDate) {
        this.rateDate = rateDate;
    }

    @Column(name = "Rate_Conversion")
    public Float getRateConversion() {
        return rateConversion;
    }

    public void setRateConversion(Float rateConversion) {
        this.rateConversion = rateConversion;
    }

    @OneToMany(targetEntity = Transaction.class, fetch = FetchType.LAZY, mappedBy = "transRateID", orphanRemoval = true, cascade = CascadeType.PERSIST)
    public Set<Transaction> getTransRateID() {
        return transRateID;
    }

    public void setTransRateID(Set<Transaction> transRateID) {
        this.transRateID = transRateID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rate rate = (Rate) o;
        return Objects.equals(rateID, rate.rateID) && Objects.equals(rateCurrencyID, rate.rateCurrencyID) && Objects.equals(rateDate, rate.rateDate) && Objects.equals(rateConversion, rate.rateConversion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rateID, rateCurrencyID, rateDate, rateConversion);
    }

    @Override
    public String toString() {
        return "Rate{" +
                "rateID=" + rateID +
                ", rateCurrencyID=" + rateCurrencyID +
                ", rateDate=" + rateDate +
                ", rateConversion=" + rateConversion +
                '}';
    }
}
