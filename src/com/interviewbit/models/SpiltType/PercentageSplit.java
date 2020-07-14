package com.interviewbit.models.SpiltType;

import com.interviewbit.models.User;

public class PercentageSplit extends Split{

   private  double percentage;

    public PercentageSplit(User user, double percentage) {
        super(user);
        this.percentage = percentage;
    }

}
