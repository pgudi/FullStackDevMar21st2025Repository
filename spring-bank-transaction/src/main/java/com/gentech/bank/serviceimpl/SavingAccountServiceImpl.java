package com.gentech.bank.serviceimpl;

import com.gentech.bank.dto.SavingAccountDto;
import com.gentech.bank.entity.SavingAccount;
import com.gentech.bank.exception.ResourceNotFoundException;
import com.gentech.bank.mapping.SavingAccountMapper;
import com.gentech.bank.repository.SavingAccountRepository;
import com.gentech.bank.service.SavingAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SavingAccountServiceImpl implements SavingAccountService {

    @Autowired
    private SavingAccountRepository repository;


    @Override
    public SavingAccountDto createSavingAccount(SavingAccountDto savingAccountDto) {
        SavingAccount savingAccount =SavingAccountMapper.mapToSavingAccount(savingAccountDto);
        SavingAccount newSavingAccount=repository.save(savingAccount);
        return SavingAccountMapper.mapToSavingAccountDto(newSavingAccount);
    }

    @Override
    public SavingAccountDto getSavingAccount(Long id) {
        SavingAccount savingAccount=repository.findById(id).orElseThrow(() ->
                new ResourceNotFoundException("The Saving Account id :"+id+" has not Found !!"));

        return SavingAccountMapper.mapToSavingAccountDto(savingAccount);
    }

    @Override
    public List<SavingAccountDto> getAllSAvingAccount() {
        return repository.findAll().stream().map((savingAccount) -> SavingAccountMapper.mapToSavingAccountDto(savingAccount))
                .collect(Collectors.toList());
    }

    @Override
    public SavingAccountDto creditSavingAccount(Long id, double amount) {
        SavingAccount savingAccount=repository.findById(id).orElseThrow(() ->
                new ResourceNotFoundException("The Saving Account id :"+id+" has not Found !!"));

        double totalAmount=savingAccount.getBalance() + amount;
        savingAccount.setBalance(totalAmount);

        SavingAccount newSavingAccount=repository.save(savingAccount);
        return SavingAccountMapper.mapToSavingAccountDto(newSavingAccount);
    }

    @Override
    public SavingAccountDto debitSavingAccount(Long id, double amount) {
        SavingAccount savingAccount=repository.findById(id).orElseThrow(() ->
                new ResourceNotFoundException("The Saving Account id :"+id+" has not Found !!"));

        if(savingAccount.getBalance() < amount)
        {
            throw new RuntimeException("Insuffient Balanae in your Account!!!!");
        }

        double totalAmount=savingAccount.getBalance() - amount;
        savingAccount.setBalance(totalAmount);

        SavingAccount newSavingAccount=repository.save(savingAccount);
        return SavingAccountMapper.mapToSavingAccountDto(newSavingAccount);

    }

    @Override
    public void deleteSavingAccount(Long id) {
        repository.findById(id).orElseThrow(() ->
                new ResourceNotFoundException("The Saving Account id :"+id+" has not Found !!"));
        repository.deleteById(id);
    }


}
