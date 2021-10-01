package za.co.discovery.das.domain.persistence;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "TRANSACTION", schema = "DISCOVERY")
public class Transaction implements Serializable{
    private static final long serialVersionUID = -5313612008686843237L;
    private Long transactionID;
    private Account transAccountID;
    private Rate transRateID;
    private Float transAmount;
    private LocalDate transDate;

    public Transaction() {
    }

    public Transaction(Long transactionID, Account transAccountID, Rate transRateID, Float transAmount, LocalDate transDate) {
        this.transactionID = transactionID;
        this.transAccountID = transAccountID;
        this.transRateID = transRateID;
        this.transAmount = transAmount;
        this.transDate = transDate;
    }

    @Id
    @SequenceGenerator(name = "Transaction_Seq", sequenceName = "DISCOVERY.Transaction_Seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Transaction_Seq")
    @Column(name = "Transaction_ID")
    public Long getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(Long transactionID) {
        this.transactionID = transactionID;
    }

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "Account_ID")
    public Account getTransAccountID() {
        return transAccountID;
    }

    public void setTransAccountID(Account transAccountID) {
        this.transAccountID = transAccountID;
    }

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "Rate_ID")
    public Rate getTransRateID() {
        return transRateID;
    }

    public void setTransRateID(Rate transRateID) {
        this.transRateID = transRateID;
    }

    @Column(name = "Transaction_Amount")
    public Float getTransAmount() {
        return transAmount;
    }

    public void setTransAmount(Float transAmount) {
        this.transAmount = transAmount;
    }

    @Column(name = "Transaction_Date")
    public LocalDate getTransDate() {
        return transDate;
    }

    public void setTransDate(LocalDate transDate) {
        this.transDate = transDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transaction that = (Transaction) o;
        return Objects.equals(transactionID, that.transactionID) && Objects.equals(transAccountID, that.transAccountID) && Objects.equals(transRateID, that.transRateID) && Objects.equals(transAmount, that.transAmount) && Objects.equals(transDate, that.transDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(transactionID, transAccountID, transRateID, transAmount, transDate);
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "transactionID=" + transactionID +
                ", transAccountID=" + transAccountID +
                ", transRateID=" + transRateID +
                ", transAmount=" + transAmount +
                ", transDate=" + transDate +
                '}';
    }
}
