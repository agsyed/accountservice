package com.chivano.apps.accountservice.controller;

import com.chivano.apps.accountservice.model.Account;
import com.chivano.apps.accountservice.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    AccountService accountService;

    @GetMapping("/test")
    public String test() {
        return "Account are in good condition";
    }


    @PostMapping("/")
    public ResponseEntity<Account> createAccount(@RequestBody Account account) {
        return ResponseEntity.ok(this.accountService.upsertAccount(account));
    }

    @GetMapping("/")
    public ResponseEntity<List<Account>> getAllAccount() {
        return ResponseEntity.ok(this.accountService.getAllAccount());
    }
}