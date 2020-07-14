package com.interviewbit.Repository;

import com.interviewbit.Service.ExpenseService;
import com.interviewbit.models.Expense;
import com.interviewbit.models.ExpenseType;
import com.interviewbit.models.SpiltType.Split;
import com.interviewbit.models.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExpenseRepository {

    private List<Expense> expenses;
    private Map<String, Map<String,Double>> expenseSheet;
    private Map<String, User> userMap;
    private ExpenseService expenseService ;
    public ExpenseRepository() {
        expenses = new ArrayList<>();
        expenseSheet = new HashMap<>();
        userMap = new HashMap<>();
        expenseService = new ExpenseService();
    }

    public void  addUser(String userId, String email , String phoneNumber)
    {

    }

    public void  addExpense( String paidBy, double amount , ExpenseType expenseType, List<Split> splits)
    {
        Expense expense = expenseService.createExpense(paidBy, amount , expenseType,splits);
    }

    public void printExpense(String userId)
    {

    }

    public void printExpenses()
    {

    }

    private void print(String user1, String user2, double amount)
    {

    }

}
