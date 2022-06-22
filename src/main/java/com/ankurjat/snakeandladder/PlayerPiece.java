package com.ankurjat.snakeandladder;

public class PlayerPiece {
    private final String color;
    private BoardSquare currentPosition;

    PlayerPiece(String color, BoardSquare currentPosition) {
        this.color = color;
        this.currentPosition = currentPosition;
    }

    String getColor() {
        return color;
    }

    BoardSquare getCurrentPosition() {
        return currentPosition;
    }

    void setCurrentPosition(BoardSquare boardSquare) {
        this.currentPosition = boardSquare;
    }

    void movePiece(BoardSquare boardSquare) {
        boardSquare.movePlayerPiece(this);
    }
}
