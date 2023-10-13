/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import common.Validation;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


/**
 *
 * @author Admin
 */
public class WordManager {
    
    private Validation validation;
    
     //add new word
    public static void addNewWord(HashMap<String, String> hm) {
        System.out.print("Enter Enlish: ");
        String english = Validation.checkInputString();
        if (!checkKeywordExist(hm, english)) {
            if (!Validation.checkInputYN()) {
                return;
            }
        }
        System.out.print("Enter Vietnamese: ");
        String vietnam = Validation.checkInputString();
        //check key word english exist or not
        hm.put(english, vietnam);
        System.err.println("Add successful.");
    }

    //delete word
    public static void deleteWord(HashMap<String, String> hm) {
        System.out.print("Enter english: ");
        String english = Validation.checkInputString();
        hm.remove(english);
        System.err.println("Delete successful.");
    }

    //translate
    public static void translate(HashMap<String, String> hm) {
        System.out.print("Enter english: ");
        String english = Validation.checkInputString();
        Set<Map.Entry<String, String>> entries = hm.entrySet();
        for (Map.Entry entry : entries) {
            if (entry.getKey().equals(english)) {
                System.out.println("Vietnamese: " + entry.getValue());
                return;
            }
        }
        System.err.println("Not found in data");
    }

    //check key englist exist
    public static boolean checkKeywordExist(HashMap<String, String> hm, String english) {
        Set set = hm.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry mentry = (Map.Entry) iterator.next();
            if (english.equalsIgnoreCase(mentry.getKey().toString())) {
                return false;
            }
        }
        return true;
    }
}
