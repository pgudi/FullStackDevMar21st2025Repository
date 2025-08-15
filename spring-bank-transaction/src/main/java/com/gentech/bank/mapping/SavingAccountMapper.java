package com.gentech.bank.mapping;

import com.gentech.bank.dto.SavingAccountDto;
import com.gentech.bank.entity.SavingAccount;

public class SavingAccountMapper {

    public static SavingAccountDto mapToSavingAccountDto(SavingAccount savingAccount)
    {
        SavingAccountDto savingAccountDto=new SavingAccountDto(
                savingAccount.getId(),
                savingAccount.getAccountHolderName(),
                savingAccount.getBalance(),
                savingAccount.getCreatedDate(),
                savingAccount.getModifiedDate()
        );
        return savingAccountDto;
    }

    public static SavingAccount mapToSavingAccount(SavingAccountDto savingAccountDto)
    {
        SavingAccount savingAccount=new SavingAccount(
                savingAccountDto.getId(),
                savingAccountDto.getAccountHolderName(),
                savingAccountDto.getBalance(),
                savingAccountDto.getCreatedDate(),
                savingAccountDto.getModifiedDate()
        );
        return savingAccount;
    }
}
