package com.example.tejinderluna.quizmania;

import java.util.ArrayList;

/**
 * Created by Tejinder Luna on 12/25/2017.
 */

public class ScienceQuestion extends Question {
    private ArrayList<Question> scienceQuestionData;

    public ScienceQuestion() {
        scienceQuestionData = new ArrayList<Question>();
        scienceQuestionData.add(new Question(1, "Which planet is known as the Red Planet?", "Jupiter", "Earth", "Mars", "Mercury", "Mars"));
        scienceQuestionData.add(new Question(2, "Which of the following has an organic origin?", "Sand", "Bakelite", "Nylon", "Coal", "Coal"));
        scienceQuestionData.add(new Question(3, "What is known as the universal solvent?", "Aqua Regia", "Sulphuric Acid", "Hydrochloric Acid", "Water", "Water"));
        scienceQuestionData.add(new Question(4, "Which of the following is necessary for burning (combustion)?", "Nitrogen", "Oxygen", "Carbon", "Petrol", "Oxygen"));
        scienceQuestionData.add(new Question(5, "Enzymes and anti-bodies are mainly made of which of the following?", "Fats", "Carbonhydrates", "Proteins", "Vitamin", "Proteins"));
        scienceQuestionData.add(new Question(6, "Who wrote the book \"The Origin of Species\"?", "Sir Alexander Fleming", "Stephen Hawking", "Louis Pasteur", "Charles Darwin", "Charles Darwin"));
        scienceQuestionData.add(new Question(7, "What is the total number of bones in the human body?", "Thirty-two", "One hundred ninty-six", "Two hundred and six", "Five hundred and twelve", "Two hundred and six"));
        scienceQuestionData.add(new Question(8, "The Earth is surrounded by an insulating blanket of gases which protects it from the light and heat of the Sun. This insulating layer is called which one of the following?", "Lithosphere", "Atmosphere", "Hydrosphere", "Biosphere", "Atmosphere"));
        scienceQuestionData.add(new Question(9, "The atom is made of which is the following?", "Neutrinos, Gamma Rays and Positrons", "Protons and Quarks", "Positrons, Neutrons, and Electrons", "Protons, Neutrons and Electrons", "Protons, Neutrons and Electrons"));
        scienceQuestionData.add(new Question(10, "Which rare element would you associate with Marie and Pierre Curie?", "Platinum", "Uranium", "Radium", "Gold", "Radium"));
        scienceQuestionData.add(new Question(11, "Who discovered Penicillin?", "Watson and Crick", "Louis Pasteur", "Robert Koch", "Sir Alexander Fleming", "Sir Alexander Fleming"));
        scienceQuestionData.add(new Question(12, "What is the name given to molten rocks erupted by a volcano?", "Lava", "Geyser", "Firestone", "Crater", "Lava"));
        scienceQuestionData.add(new Question(13, "The Sun is which one of the following?", "Comet", "Satellite", "Star", "Huge Planet", "Star"));
        scienceQuestionData.add(new Question(14, "The animal kingdom is formally classified into major groups known as which one of the following?", "Phyla", "Families", "Orders", "Sub Phyla", "Sub Phyla"));
        scienceQuestionData.add(new Question(15, "Where is the Sea of Tranquility?", "On the Moon", "Near the Bermuda Triangle", "In the Pacific Ocean", "On the Ocean", "On the Moon"));
        scienceQuestionData.add(new Question(16, "Who discovered the circulation of blood? ", "Williams Harvey", "Hargobind Khorana", "Edward Jenner", "Louis Pasteur", "William Harvey"));
        scienceQuestionData.add(new Question(17, "Which gas in the atmosphere protects us from harmful ultraviolet radiations?", "Nitrogen", "Carbon Dioxide", "Ozone", "Oxygen", "Ozone"));
        scienceQuestionData.add(new Question(18, "The three methods of science are observation, experimentation and which one of the following?", "Measurement", "Hypothesis", "Deduction", "Inference", "Measurement"));
        scienceQuestionData.add(new Question(19, "Which one of the following instruments is used to measure humidity?", "Anemometer", "Ammeter", "Hygrometer", "Barometer", "Hygrometer"));
        scienceQuestionData.add(new Question(20, "Which color is not considered to be one of the primary colors of light?", "Red", "Green", "Yellow", "Blue", "Green"));
    }

    public ArrayList<Question> getScienceQuestionData() {
        return scienceQuestionData;
    }

    public void setScienceQuestionData(ArrayList<Question> scienceQuestionData) {
        this.scienceQuestionData = scienceQuestionData;
    }
    public int getSize()
    {
        return this.scienceQuestionData.size();
    }
}
