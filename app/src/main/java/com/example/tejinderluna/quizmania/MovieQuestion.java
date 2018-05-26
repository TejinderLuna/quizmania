package com.example.tejinderluna.quizmania;

import java.util.ArrayList;

/**
 * Created by Tejinder Luna on 12/25/2017.
 */

public class MovieQuestion extends Question{
    private ArrayList<Question> movieQuestionsData;

    public MovieQuestion() {
        movieQuestionsData = new ArrayList<Question>();
        movieQuestionsData.add(new Question(1, "In which movie does character Neo is present?", "Matrix", "Forrest Gump", "The Sixth Sign", "Bicentinnial Man", "Matrix"));
        movieQuestionsData.add(new Question(2, "Which of the following actors star in the movie \"Patch Adams\"?", "Robin Williams", "Tom Hanks", "John Travolta", "Steve Martin", "Patch Adams"));
        movieQuestionsData.add(new Question(3, "Where does the movie Casablanca (1942) takes place?", "Algeria", "Tunisia", "Morocco", "Gibraltar", "Morocco"));
        movieQuestionsData.add(new Question(4, "With which movie does Julia Roberts has won the \"best actress\" award for?", "Oceans Twelve", "Mona Lisa Smile", "Erin Brockovich", "Pretty Woman", "Erin Brockovich"));
        movieQuestionsData.add(new Question(5, "In the 1951 science fiction movie, The Day The Earth Stood Still, what was the name of the robot?", "Gort", "Klaatu", "Robby", "Johnny", "Klaatu"));
        movieQuestionsData.add(new Question(6, "Where is the mountain in \"Encouters of the Third Kind\" located?", "South Dakota", "Wyoming", "Colorado", "Washington", "Wyoming"));
        movieQuestionsData.add(new Question(7, "Which one of these Academy Awards did Gone With the Wind not win?", "Best Actor", "Best Actress", "Best Picture", "Best Supporting Actor", "Best Actor"));
        movieQuestionsData.add(new Question(8, "The quote \"you can’t handle the truth\" is from which movie?", "Maverick", "Toby Maguire", "A Few Good Man", "Patch Adams", "A Few Good Men"));
        movieQuestionsData.add(new Question(9, "Julie Andrews won the Academy Award for  best actress in what film?", "Mary Poppins", "The Sound of Music", "Victor/Victoria", "Americanization of Emily", "Mary Poppins"));
        movieQuestionsData.add(new Question(10, "In the Friday the 13th movies, what is the name of the masked killer?", "Freddy", "Michael", "Jason", "He has no name", "Jason"));
        movieQuestionsData.add(new Question(11, "Which one of the following wars is the movie \"The Pianist (2002) in\"?", "First World War", "Second World War", "Korean War", "Civil War", "Second World War"));
        movieQuestionsData.add(new Question(12, "How many Harry Potter movies are there?", "Five", "Six", "Seven", "Eight", "Eight"));
        movieQuestionsData.add(new Question(13, "What is name of Kevin Costner’s character in the movie Dances with Wolves?", "John Dunbar", "John Anderson", "Jack Sparrow", "Michael Myers", "John Dunbar"));
        movieQuestionsData.add(new Question(14, "Which 1983 Stephen King movie featured a car with a mind of its own?", "Carrie", "Christine", "Cujo", "Silver Bullet", "Christine"));
        movieQuestionsData.add(new Question(15, "What’s the speed limit that cannot be exceeded in the movie \"The Speed (1994)\"?", "Fifty", "Sixty", "Seventy", "Eighty", "Fifty"));
        movieQuestionsData.add(new Question(16, "What’s the name of the time machine does Marty McFly drive in the movie series \"Back to the Future\"?", "Delores", "DeMartin", "DeLorean", "Dorothy", "DeLorean"));
        movieQuestionsData.add(new Question(17, "Bruce Banner turns into what fictional superhero when he becomes angry?", "Captain America", "Ant-Man", "Hulk", "Thor", "Hulk"));
        movieQuestionsData.add(new Question(18, "What is the name of the dog from Wizard of Oz?", "Moto", "Koto", "Joto", "Toto", "Toto"));
        movieQuestionsData.add(new Question(19, "BB-8 is an astromech droid from what film?", "Matrix", "Back to the Future", "Star Wars", "Star Trek", "Star Wars"));
        movieQuestionsData.add(new Question(20, "What fictional planet is the superhero, \"Superman\", from?", "Krypton", "Mars", "Maaldoria", "Daxam", "Krypton"));
    }

    public ArrayList<Question> getMovieQuestionsData() {
        return movieQuestionsData;
    }

    public void setMovieQuestionsData(ArrayList<Question> movieQuestionsData) {
        this.movieQuestionsData = movieQuestionsData;
    }
    public int getSize()
    {
        return this.movieQuestionsData.size();
    }
}
