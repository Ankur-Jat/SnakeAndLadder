package com.ankurjat.snakeandladder;

import java.util.Objects;

public class BoardSquare {
    private final int position;
    private Snake snake;
    private Ladder ladder;

    BoardSquare(int position) {
        this.position = position;
    }

    int getPosition() {
        return position;
    }

    void movePlayerPiece(PlayerPiece playerPiece) {
        playerPiece.setCurrentPosition(this);
        if (!Objects.isNull(snake)) {
            snake.movePlayerPiece(playerPiece);
        }
        if (!Objects.isNull(ladder)) {
            ladder.movePlayerPiece(playerPiece);
        }
    }

    void setSnake(Snake snake) {
        this.snake  = snake;
    }

    void setLadder(Ladder ladder) {
        this.ladder = ladder;
    }


}
