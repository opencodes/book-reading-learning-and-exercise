package com.rkjha.designpattern.behavioral.memento;

public class Main {
    public static void main(String[] args) {
        // Create a player and a game state manager
        Player player = new Player("John", 1);
        GameState gameState = new GameState();

        // Save the initial state
        gameState.saveState(player.saveState());
        System.out.println("Initial State: " + player);

        // Player levels up
        player.levelUp();
        System.out.println("Player leveled up: " + player);

        // Save the current state
        gameState.saveState(player.saveState());

        // Restore to the initial state
        player.restoreState(gameState.getState(0));
        System.out.println("Restored State: " + player);

    }
}
