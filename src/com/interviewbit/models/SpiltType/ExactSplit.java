package com.interviewbit.models.SpiltType;

import com.interviewbit.models.User;

public class ExactSplit extends Split {


    public ExactSplit(User user, double amount) {
        super(user);
        this.amount = amount;

    }
}
