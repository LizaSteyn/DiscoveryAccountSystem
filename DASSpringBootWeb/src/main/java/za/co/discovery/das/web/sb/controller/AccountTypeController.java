package za.co.discovery.das.web.sb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import za.co.discovery.das.domain.service.GeneralResponse;


@RestController
public class AccountTypeController {
    @GetMapping("/all")
    public GeneralResponse<String> getAll() {
        return new GeneralResponse<String> (true, "No payload found.");
    }
}
