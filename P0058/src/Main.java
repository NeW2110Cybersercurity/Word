/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
import controller.WordItem;
import java.util.ArrayList;
import view.Menu;

public class Main {
    public static void main(String[] args) {
        String title = "Word Management ";
        String[] s = new String[]{"Add Word ", "Delete Word",
            " Search Word ","Exit"};
        Menu<String> menu = new WordItem(title, s);
        menu.run();
    }
}