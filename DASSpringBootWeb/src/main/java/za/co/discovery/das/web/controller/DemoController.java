package za.co.discovery.das.web.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import za.co.discovery.das.domain.dto.AccountDto;
import za.co.discovery.das.domain.dto.AccountTypeDto;
import za.co.discovery.das.domain.service.GeneralResponse;
import za.co.discovery.das.logic.flow.CreateNewAccFlow;
import za.co.discovery.das.logic.flow.FetchAccountTypeFlow;
import za.co.discovery.das.logic.flow.ShowAccountBalanceFlow;

import java.util.List;

@RestController
@RequestMapping("account")
public class DemoController {

    private final FetchAccountTypeFlow fetchAccountTypeFlow;
    private final ShowAccountBalanceFlow showAccountBalanceFlow;
    private final CreateNewAccFlow createNewAccFlow;

    @Autowired
    public DemoController(FetchAccountTypeFlow fetchAccountTypeFlow, ShowAccountBalanceFlow showAccountBalanceFlow, CreateNewAccFlow createNewAccFlow){
        this.fetchAccountTypeFlow = fetchAccountTypeFlow;
        this.showAccountBalanceFlow = showAccountBalanceFlow;
        this.createNewAccFlow = createNewAccFlow;
    }

    @GetMapping("/allAccounts")
    @ApiOperation(value = "Gets all the configured account types.", notes = "Returns a list of account types.")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Account types returned.", response = GeneralResponse.class),
            @ApiResponse(code = 400, message = "Bad Request", response = GeneralResponse.class),
            @ApiResponse(code = 404, message = "Not Found", response = GeneralResponse.class),
            @ApiResponse(code = 500, message = "Internal Server Error", response = GeneralResponse.class)
    })

    public ResponseEntity<GeneralResponse<List<AccountTypeDto>>> getAll() {
        List<AccountTypeDto> accountTypes = fetchAccountTypeFlow.getAllAccountTypes();
        GeneralResponse<List<AccountTypeDto>> response = new GeneralResponse<>(true, accountTypes);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
    @PostMapping("")
    @ApiOperation(value = "Create new account.", notes = "Creates a new account in the database.")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Account was successfully created.", response = GeneralResponse.class),
            @ApiResponse(code = 400, message = "Bad Request", response = GeneralResponse.class),
            @ApiResponse(code = 500, message = "Internal Server Error", response = GeneralResponse.class)
    })

    public ResponseEntity<GeneralResponse<AccountDto>> createAccount(
            @ApiParam(value = "Request information to create a new Account.",
                      required = true)
            @RequestBody AccountDto accountDto) {
        AccountDto accountResponse = createNewAccFlow.createAccount(accountDto);
        GeneralResponse<AccountDto> response = new GeneralResponse<>(true, accountResponse);
        return new ResponseEntity<>(response,HttpStatus.OK);
    }

    @GetMapping({"/accountBalance"})
    @ApiOperation(value = "Retrieves account balanances.", notes = "Retrieves account balances according to member ID.")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Account balances returned.", response = GeneralResponse.class),
            @ApiResponse(code = 400, message = "Bad Request", response = GeneralResponse.class),
            @ApiResponse(code = 404, message = "Resource not Found", response = GeneralResponse.class),
            @ApiResponse(code = 500, message = "Internal Server Error", response = GeneralResponse.class)
    })
    public ResponseEntity<GeneralResponse<AccountDto>> getBalances(
            @ApiParam(value = "Is the balance of the account.",
                      example = "0.00",
                      name = "accountBalance",
                      required = true)
            @PathVariable("balance") final Float balance) {
        AccountDto accountDto = showAccountBalanceFlow.getAccountBalancesQuery(balance);
        GeneralResponse<AccountDto> response = new GeneralResponse<>(true, accountDto);
        return new ResponseEntity<>(response,HttpStatus.OK);
    }
}
