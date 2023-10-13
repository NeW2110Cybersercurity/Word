/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.HashMap;
import model.WordManager;
import view.Menu;

/**
 *
 * @author Admin
 */
public class WordItem extends Menu<String>{
    
    HashMap<String, String> hm = new HashMap<>();
    public WordItem(String td, String[] mc) {
        super(td, mc);
    }
    
    @Override
    public void execute(int n) {
        switch (n) {
                case 1:
                    WordManager.addNewWord(hm);
                    break;
                case 2:
                    WordManager.deleteWord(hm);
                    break;
                case 3:
                    WordManager.translate(hm);
                    break;
                case 4:
                    return;      
        }
    }
    
}
