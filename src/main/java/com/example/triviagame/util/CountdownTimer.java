package com.example.triviagame.utils;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.util.Duration;

public class CountdownTimer {

    private Timeline timeline;
    private int timeSeconds;
    private EventHandler<ActionEvent> onFinish;

    public CountdownTimer(int timeSeconds, EventHandler<ActionEvent> onFinish) {
        this.timeSeconds = timeSeconds;
        this.onFinish = onFinish;
    }

    public void start() {
        timeline = new Timeline(new KeyFrame(Duration.seconds(1), evt -> update()));
        timeline.setCycleCount(timeSeconds);
        timeline.setOnFinished(onFinish);
        timeline.play();
    }

    private void update() {
        timeSeconds--;
        if (timeSeconds <= 0) {
            stop();
        }
        // If you wish to update a UI component every second, you'd do that here.
    }

    public void stop() {
        if (timeline != null) {
            timeline.stop();
        }
    }

    public int getTimeSeconds() {
        return timeSeconds;
    }
}
