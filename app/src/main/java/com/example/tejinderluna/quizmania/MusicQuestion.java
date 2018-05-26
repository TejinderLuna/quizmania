package com.example.tejinderluna.quizmania;

import java.util.ArrayList;

/**
 * Created by Tejinder Luna on 12/25/2017.
 */

public class MusicQuestion extends Question{
    private ArrayList<Question> musicQuestionData;

    public MusicQuestion() {
        musicQuestionData = new ArrayList<Question>();
        musicQuestionData.add(new Question(1, "Which one of these songs did Ludwig van Beethoven write?", "Ode to Joy", "To a Wild Rose", "Rejoice", "Hallelujah Chorus", "Ode to Joy"));
        musicQuestionData.add(new Question(2, "Who was the lead singer of the brand \"Queen\"?", "Bob Dylan", "Mike Jagger", "Freddie Mercury", "Axl Rose", "Freddie Mercury"));
        musicQuestionData.add(new Question(3, "\"Hallelujah\" is a song written by which Canadian recording artist?", "Leonard Cohen", "Michael Buble", "Neil Young", "Shania Twain", "Leonard Cohen"));
        musicQuestionData.add(new Question(4, "In the original Jackson family line up, how many brothers were there?", "Four", "Five", "Six", "Seven", "Five"));
        musicQuestionData.add(new Question(5, "What was Kelly Clarkson's debut song?", "Because of You", "Fly Away", "Miss Independent", "Catch My Breath", "Miss Independent"));
        musicQuestionData.add(new Question(6, "Which Baroque composer wrote The Four Seasons?", "Monteverdi", "Handel", "Bach", "Vivaldi", "Vivaldi"));
        musicQuestionData.add(new Question(7, "Who wrote the music for West Side Story?", "Leonard Bernstein", "Aaron Copland", "Marc Blitzstein", "George Gershwin", "Leonard Bernstein"));
        musicQuestionData.add(new Question(8, "What is the profession of the three male stars of On The Town?", "Chefs", "Sailors", "Writers", "Teachers", "Sailors"));
        musicQuestionData.add(new Question(9, "Which one of the following musicals is not by Andrew Lloyd Webber?", "Evita", "Phantom of the Opera", "West Side Story", "Cats", "West Side Story"));
        musicQuestionData.add(new Question(10, "What nationality was Dvorak?",  "Czech","Hungarian", "German", "French", "Czech"));
        musicQuestionData.add(new Question(11, "Keith Urban is a native of which country?", "Canada", "US", "England", "New Zealand", "New Zealand"));
        musicQuestionData.add(new Question(12, "Which 80’s group was \"Big In Japan\" in 1984?", "Ultravox", "Visage", "Alphaville", "The Vapors", "Alphaville"));
        musicQuestionData.add(new Question(13, "Who is the The Queen of Soul? ", "Aretha Franklin", "Diana Ross", "Patti LaBelle", "Nina Simone", "Aretha Franklin"));
        musicQuestionData.add(new Question(14, "Where was the Hip-Hop artist Kanye West born?", "Oklahoma City", "Atlanta Georgia", "Chicago Illinois", "Memphis Tennessee", "Atlanta Georgia"));
        musicQuestionData.add(new Question(15, "What’s the nickname of the Jazz Legend Louis Armstrong?", "Papa Blues", "Gatemouth", "Golden Tone", "Satchmo", "Satchmo"));
        musicQuestionData.add(new Question(16, "Which one of the following is not by the Reggae Legend Bob Marley?", "Red Red Wine", "Could You Be Loved?", "Is This Love?", "No Woman No Cry", "Red Red Wine"));
        musicQuestionData.add(new Question(17, "The biggest selling music single of all time is which of the following?", "Vogue(Madonna)", "I Want it That Way(Backstreet Boys)", "Smells Like Teen Spirit(Nirvana)", "Candle in the Wind(Elton John)", "Candle in the Wind (Elton John)"));
        musicQuestionData.add(new Question(18, "The soundtrack of the movie Bodyguard (1992), \"I will always love you\"?, was originally sung by which of the following?", "Rihanna", "Whitney Houston", "Janet Jackson", "Gloria Estefan", "Whitney Houston"));
        musicQuestionData.add(new Question(19, "Where is the famous Carnegie Hall located?", "New York", "Chicago", "Seattle", "Los Angeles", "New York"));
        musicQuestionData.add(new Question(20, "Which one of the following artists was names Billboard’s Artist of the Year for two years running, 2011 and 2012?", "Kylie Minogue", "Ellie Goulding", "Adele", "Beyonce", "Adele"));
    }

    public ArrayList<Question> getMusicQuestionData() {
        return musicQuestionData;
    }

    public void setMusicQuestionData(ArrayList<Question> musicQuestionData) {
        this.musicQuestionData = musicQuestionData;
    }
    public int getSize()
    {
        return this.musicQuestionData.size();
    }
}
