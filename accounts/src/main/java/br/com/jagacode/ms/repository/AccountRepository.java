package br.com.jagacode.ms.repository;

import br.com.jagacode.ms.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {

    Account findByCustomerId(int customerId);

}
