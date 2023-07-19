package com.example.triviagame.model;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Stack;

public class GameSession {
    private Player player;
    private List<Question> questions;
    private int currentQuestionIndex;
    private Stack<LocalDateTime> timestamps;

    public GameSession(Player player, List<Question> questions) {
        this.player = player;
        this.questions = questions;
        this.currentQuestionIndex = 0;
        this.timestamps = new Stack<>();
    }

    public Question getNextQuestion() {
        if (currentQuestionIndex < questions.size()) {
            return questions.get(currentQuestionIndex++);
        }
        return null;
    }

    public void addTimestamp(LocalDateTime timestamp) {
        timestamps.push(timestamp);
    }

    public Stack<LocalDateTime> getTimestamps() {
        return timestamps;
    }

    // Other methods to manage game state, answer questions, etc.
}
