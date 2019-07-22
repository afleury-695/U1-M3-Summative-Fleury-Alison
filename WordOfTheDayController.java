//Controller for the Word of the Day function

package com.company.U1M3SummativeFleuryAlison59;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

@RestController
public class WordOfTheDayController {

    private List<WordOfTheDay> wordList;
    public Random randomGenerator;

    public WordOfTheDayController() {


        this.wordList = new ArrayList<>();
        wordList.add(new WordOfTheDay("Java", "A slang term for coffee"));
        wordList.add(new WordOfTheDay("Unobtrusive", "Unassuming; not in the way"));
        wordList.add(new WordOfTheDay("Habit", "Something that occurs regularly, i.e. a 'force of habit'"));
        wordList.add(new WordOfTheDay("Vernacular", "Everyday slang, i.e. 'they chose to write the book in the local vernacular so that the youth would understand it."));
        wordList.add(new WordOfTheDay("Reiterate", "To repeat or to restate with the intent of making a point more clear"));
        wordList.add(new WordOfTheDay("Redaction", "The art of preparing something for publication"));
        wordList.add(new WordOfTheDay("Cogent", "Appealing forcibly to the mind or reason : convincing"));
        wordList.add(new WordOfTheDay("Illiterate", "Uneducated or poorly educated, unable to achieve literacy"));
        wordList.add(new WordOfTheDay("Auxiliary", " Functioning in a subsidiary capacity"));
        wordList.add(new WordOfTheDay("Provender", "Food, victuals"));

    }

    //generating a random number -- note, you have to restart the server to get a new one (so run the program again and then hit postman GET)
    Random rand = new Random();
    int random = rand.nextInt(10);

    //GET command to get a random word
    @RequestMapping(value = "/word", method = RequestMethod.GET)
    public WordOfTheDay getId() {
        return this.wordList.get(random);
    }
}


