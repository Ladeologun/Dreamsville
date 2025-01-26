package com.example.dreamsvile.voila;

public class PracticeGenerics<T,R extends Number> {
    private String name;
    private R age;
    private T address;

    public static <U extends String,V extends Number > U calculateLove(V ans){
        return (U) Integer.toString(ans.intValue());
    }


}
