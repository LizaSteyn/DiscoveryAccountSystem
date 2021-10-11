package za.co.discovery.das.translator.flow;

import za.co.discovery.das.domain.dto.MemberDto;
import java.util.List;

public interface MemberTranslator {
    List<MemberDto> getAllMembers();
}
