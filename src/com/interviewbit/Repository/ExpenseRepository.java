package com.interviewbit.Repository;

import com.interviewbit.Service.ExpenseService;
import com.interviewbit.models.Expense;
import com.interviewbit.models.ExpenseType;
import com.interviewbit.models.MetaData;
import com.interviewbit.models.SpiltType.Split;
import com.interviewbit.models.User;
import com.sun.source.tree.NewArrayTree;

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
           User user = new User(userId,email,phoneNumber);
           userMap.put(userId,user);
           expenseSheet.put(userId,new HashMap<>());
    }

    private void updateExpense(String username, List<Split> splits)
    {
        for(Split split: splits)
        {
            String user1 = username;
            String user2 = split.getUser().getUserName();
            if(user1.equals(user2)) continue; // paid for self.

            Map<String,Double> addExpense = expenseSheet.get(user1);
            if(addExpense.get(user2) == null)
            {
                addExpense.put(user2,0.0);
            }

            addExpense.put(user2,addExpense.get(user2) + split.getAmount());

            Map<String,Double> subtractExpense = expenseSheet.get(user2);
            if(addExpense.get(user1) == null)
            {
                addExpense.put(user1,0.0);
            }

            addExpense.put(user2,addExpense.get(user2) - split.getAmount());

        }
    }
    public void  addExpense(String paidBy, double amount , ExpenseType expenseType, List<Split> splits, MetaData metaData)
    {
        Expense expense = new Expense(paidBy,splits,expenseType,metaData);
        expenses.add(expense);
        updateExpense(paidBy,splits);

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
