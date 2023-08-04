package com.chivano.apps.accountservice.service;

import com.chivano.apps.accountservice.model.Account;
import com.chivano.apps.accountservice.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AccountService {

    @Autowired
    AccountRepository accountRepository;

    public List<Account> getAllAccount() {
//        return new ArrayList<Account>() {{
//            add(new Account() {{
//                setId(1);
//                setDisplayName("Syed");
//            }});
//            add(new Account() {{
//                setId(2);
//                setDisplayName("Chullis");
//            }});
//        }};
        List<Account> accounts = new ArrayList<Account>();
        this.accountRepository.findAll().forEach(account -> accounts.add(account));
        return accounts;
    }

    public Account upsertAccount(Account account) {
        return this.accountRepository.save(account);
    }

}
