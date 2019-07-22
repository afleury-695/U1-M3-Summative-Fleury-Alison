//Class for the quote of the day function

package com.company.U1M3SummativeFleuryAlison59;

//imports
import java.util.Random;

public class Quotes {
    public String quote;
    public String author;


    //setting up random generator
    Random generator = new Random();
    int roll = generator.nextInt(10) + 1;

    //constructors
    public Quotes() {

    }

    Quotes(String quote, String author) {
        this.quote = quote;
        this.author = author;

    }

    //getters and setters
    public String getQuote() { return quote; }

    public void setQuote(String quote) { this.quote = quote; }

    public String getAuthor() { return author; }

    public void setAuthor(String author) { this.author = author; }


}
