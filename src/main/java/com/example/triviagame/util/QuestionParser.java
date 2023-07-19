package com.example.triviagame.util;

import com.example.triviagame.model.Question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class QuestionParser {

    public static List<Question> parseQuestions(String filePath) throws IOException {
        List<Question> questions = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(QuestionParser.class.getResourceAsStream(filePath)))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] objects = line.split("\\+");
                if (objects.length == 2) {
                    String[] choices = reader.readLine().split(",");
                    questions.add(new Question(objects[0].trim(), objects[1].trim(), choices));
                } else {
                    //print error message
                    System.out.println("Error parsing question: " + line);

                }
            }
        }
        return questions;
    }
}
