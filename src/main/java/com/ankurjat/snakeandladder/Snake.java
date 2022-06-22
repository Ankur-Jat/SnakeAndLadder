package com.ankurjat.snakeandladder;

public class Snake {
    BoardSquare head;
    BoardSquare tail;

    Snake(BoardSquare head, BoardSquare tail) {
        this.tail = tail;
        setHead(head);
    }

    void setHead(BoardSquare boardSquare) {
        this.head = boardSquare;
        boardSquare.setSnake(this);
    }

    void movePlayerPiece(PlayerPiece playerPiece) {
        System.out.println("I'm a snake and now you have to go to: " + tail.getPosition());
        playerPiece.setCurrentPosition(tail);
    }
}
