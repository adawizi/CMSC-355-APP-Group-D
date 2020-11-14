package com.example.cmsc355app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.preference.PreferenceManager;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class workExamples extends AppCompatActivity {

    @SuppressWarnings("checkstyle:Indentation")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.workout_instructions);

        ArrayList<String> exerciseImages = new ArrayList <String>();

        exerciseImages.add("pull up");
        exerciseImages.add("barbell row");
        exerciseImages.add("deadlift");
        exerciseImages.add("lateral pulldown");
        exerciseImages.add("bench press");
        exerciseImages.add("incline dumbbell");
        exerciseImages.add("flat dumbbell");
        exerciseImages.add("cable flies");
        exerciseImages.add("push up");
        exerciseImages.add("austrailian pullups");
        exerciseImages.add("burpees");
        exerciseImages.add("spiderman pushups");
        exerciseImages.add("squats");
        exerciseImages.add("jump squats");
        exerciseImages.add("lounges");
        exerciseImages.add("box jumps");
        exerciseImages.add("sit ups");
        exerciseImages.add("planks");
        exerciseImages.add("flutter kicks");
        exerciseImages.add("100 meter sprints");
        exerciseImages.add("jog for 30 min");
        exerciseImages.add("jump rope");
        exerciseImages.add("bicycle");
        exerciseImages.add("swimming laps");
        exerciseImages.add("run 2 miles");



        //final String programPic = PreferenceManager.getDefaultSharedPreferences(getBaseContext()).getString("programImage", "");

        String programPicEasy = PreferenceManager.getDefaultSharedPreferences(getBaseContext()).getString("programImageEasy", null);
        String programPicInt = PreferenceManager.getDefaultSharedPreferences(getBaseContext()).getString("programImageInt", null);
        String programPicHard = PreferenceManager.getDefaultSharedPreferences(getBaseContext()).getString("programImageHard", null);

        List<String> easyList = Arrays.asList(programPicEasy.split("\\s*,\\s*"));
        List<String> intList = Arrays.asList(programPicInt.split("\\s*,\\s*"));
        List<String> hardList = Arrays.asList(programPicHard.split("\\s*,\\s*"));

        Iterator<String> itr = exerciseImages.iterator();

        while (itr.hasNext()) {


        }

    }
}