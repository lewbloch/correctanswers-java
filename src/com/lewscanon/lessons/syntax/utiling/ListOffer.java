package com.lewscanon.lessons.syntax.utiling;

import java.util.Arrays;
import java.util.List;

public class ListOffer {
    public static void updateList(){
        List<String> nameList = Arrays.asList("Abc","Mno","Pqr","Xyz");
        nameList.removeIf(name -> name.contains("Abc"));
        nameList.add("Mno");
        System.out.println(nameList);
    }

    public static void main(String[] args) {
        updateList();
    }
}
