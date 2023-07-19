package com.example.triviagame.util;

import com.example.triviagame.model.Question;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class FileReaderUtil {

    public static List<Question> readQuestionsFromFile(String filename) throws Exception {
        List<Question> questions = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] objects = line.split("\\+");
                Object object1 = parseObject(objects[0].trim());
                Object object2 = parseObject(objects[1].trim());

                line = reader.readLine(); // Read the choices line
                String[] choicesStr = line.split(",");
                List<Object> choices = new ArrayList<>();
                for (String choice : choicesStr) {
                    choices.add(parseObject(choice.trim()));
                }

                Object correctAnswer = genericAdd(object1, object2);
                questions.add(new Question(object1, object2, choices, correctAnswer));
            }
        }
        return questions;
    }

    private static Object parseObject(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            // Not an integer
        }

        try {
            return Double.parseDouble(str);
        } catch (NumberFormatException e) {
            // Not a double
        }

        return str;  // If not int or double, treat it as a string
    }

    private static Object genericAdd(Object obj1, Object obj2) {
        if (obj1 instanceof Integer && obj2 instanceof Integer) {
            return (Integer) obj1 + (Integer) obj2;
        } else if (obj1 instanceof Double && obj2 instanceof Double) {
            return (Double) obj1 + (Double) obj2;
        } else if (obj1 instanceof String && obj2 instanceof String) {
            return (String) obj1 + (String) obj2;
        } else if (obj1 instanceof Number && obj2 instanceof Number) {
            return ((Number) obj1).doubleValue() + ((Number) obj2).doubleValue();
        } else {
            throw new IllegalArgumentException("Unsupported object types for addition");
        }
    }
}
