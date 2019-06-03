package com.project.brownbag;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class AppController {

	@Autowired
	AccountService worker;

	@RequestMapping(value = "/getAllAccounts", method = RequestMethod.GET)
	public Iterable<Account> getAllAccounts() {
		return worker.fetchAllAccounts();
	}

	@RequestMapping(value = "/getAccount/{CustomerID}", method = RequestMethod.GET, produces = "application/json")
	public Optional<Account> getAccount(@PathVariable int CustomerID) {
		return worker.fetchAccount(CustomerID);
	}
}
