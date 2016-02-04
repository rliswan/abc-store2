package com.abc.account;

import java.util.List;
import com.abc.product.Item;
import com.abc.transaction.Transaction;

public interface Account {
	public static final String ADD = "A";
	public static final String REMOVE = "R";

	void add(Item item);

	void add(List<Item> bucket);

	void remove(Item item);

	List<Transaction> getTransactions();

	void setTransactions(List<Transaction> transactions);

	double sumTransactions();

	public int getTotalItems();
}