package com.company.U1M3SummativeFleuryAlison59;

//Class for the word of the day function
public class WordOfTheDay {

    public String word;
    public String definition;

    //constructors
    public WordOfTheDay() {

    }

    WordOfTheDay(String word, String definition) {
        this.word = word;
        this.definition = definition;
        //public String question;

    }
    //getters in setters in case these are needed
    public String getWord() { return word; }

    public void setWord(String word) { this.word = word; }

    public String getDefinition() { return definition; }

    public void setDefinition(String definition) { this.definition = definition; }

}


