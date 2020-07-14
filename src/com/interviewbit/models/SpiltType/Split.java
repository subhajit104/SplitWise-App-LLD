package com.interviewbit.models.SpiltType;

import com.interviewbit.models.User;

public abstract class Split {


    private User user;
    double amount;

    public Split(User user) {
        this.user = user;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}
