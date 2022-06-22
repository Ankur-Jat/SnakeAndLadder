/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.ankurjat.snakeandladder;

import java.util.Objects;
import java.util.Scanner;

public class App {
    private Board board;
    private PlayerPiece[] playerPieces;
    private Scanner scanner;
    private PlayerPiece winner;
    int playerTurn;

    private void play() {
        board = new Board();

        scanner = new Scanner(System.in);
        System.out.print("How many players are there to play?\t");
        int playerCount = scanner.nextInt();
        if (playerCount < 1) {
            System.out.println("Players must be greater than or equal to 1. Come back when you really want to play.");
            return;
        }

        playerPieces = new PlayerPiece[playerCount];
        System.out.println("Snake And Ladder game is started with " + playerCount + " players.");
        for(int i=0; i < playerCount; i++) {
            System.out.print("What is color of " + (i+1) + " player?\t");
            playerPieces[i] = new PlayerPiece(scanner.next(), board.squares[Board.STARTING_SQUARE]);
        }

        while (Objects.isNull(winner)) {
            board.movePlayerPiece(playerPieces[playerTurn]);
            setWinner();
            playerTurn = (playerTurn + 1) % playerCount;
        }
        System.out.println("Congratulations: " + winner.getColor() + "! You came first.");
    }

    private void setWinner() {
        if (playerPieces[playerTurn].getCurrentPosition().getPosition() == Board.MAX_SQUARES) {
            winner = playerPieces[playerTurn];
        }
    }

    public static void main(String[] args) {
        new App().play();
    }
}

