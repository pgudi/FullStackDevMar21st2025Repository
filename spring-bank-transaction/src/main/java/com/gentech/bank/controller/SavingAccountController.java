package com.gentech.bank.controller;

import com.gentech.bank.dto.SavingAccountDto;
import com.gentech.bank.service.SavingAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class SavingAccountController {

    @Autowired
    private SavingAccountService service;

    @PostMapping("/accounts")
    public ResponseEntity<SavingAccountDto>  createSAvingAccount(@RequestBody SavingAccountDto savingAccountDto)
    {
        return new ResponseEntity<>(service.createSavingAccount(savingAccountDto), HttpStatus.CREATED);
    }

    @GetMapping("/accounts/{id}")
    public ResponseEntity<SavingAccountDto> getSavingAccountById(@PathVariable Long id)
    {
        return new ResponseEntity<>(service.getSavingAccount(id), HttpStatus.OK);
    }

    @GetMapping("/accounts")
    public ResponseEntity<List<SavingAccountDto>> getAllSavingAccounts()
    {
        return new ResponseEntity<>(service.getAllSAvingAccount(), HttpStatus.OK);
    }

    @PostMapping("/accounts/credit/{id}")
    public ResponseEntity<SavingAccountDto> creditSavingAccount(@PathVariable Long id, @RequestBody Map<String, Double> obj)
    {
        return  new ResponseEntity<>(service.creditSavingAccount(id,obj.get("amount")), HttpStatus.OK);
    }

    @PostMapping("/accounts/debit/{id}")
    public ResponseEntity<SavingAccountDto> debitSavingAccount(@PathVariable Long id, @RequestBody Map<String, Double> obj)
    {
        return  new ResponseEntity<>(service.creditSavingAccount(id,obj.get("amount")), HttpStatus.OK);
    }

    @DeleteMapping("/accounts/{id}")
    public ResponseEntity<String> deleteSavingAccountById(@PathVariable Long id)
    {
        service.deleteSavingAccount(id);
        return new ResponseEntity<>("The SavingAccount has id "+id+" has deleted successfully", HttpStatus.OK);
    }

}
