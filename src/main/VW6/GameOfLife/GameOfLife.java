package main.VW6.GameOfLife;

import java.util.Arrays;

public class GameOfLife {
    private int[][] world;


    public GameOfLife(int size) {
        world = new int[size][size];
    }

    public boolean addAliveCell(int x, int y) {
        if (x < 0 || x > world.length - 1 || y < 0 || y > world.length - 1) {
            return false;
        }

        world[x][y] = 1;
        return true;
    }

    public void gameCycle() {
        for (int x = 0; x < world.length - 1; x++) {
            for (int y = 0; y < world.length - 1; y++) {
                int neighbors = countNeighbors(x, y);
                if (neighbors > 3) {
                    world[x][y] = 0;
                    continue;
                }

                if (neighbors == 3) {
                    world[x][y] = 1;
                }

                if (neighbors <= 1) {
                    world[x][y] = 0;
                }
            }
        }
    }

    /*
    xxx
    xix
    xxx
     */
    private int countNeighbors(int x, int y) {
        int aliveNeighbors = 0;
        if (x > 0) {
            if (world[x - 1][y] == 1) {
                aliveNeighbors++;
            }
            if (y > 0 && world[x - 1][y - 1] == 1) {
                aliveNeighbors++;
            }
            if (y <= world.length - 2 && world[x - 1][y + 1] == 1) {
                aliveNeighbors++;
            }
        }

        if (y > 0) {
            if (world[x][y - 1] == 1) {
                aliveNeighbors++;
            }
            if (x <= world.length - 2 && world[x + 1][y - 1] == 1) {
                aliveNeighbors++;
            }
        }

        if (x <= world.length - 2 && world[x + 1][y] == 1) {
            aliveNeighbors++;
        }

        if (y <= world.length - 2) {
            if (world[x][y + 1] == 1) {
                aliveNeighbors++;
            }

            if (x <= world.length - 2 && world[x + 1][y + 1] == 1) {
                aliveNeighbors++;
            }
        }

        return aliveNeighbors;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int[] row: world) {
            stringBuilder.append("|");
            for (int cell: row) {
                if (cell == 1)
                    stringBuilder.append(" o ");
                else
                    stringBuilder.append("   ");
            }
            stringBuilder.append("|\n");
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        GameOfLife gameOfLife = new GameOfLife(10);
        gameOfLife.addAliveCell(1, 1);
        gameOfLife.addAliveCell(1, 2);
        gameOfLife.addAliveCell(2, 2);
        while (true) {
            gameOfLife.gameCycle();
            System.out.println();
            System.out.println(gameOfLife);
        }
    }
}
