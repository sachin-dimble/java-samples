package com.sac.lymbda;

import java.util.ArrayList;
import java.util.Collection;

public class MyLambda {
    public static void main(String[] args) {
        System.out.println("Laymbda test");
        Collection<String> list = new ArrayList<String>();
        list.add("first");
        list.add("second");
        list.add("third");
        // 1. Parameter inferred
        list.forEach(val -> System.out.println(val));
        // 2. Pass the function reference to data, no parameter declaration requires
        list.forEach(System.out :: println);
        // 3. function passing across object
        ForLambda passFunc = new ForLambda();
        list.forEach(passFunc :: printStr);

        // 4. Functional interface with function assignment to reference
        MyFunc func = msg -> System.out.println("my function "+msg);
        list.forEach(msg -> func.callMe(msg));


    }
}



