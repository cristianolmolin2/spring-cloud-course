package br.com.jagacode.ms.controller;

import br.com.jagacode.ms.model.Account;
import br.com.jagacode.ms.model.Customer;
import br.com.jagacode.ms.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountsController {

    @Autowired
    private AccountRepository accountRepository;

    @PostMapping("/myAccount")
    public Account getAccountDetails(@RequestBody Customer customer){
        Account account = accountRepository.findByCustomerId(customer.getCustomerId());
        if(account != null){
            return account;
        }
        return null;
    }
}
