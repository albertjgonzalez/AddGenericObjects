package com.example.triviagame.model;

public class Player {
    private String name;
    private int score;
    private int totalGamesPlayed;

    public Player(String name) {
        this.name = name;
        this.score = 0;
        this.totalGamesPlayed = 0;
    }

    // Getters and Setters

    public void incrementScore() {
        this.score++;
    }

    public void incrementTotalGames() {
        this.totalGamesPlayed++;
    }

    // Other methods as required
}
