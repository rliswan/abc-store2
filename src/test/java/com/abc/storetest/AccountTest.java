package com.abc.storetest;

import org.junit.Test;
import com.abc.account.Account;
import com.abc.account.AccountImpl;
import com.abc.product.Apple;
import com.abc.product.Banana;
import com.abc.product.Item;
import com.abc.product.Lemon;
import com.abc.product.Orange;
import com.abc.product.Peach;
import static org.junit.Assert.assertEquals;
import java.util.ArrayList;

public class AccountTest {
	private static final double DOUBLE_DELTA = 1e-15;

	@Test
	public void totalCost() {
		Account acct = new AccountImpl();
		acct.add(new Apple());
		acct.add(new Apple());
		acct.add(new Apple());
		acct.add(new Banana());
		assertEquals(7.00, acct.sumTransactions(), DOUBLE_DELTA);
	}

	@Test
	public void totalWithRemoveCost() {
		Account acct = new AccountImpl();
		acct.add(new Apple());
		acct.add(new Apple());
		acct.add(new Apple());
		acct.remove(new Apple());
		acct.add(new Banana());
		assertEquals(5.00, acct.sumTransactions(), DOUBLE_DELTA);
	}

	@Test
	public void totalCostWithBucketList() {
		ArrayList<Item> bucket = new ArrayList<Item>();
		Account acct = new AccountImpl();
		bucket.add(new Apple());
		bucket.add(new Banana());
		bucket.add(new Lemon());
		bucket.add(new Orange());
		bucket.add(new Peach());
		acct.add(bucket);
		assertEquals(15.00, acct.sumTransactions(), DOUBLE_DELTA);
	}

}
