package com.gentech.bank.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SavingAccountDto {
    private Long id;
    private String accountHolderName;
    private double balance;
    private Date createdDate;
    private Date modifiedDate;
}
