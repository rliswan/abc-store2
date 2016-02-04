package com.abc.transaction;

import com.abc.product.Item;

public class Transaction {
	private final String transactionType;
	private final Item item;

	public Transaction(Item item, String transactionType) {
		this.item = item;
		this.transactionType = transactionType;
	}

	public Item getItem() {
		return item;
	}

	public String getTransactionType() {
		return transactionType;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}
		if (obj == null || obj.getClass() != this.getClass()) {
			return false;
		}
		Transaction trans = (Transaction) obj;
		return (this.getItem().getItemName() == trans.getItem().getItemName());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + this.getItem().getItemName();
		return result;
	}

}
