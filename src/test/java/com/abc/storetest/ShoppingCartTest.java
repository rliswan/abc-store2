package com.abc.storetest;

import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;
import com.abc.account.Account;
import com.abc.account.AccountImpl;
import com.abc.product.Apple;
import com.abc.product.Banana;
import com.abc.product.Item;
import com.abc.product.Lemon;
import com.abc.product.Orange;
import com.abc.product.Peach;

public class ShoppingCartTest {
	private static final double DOUBLE_DELTA = 1e-15;
	Account acct;

	@Before
	public void setUp() {
		acct = new AccountImpl();

	}

	@Test
	public void totalCostWithRemoveCost() {
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
		bucket.add(new Apple());
		bucket.add(new Banana());
		bucket.add(new Lemon());
		bucket.add(new Orange());
		bucket.add(new Peach());
		acct.add(bucket);
		assertEquals(15.00, acct.sumTransactions(), DOUBLE_DELTA);
	}

}
