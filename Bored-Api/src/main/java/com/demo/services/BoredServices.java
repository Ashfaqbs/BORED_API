package com.demo.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class BoredServices {
	
public static	 ArrayList<String> activities = new ArrayList<>();
     static {
     activities.add("Learn to juggle");
     activities.add("Paint a self-portrait");
     activities.add("Write a short story");
     activities.add("Learn a new language");
     activities.add("Try a new recipe");
     activities.add("Go hiking");
     activities.add("Learn a magic trick");
     activities.add("Take a dance class");
     activities.add("Create a vision board");
     activities.add("Start a garden");
     activities.add("Learn to play an instrument");
     activities.add("Do a puzzle");
     activities.add("Write a poem");
     activities.add("Try a new sport");
     activities.add("Learn a new programming language");
     activities.add("Take a yoga class");
     activities.add("Learn to code a mobile app");
     activities.add("Try an escape room");
     activities.add("Attend a concert");
     activities.add("Watch a classic movie");
     activities.add("Make a homemade pizza");
     activities.add("Write a song");
     activities.add("Attend a comedy show");
     activities.add("Take a cooking class");
     activities.add("Learn to knit");
     activities.add("Go on a road trip");
     activities.add("Try a new cocktail recipe");
     activities.add("Go on a bike ride");
     activities.add("Attend a wine tasting");
     activities.add("Create a scrapbook");
     activities.add("Learn to meditate");
     activities.add("Try a new form of art");
     activities.add("Learn a new form of dance");
     activities.add("Start a book club");
     activities.add("Visit a museum");
     activities.add("Learn to skateboard");
     activities.add("Take a photography class");
     activities.add("Learn to sew");
     activities.add("Try indoor skydiving");
     activities.add("Attend a music festival");
     activities.add("Learn a new card game");
     activities.add("Go on a hike and take photos");
     activities.add("Learn to surf");
     activities.add("Attend a theater production");
     activities.add("Try a new type of tea");
     activities.add("Create a blog");
     activities.add("Take a painting class");
     activities.add("Try a new workout routine");
     activities.add("Learn to do calligraphy");
     activities.add("Go on a solo trip");
     activities.add("Attend a stand-up comedy show");
     activities.add("Try a new type of food");
     activities.add("Learn to make sushi");
     activities.add("Take a dance class online");
     activities.add("Learn a new style of cooking");
     activities.add("Try a new hair color");
     activities.add("Attend a poetry reading");
     activities.add("Learn to scuba dive");
     activities.add("Go on a camping trip");
     activities.add("Try a new type of beer");
     activities.add("Learn to make pottery");
     activities.add("Take a woodworking class");
     activities.add("Try a new type of wine");
     activities.add("Attend a music concert in a different genre");
     activities.add("Learn to make soap");
     activities.add("Try a new type of coffee");
     activities.add("Start a workout challenge");
     activities.add("Learn to play chess");
     activities.add("Try a new type of dessert");
     activities.add("Attend a cultural festival");
     activities.add("Learn to make candles");
     activities.add("Go on a scavenger hunt");
     activities.add("Try a new type of liquor");
     activities.add("Attend a fashion show");
     activities.add("Learn to make jewelry");
     }
     
     
     public List<String>getBoredApis()
     {
    	  Random random = new Random();
          int index = random.nextInt(activities.size());
          return activities;
      }
}
