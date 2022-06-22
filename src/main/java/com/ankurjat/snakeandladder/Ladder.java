package com.ankurjat.snakeandladder;

public class Ladder {
    BoardSquare to;
    BoardSquare from;

    Ladder(BoardSquare to, BoardSquare from) {
        this.to = to;
        setFrom(from);
    }

    void setFrom(BoardSquare boardSquare) {
        this.from = boardSquare;
        boardSquare.setLadder(this);
    }

    void movePlayerPiece(PlayerPiece playerPiece) {
        System.out.println("I'm a ladder and now you have to go to: " + to.getPosition());
        playerPiece.setCurrentPosition(to);
    }
}
