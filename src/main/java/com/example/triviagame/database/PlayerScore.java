package com.example.triviagame.model;

import java.time.LocalDateTime;

public class PlayerScore {
    private String username;
    private int score;
    private LocalDateTime timestamp;

    public PlayerScore(String username, int score, LocalDateTime timestamp) {
        this.username = username;
        this.score = score;
        this.timestamp = timestamp;
    }

    // Getters and setters

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
}
