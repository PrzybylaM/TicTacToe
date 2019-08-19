package ticTacToe;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    private List<String> menuElements = new ArrayList<String>();

    public String getChoice(){
        this.displayMenu();
        return menuElements.get(getInputChoise());
    }

    private int getInputChoise(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt() -1;
    }

    private void displayMenu(){
        for (int i = 1; i <= menuElements.size(); i++) {
            System.out.println(i + ". " + menuElements.get(i-1));
        }
    }

    public void addElement (String element){
        this.menuElements.add(element);
    }
}
