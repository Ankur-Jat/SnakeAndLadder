package com.ankurjat.snakeandladder;

public class Board {
    private Dice dice;
    public static int MAX_SQUARES = 100;
    public static int STARTING_SQUARE = 1;
    BoardSquare[] squares;

    Board() {
        dice = new Dice();
        int squareCount = MAX_SQUARES + STARTING_SQUARE;
        squares = new BoardSquare[squareCount];
        for (int i=1; i < squareCount; i++) {
            squares[i] = new BoardSquare(i);
        }

        // Create snakes
        new Snake(squares[99], squares[10]);
        new Snake(squares[93], squares[50]);
        new Snake(squares[83], squares[41]);
        new Snake(squares[79], squares[49]);
        new Snake(squares[64], squares[52]);
        new Snake(squares[55], squares[5]);
        new Snake(squares[42], squares[11]);
        new Snake(squares[39], squares[2]);
        new Snake(squares[23], squares[7]);

        // Create ladders
        new Ladder(squares[25], squares[5]);
        new Ladder(squares[61], squares[29]);
        new Ladder(squares[90], squares[45]);
        new Ladder(squares[73], squares[21]);
        new Ladder(squares[69], squares[18]);
    }

    void movePlayerPiece(PlayerPiece playerPiece) {
        int diceValue = dice.getRoll();
        System.out.println("" + playerPiece.getColor() + " player is rolling their dice..........\nIt's a " + diceValue);
        int currentPosition = playerPiece.getCurrentPosition().getPosition();
        int newPosition = currentPosition + diceValue;
        if (newPosition > MAX_SQUARES) {
            System.out.println("You can't play this move as it will take you no where.");
            return;
        }

        playerPiece.movePiece(squares[newPosition]);
        int finalPosition = playerPiece.getCurrentPosition().getPosition();
        System.out.println( playerPiece.getColor() + " player moved from " + currentPosition + " to " + finalPosition);

    }
}
