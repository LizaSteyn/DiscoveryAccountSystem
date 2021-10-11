package za.co.discovery.das.translator.flow.implimentation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import za.co.discovery.das.domain.dto.MemberDto;
import za.co.discovery.das.domain.persistence.Member;
import za.co.discovery.das.repo.persistence.MemberRepo;
import za.co.discovery.das.translator.flow.MemberTranslator;
import java.util.ArrayList;
import java.util.List;

@Component
public class MemberTranslatorImp implements MemberTranslator {
    private static final Logger LOGGER = LoggerFactory.getLogger(MemberTranslatorImp.class);
    private final MemberRepo memberRepo;

    @Autowired
    public MemberTranslatorImp(MemberRepo memberRepo) {
        this.memberRepo = memberRepo;
    }

    public List<MemberDto> getAllMembers(){
        List<MemberDto> memberDtos = new ArrayList<>();
        try {
            for (Member member : memberRepo.findAll()){
                memberDtos.add(new MemberDto(member));
            }
        }
        catch (RuntimeException e) {
            throw new RuntimeException("Unable to read from the database", e);
        }
        return memberDtos;
    }

}
