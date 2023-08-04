package com.chivano.apps.accountservice.repository;

import com.chivano.apps.accountservice.model.Account;
import org.springframework.data.repository.CrudRepository;

public interface AccountRepository extends CrudRepository<Account, Integer> {
}
