package com.example.tejinderluna.quizmania;

import java.util.ArrayList;

/**
 * Created by Tejinder Luna on 12/25/2017.
 */

public class SportsQuestion extends Question{
    private ArrayList<Question> sportsQuestionData;

    public SportsQuestion() {
        sportsQuestionData = new ArrayList<Question>();
        sportsQuestionData.add(new Question(1, "What male tennis player has won the most Grand Slam titles?", "Roger Federer", "Pete Sampras", "Andre Agassi", "Novak Djokovic", "Roger Federer"));
        sportsQuestionData.add(new Question(2, "How many holes are there in a full round of golf?", "Sixteen", "Seventeen", "Eighteen", "Nineteen", "Eighteen"));
        sportsQuestionData.add(new Question(3, "Where did the sport of curling originate?", "Scotland", "Ireland", "Wales", "Northern Ireland", "Scotland"));
        sportsQuestionData.add(new Question(4, "What city hosted the 2012 Summer Olympics?", "London, England", "Paris, France", "Madrid, Spain", "Rome, Italy", "London, England"));
        sportsQuestionData.add(new Question(5, "How many soccer players should be on the field at the same time at the beginning of the game?", "Twenty", "Twenty-one", "Twenty-two", "Twenty-three", "Twenty-two"));
        sportsQuestionData.add(new Question(6, "A shuttlecock is used in what sport?", "Hockey", "Badminton", "Cricket", "Tennis", "Badminton"));
        sportsQuestionData.add(new Question(7, "\"The Ashes\" is the most important trophy in what sport?", "Tennis", "Football", "Golf", "Crickets", "Crickets"));
        sportsQuestionData.add(new Question(8, "Brazil was eliminated in the 2014 world cup by what team?", "Italy", "France", "Germany", "Spain", "Germany"));
        sportsQuestionData.add(new Question(9, "Which is the only country to have played in every World Cup?", "Brazil", "Italy", "Spain", "France", "Brazil"));
        sportsQuestionData.add(new Question(10, "Which country’s entire team was barred from competing at the Paralympics in Sydney?", "Spain", "Italy", "Uruguay", "China", "Spain"));
        sportsQuestionData.add(new Question(11, "How many teams are there in the American National Football League?", "Thirty", "Thirty-one", "Thirty-two", "Thirty-three", "Thirty-two"));
        sportsQuestionData.add(new Question(12, "Which country will host the 2018 FIFA World Cup?", "Russia", "Qatar", "France", "US", "Russia"));
        sportsQuestionData.add(new Question(13, "Who has won the most women's tennis titles?", "Steffi Graf", "Serena Williams", "Venus Williams", "Margaret Court", "Margaret Court"));
        sportsQuestionData.add(new Question(14, "Bobby Fischer is considered by many to be the greatest player of all time in which game?", "Tennis", "Golf", "Cycling", "Chess", "Chess"));
        sportsQuestionData.add(new Question(15, "The Stanley Cup is a championship trophy awarded annually to the playoff winner in what sport?", "Soccer", "Baseball", "Football", "Ice Hockey", "Ice Hockey"));
        sportsQuestionData.add(new Question(16, "Which team does Cristiano Ronaldo play?", "Manchester United", "FC Barcelona", "Juventus", "Real Madrid", "Real Madrid"));
        sportsQuestionData.add(new Question(17, "Which five-times Grand Slam tennis champion tested positive for a banned substance at the 2016 Australian Open?", "Venus Williams", "Serena Williams", "Maria Sharapova", "Jelena Dokic", "Maria Sharapova"));
        sportsQuestionData.add(new Question(18, "Shaquille Rashaun O'Neal retired in 2011 from what sport?", "Baseball", "Tennis", "Football", "Basketball", "Basketball"));
        sportsQuestionData.add(new Question(19, "In what country did table tennis originate?", "China", "Singapore", "England", "Germany", "England"));
        sportsQuestionData.add(new Question(20, "Which basketball team did Michael Jordan play for in NBA?", "Boston Celtics", "Los Angeles Lakers", "New York Knicks", "Chicago Bulls", "Chicago Bulls"));
    }

    public ArrayList<Question> getSportsQuestionData() {
        return sportsQuestionData;
    }

    public void setSportsQuestionData(ArrayList<Question> sportsQuestionData) {
        this.sportsQuestionData = sportsQuestionData;
    }
    public int getSize()
    {
        return this.sportsQuestionData.size();
    }
}
