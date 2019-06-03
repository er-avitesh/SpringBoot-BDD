package com.project.brownbag;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

	@Autowired
	AccountRepo repo;

	public Iterable<Account> fetchAllAccounts() {
		Iterable<Account> accounts = repo.findAll();
		return accounts;
	}

	public Optional<Account> fetchAccount(int CustomerID) {
		Optional<Account> account = repo.findById(CustomerID);
		return account;
	}
}
