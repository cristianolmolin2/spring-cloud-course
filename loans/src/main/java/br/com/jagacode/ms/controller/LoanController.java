package br.com.jagacode.ms.controller;

import br.com.jagacode.ms.model.Customer;
import br.com.jagacode.ms.model.Loan;
import br.com.jagacode.ms.repository.LoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LoanController {

    @Autowired
    private LoanRepository loanRepository;

    @PostMapping("/myLoans")
    public List<Loan> getLoansDetails(@RequestBody Customer customer){
        List<Loan> loans = loanRepository.findByCustomerIdOrderByStartDtDesc(customer.getCustomerId());
        if(loans != null){
            return loans;
        }
        return null;
    }
}
