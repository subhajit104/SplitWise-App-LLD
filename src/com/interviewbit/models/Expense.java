package com.interviewbit.models;

import com.interviewbit.models.SpiltType.Split;

import java.util.List;
import java.util.UUID;

public class Expense {

    private UUID uuid;
    private String paidBy;
    private List<Split> splits;
    private ExpenseType expenseType;
    private MetaData metaData;

    public Expense(String paidBy, List<Split> splits, ExpenseType expenseType, MetaData metaData) {
        this.paidBy = paidBy;
        this.splits = splits;
        this.expenseType = expenseType;
        this.metaData = metaData;
        this.uuid = UUID.randomUUID();
    }



}
