package ticTacToe;

import java.util.concurrent.TimeUnit;

public class Main {
    public static final String NEW_AI_GAME = "Nowa gra z komputerem";
    public static final String NEW_HUMAN_GAME = "Nowa gra z drugim graczem";
    public static final String EXIT_GAME = "Wyjście";

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.addElement(NEW_AI_GAME);
        menu.addElement(NEW_HUMAN_GAME);
        menu.addElement(EXIT_GAME);


        mainLoop:
        while(true){
            switch (menu.getChoice()){
                case NEW_AI_GAME:
                    TicTacToeController game = new TicTacToeController(
                            new HumanPlayer(new XPawn()),
                            new AIPlayer(new OPawn()));
                    game.start();
                    break;
                case NEW_HUMAN_GAME:
                    break;
                case EXIT_GAME:
                    break mainLoop;
            }
        }
    }
}
