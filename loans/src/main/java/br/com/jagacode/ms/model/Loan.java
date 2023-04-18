package br.com.jagacode.ms.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Entity
@Getter @Setter @ToString
public class Loan {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "loan_number")
    private int loanNumber;

    @Column(name = "customer_id")
    private int customerId;

    @Column(name = "start_dt")
    private LocalDate startDt;

    @Column(name = "loan_type")
    private String loanType;

    @Column(name = "total_loan")
    private int totalLoan;

    @Column(name = "amount_paid")
    private int amountPaid;

    @Column(name = "outstanding_amount")
    private int outstanding_amount;

    @Column(name = "create_dt")
    private String createDt;

}
