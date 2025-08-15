package com.gentech.bank.service;

import com.gentech.bank.dto.SavingAccountDto;
import com.gentech.bank.entity.SavingAccount;

import java.util.List;

public interface SavingAccountService {

    SavingAccountDto createSavingAccount(SavingAccountDto savingAccountDto);

    SavingAccountDto getSavingAccount(Long id);

    List<SavingAccountDto> getAllSAvingAccount();

    SavingAccountDto creditSavingAccount(Long id, double amount);

    SavingAccountDto debitSavingAccount(Long id, double amount);

    void deleteSavingAccount(Long id);

}
