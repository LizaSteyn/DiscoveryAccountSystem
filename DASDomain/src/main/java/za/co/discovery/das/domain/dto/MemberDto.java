package za.co.discovery.das.domain.dto;

import za.co.discovery.das.domain.persistence.Member;

import java.io.Serializable;

public class MemberDto implements Serializable {

    private static final long serialVersionUID = 6047103020475269791L;
    private static Long memberID;

    public MemberDto() {
    }

    public MemberDto(Long memberID) {
        this.memberID = memberID;
    }

    public MemberDto(Member memberID) {
        this.setMemberID(memberID.getMemberID());
    }

    public static Long getMemberID() {
        return memberID;
    }

    public void setMemberID(Long memberID) {
        this.memberID = memberID;
    }


    @Override
    public String toString() {
        return super.toString();
    }
}
