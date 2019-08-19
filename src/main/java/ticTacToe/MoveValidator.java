package ticTacToe;

public class MoveValidator {
    public static boolean validate(Board board, int move) {
        try {
            if(board.getPawn(move) != null){
                return false;
            }
        }catch (InvalidFieldNumberExeception e){
            return false;
        }

        return true;
    }
}
