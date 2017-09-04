package com.company;

import java.util.ArrayList;
import java.util.List;

public class Operation {

    public Operation(){

    }

    public List<Integer> generate(int n) {
        List<Integer> primeFactors = new ArrayList<>();
        for (int i = 2; i <n ; i++) {
            if(n%i==0){
                if (isPrime(i)){
                    primeFactors.add(i);
                    System.out.println(i);
                }
            }
        }
        return primeFactors;
    }

    private boolean isPrime(int i) {
        for (int j = 2; j < i; j++) {
            if(i%j==0){
               return false;
            }
        }
        return true;
    }
}
