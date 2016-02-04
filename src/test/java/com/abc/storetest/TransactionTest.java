package com.abc.storetest;

import org.junit.Test;
import com.abc.account.Account;
import com.abc.product.Apple;
import com.abc.transaction.Transaction;
import static org.junit.Assert.assertTrue;

public class TransactionTest {

	@Test
	public void transaction() {
		Transaction t = new Transaction(new Apple(), Account.ADD);
		assertTrue(t instanceof Transaction);
	}

}
