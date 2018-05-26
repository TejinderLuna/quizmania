package com.example.tejinderluna.quizmania;

import java.util.ArrayList;

/**
 * Created by Tejinder Luna on 12/25/2017.
 */

public class HistoryQuestion extends Question {
    private ArrayList<Question> historyQuestionData;

    public HistoryQuestion() {
        historyQuestionData = new ArrayList<Question>();
        historyQuestionData.add(new Question(1, "Which century was The Black Death?", "Fourteenth", "Fifteenth", "Sixteenth", "Seventeenth", "Fourteenth"));
        historyQuestionData.add(new Question(2, "Who invented the thermometer in 1593?", "Alexander Graham Bell","Isaac Newton", "Galileo", "Leonardo Da Vinci", "Galileo"));
        historyQuestionData.add(new Question(3, "Which German city endured the worst bombing of World War Two in February 1945?", "Dusseldorf", "Munich", "Frankfurt", "Dresden", "Dresden"));
        historyQuestionData.add(new Question(4, "In 1816 which US state was admitted to the Union as the 20th state?", "Alabama", "Arkansas", "Mississippi", "Louisiana", "Mississippi"));
        historyQuestionData.add(new Question(5, "In which French city was Joan of Arc put to death?", "Rouen", "Paris", "Bordeaux", "Lyon", "Rouen"));
        historyQuestionData.add(new Question(6, "What was the first country to recognize Mexico’s independence, in 1836?", "Canada", "US", "France", "England", "US"));
        historyQuestionData.add(new Question(7, " Who was the only American to become vice president and president after resignations?", "Ronald Reagan", "John Carter", "Franklin Roosevelt", "Gerald Ford", "Gerald Ford"));
        historyQuestionData.add(new Question(8, "What country led all Arab nations in the number of troops participating in Operation Desert Storm?", "Qatar", "Saudi Arabia", "Kuwait","Yemen","Saudi Arabia"));
        historyQuestionData.add(new Question(9, "What was the first capital city of the United States?", "Philadelphia", "St.Louis", "Minnesota", "New York", "Philadelphia"));
        historyQuestionData.add(new Question(10, "Malcolm Little was a civil rights activist better known by what name?", "Malcolm X", "Malcolm Independence", "Malcolm Z", "Malcolm Y", "Malcolm X"));
        historyQuestionData.add(new Question(11, "What is the name for the Greek goddess of victory?", "Poseidon", "Cronus", "Zeus", "Nike", "Nike"));
        historyQuestionData.add(new Question(12, "Saint Patrick's Day was originally associated with what color?", "Green", "White", "Blue", "Yellow", "Blue"));
        historyQuestionData.add(new Question(13, "Which city is traditionally said to be built on seven hills? ", "Paris", "Madrid", "Rome", "London", "Rome"));
        historyQuestionData.add(new Question(14, "In 1893, which country became the first to give women the right to vote?", "Australia", "France", "England", "New Zealand", "New Zealand"));
        historyQuestionData.add(new Question(15, "What artist painted the late 15th century mural known as Last Supper ?", "Leonardo Da Vinci", "Donatello", "Raphael", "Michelangelo", "Leonardo Da Vinci"));
        historyQuestionData.add(new Question(16, "From 1964 to 1980, what country was known as Rhodesia?", "Kenya", "South Africa", "Nigeria", "Zimbabwe", "Zimbabwe"));
        historyQuestionData.add(new Question(17, "Which European country was  the first to allow women to vote?","Norway", "Denmark", "Sweden", "Finland", "Finland"));
        historyQuestionData.add(new Question(18, "The attack on Pearl Harbor took place in which month?", "January", "June", "August", "December", "December"));
        historyQuestionData.add(new Question(19, "The sale of what was prohibited during prohibition?", "Tobacco", "Alcohol", "Milk", "Gun Powder", "Alcohol"));
        historyQuestionData.add(new Question(20, "What is the world's smallest country?", "Maldives", "Vatican", "Monaco", "Tuvalu", "Vatican"));

    }

    public ArrayList<Question> getHistoryQuestionData() {
        return historyQuestionData;
    }

    public void setHistoryQuestionData(ArrayList<Question> historyQuestionData) {
        this.historyQuestionData = historyQuestionData;
    }
    public int getSize()
    {
        return this.historyQuestionData.size();
    }
}
