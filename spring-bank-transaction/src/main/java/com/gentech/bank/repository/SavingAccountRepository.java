package com.gentech.bank.repository;

import com.gentech.bank.entity.SavingAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SavingAccountRepository extends JpaRepository<SavingAccount, Long> {
}
