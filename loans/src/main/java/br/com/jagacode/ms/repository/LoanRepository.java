package br.com.jagacode.ms.repository;

import br.com.jagacode.ms.model.Loan;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LoanRepository extends JpaRepository<Loan, Long> {
    List<Loan> findByCustomerIdOrderByStartDtDesc(int customerId);
}
