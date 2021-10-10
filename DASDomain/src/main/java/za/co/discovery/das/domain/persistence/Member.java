package za.co.discovery.das.domain.persistence;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "MEMBER", schema = "DISCOVERY")
public class Member implements Serializable{
    private static final long serialVersionUID = 599643671671255597L;
    private Long memberID;
    private Set<Account> accountMemberID;

    public Member() {
    }

    public Member(Long memberID) {
        this.memberID = memberID;
    }

    @Id
    @SequenceGenerator(name = "Member_Seq", sequenceName = "DISCOVERY.Member_Seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Member_Seq")
    @Column(name = "Member_ID")
    public Long getMemberID() {
        return memberID;
    }

    public void setMemberID(Long memberID) {
        this.memberID = memberID;
    }

    @OneToMany(targetEntity = Account.class, fetch = FetchType.LAZY, mappedBy = "memberID", orphanRemoval = true)
    public Set<Account> getAccountMemberID(){
        return accountMemberID;
    }

    public void setAccountMemberID(Set<Account> accountMemberID) {
        this.accountMemberID = accountMemberID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return Objects.equals(memberID, member.memberID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(memberID);
    }

    @Override
    public String toString() {
        return "Member{" +
                "memberID=" + memberID +
                '}';
    }
}
