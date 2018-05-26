package com.example.tejinderluna.quizmania;

import java.util.ArrayList;

/**
 * Created by Tejinder Luna on 12/25/2017.
 */

public class BooksQuestion extends Question {
    private ArrayList<Question> bookQuestionData;

    public BooksQuestion() {
        bookQuestionData = new ArrayList<Question>();
        bookQuestionData.add(new Question(1,"Which book is written by Margaret Atwood ?","the cat's eye","the diviners","angel Dogfish","the stone angel","the cat's eye"));
        bookQuestionData.add(new Question(2,"What Canadian author wrote Life of Pi ?","Margaret Atwood","Yann Martel","Robert Munsch","Ernest Hemingway","Yann Martel"));
        bookQuestionData.add(new Question(3,"What Canadian author wrote Runaway ?","Yann Martel","Stephen king","Joseph Boyden","Alice Munro","Alice Munro"));
        bookQuestionData.add(new Question(4,"Joseph Boyden's first novel won the Amazon/Books in Canada First Novel Award and the Rogers Writers' Trust Fiction Prize. What was the name of the book ?","Three Day Road","Through Black Spruce","The Stone Angel","A Complicated Kindness","Three Day Road"));
        bookQuestionData.add(new Question(5,"This Canadian author is an avid storyteller who wrote the classic picture book Love You Forever ?","Stephen King","Jack Frost","Margaret Atwood","Robert Munsch","Robert Munsch"));
        bookQuestionData.add(new Question(6,"Margaret Laurence, author of The Stone Angel, The Diviners, A Jest of God among more, was born in what province ?","PEI","Ontario","Manitoba","British Columbia","Manitoba"));
        bookQuestionData.add(new Question(7,"Which two Canadian authors co-authored the book No Longer Two People ?","Leonard Cohen and Irving Layton","Lorna Crozier and Patrick Lane","Evelyn Lau and W.P. Kinsella","Michael Ondaatje and Sharon Thesen","Lorna Crozier and Patrick Lane"));
        bookQuestionData.add(new Question(8,"Which author penned a book that was made into an Oscar-winning movie ?","Robert Munsch","Northrop Frye","Michael Ondaatje","Margaret Atwood","Michael Ondaatje"));
        bookQuestionData.add(new Question(9,"Which prolific Canadian author penned the best selling Jalna in 1927 ?","R.stead","Robert W.Service","Pierre Berton","Mazo de la Roche","Mazo de la Roche"));
        bookQuestionData.add(new Question(10,"What do Canadians Jòhann Magnùs Bjarnason and Stephàn G. Stephansson have in common ?","both served as Premier of Ontario","they both claimed to have invented calculus","they were the first official passengers of the CPR","they were both major literary figures","they were both major literary figures"));
        bookQuestionData.add(new Question(11,"Which novel, following the lives of 4 generations of the Clark family ?","The Master of the Mill","The Mechanical Bride","The Handmaid's Tale","The Martyrology","The Master of the Mill"));
        bookQuestionData.add(new Question(12,"Which dissolute literary character is resurrected by a sea nymph who has been washed ashore by a tidal wave ?","Kateri Tekakwitha","Joseph Howe","Duddy Kravitz","Joseph Bourne","Joseph Bourne"));
        bookQuestionData.add(new Question(13,"Which volume of poetry reflected the author's socialist concerns ?","Martyrology","Day and Night","Naked Poems","Orion and Other Poems","Day and Night"));
        bookQuestionData.add(new Question(14,"What is the title of John Glassco's racy record of his time as an expatriate in the literary avant garde of 1920s Paris?","The Studhorse Man","A Red Carpet for the Sun","Memoirs of Montparnasse","The Favourite Game","Memoirs of Montparnasse"));
        bookQuestionData.add(new Question(15,"Which painter wrote the Governor General Award winning book Klee Wyck ?","Lawren Harris","F H Varley","Emily Carr","Alex Colville","Emily Carr"));
        bookQuestionData.add(new Question(16,"Who wrote the first Canadian novel to be required reading for France's aggregation exam ?","Margaret Laurence","Timothy Findley","Margaret Atwood.","Leonard Cohen","Margaret Laurence"));
        bookQuestionData.add(new Question(17,"Which author penned a book that was made into an Oscar-winning movie ?","Robert Munsch","Northrop Frye","Michael Ondaatje","Margaret Atwood","Michael Ondaatje"));
        bookQuestionData.add(new Question(18,"What is the title of John Glassco's racy record of his time as an expatriate in the literary avant garde of 1920s Paris?","The Studhorse Man","A Red Carpet for the Sun","Memoirs of Montparnasse","The Favourite Game","Memoirs of Montparnasse"));
        bookQuestionData.add(new Question(19,"Which book is written by Margaret Atwood ?","the cat's eye","the diviners","angel Dogfish","the stone angel","the cat's eye"));
        bookQuestionData.add(new Question(20,"What Canadian author wrote Runaway ?","Yann Martel","Stephen king","Joseph Boyden","Alice Munro","Alice Munro"));
    }

    public ArrayList<Question> getBookQuestionData() {
        return bookQuestionData;
    }

    public void setBookQuestionData(ArrayList<Question> bookQuestionData) {
        this.bookQuestionData = bookQuestionData;
    }
    public int getSize()
    {
        return this.bookQuestionData.size();
    }
}
