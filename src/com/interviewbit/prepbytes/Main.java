package com.interviewbit.prepbytes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static int count = 0 ;

    private  static void recur(List<Integer> arr, int index, int k , int sum )
    {
        if(index >= arr.size()){
            count += (k == sum) ? 1 : 0;
            return;
        }

        // add current index number
        recur(arr,index+1,k,sum+arr.get(index));

        //  subtract current index number

        recur(arr, index+1,k,sum-arr.get(index));

        // neglect current number.

        recur(arr,index+1,k,sum);

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(" number of test cases");
        int test_case = scanner.nextInt();

        for(int t = 0 ; t < test_case ; t ++)
        {
            int n = scanner.nextInt();
            int k = scanner.nextInt();

            List<Integer> arr = new ArrayList<>();
            for(int i = 0 ; i < n ; i ++)
                arr.add(scanner.nextInt());

            recur(arr,0,k,0);
            System.out.println(count);

        }
    }
}
