package za.co.discovery.das.logic.flow;
import za.co.discovery.das.domain.dto.AccountDto;
import za.co.discovery.das.domain.dto.AccountTypeDto;
import za.co.discovery.das.domain.dto.MemberDto;
import java.util.List;

public interface CreateNewAccFlow {

    List<AccountTypeDto> getAllAccountTypes();
    List<MemberDto> getAllMembers();
    AccountDto createAccount(AccountDto accountDto);
}
