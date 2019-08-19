package ticTacToe;


import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


class JudgeTest {
    private Board board;
    private Judge judge;

    @BeforeEach
    void setUp() {
        board = new Board(3,3);
        judge = new Judge(board);
    }

    @AfterEach
    void tearDown(){

    }

    @Test
    public void drawTest(){
        Pawn xPawn = new XPawn();
        Pawn oPawn = new OPawn();
        board.putPawn(1, xPawn);
        board.putPawn(2, oPawn);
        board.putPawn(3, xPawn);
        board.putPawn(4, oPawn);
        board.putPawn(5, xPawn);
        board.putPawn(6, oPawn);
        board.putPawn(7, oPawn);
        board.putPawn(8, xPawn);
        board.putPawn(9, oPawn);

        judge.setGameState(board);


        assertTrue(judge.isDraw());
    }

    @Test
    public void xPawnHorizontalWinTest(){
        Pawn xPawn = new XPawn();
        board.putPawn(4,xPawn);
        board.putPawn(5,xPawn);
        board.putPawn(6,xPawn);
        judge.setGameState(board);

        assertTrue(judge.isPawnWin(xPawn));

    }

    @Test
    public void xPawnVerticalWinTest(){
        Pawn xPawn = new XPawn();
        board.putPawn(1,xPawn);
        board.putPawn(4,xPawn);
        board.putPawn(7,xPawn);
        judge.setGameState(board);

        assertTrue(judge.isPawnWin(xPawn));
    }

    @Test
    public void xPawnCrossWinTest(){
        Pawn xPawn = new XPawn();
        board.putPawn(1,xPawn);
        board.putPawn(5,xPawn);
        board.putPawn(9,xPawn);
        judge.setGameState(board);

        assertTrue(judge.isPawnWin(xPawn));
    }

    @Test
    public void xPawnNotWin(){
        Pawn xPawn = new XPawn();
        board.putPawn(1, xPawn);
        judge.setGameState(board);

        assertFalse(judge.isPawnWin(xPawn));
    }

}