package com.company.U1M3SummativeFleuryAlison59;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.http.HttpStatus;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

@RestController
public class Magic8BallController {

    //private int id;
    private List<Magic8Answers> magic8AnswersList;

    public Magic8BallController() {

        //this.id = 1;

        this.magic8AnswersList = new ArrayList<>();

        magic8AnswersList.add(new Magic8Answers("I wish I could tell you."));
        magic8AnswersList.add(new Magic8Answers("That is not in the cards."));
        magic8AnswersList.add(new Magic8Answers("YES"));
        magic8AnswersList.add(new Magic8Answers("Maybe"));
        magic8AnswersList.add(new Magic8Answers("You would be a fool to think it"));
        magic8AnswersList.add(new Magic8Answers("Soon, you will see that this is to be true."));

    }


    Random rand = new Random();
    int random = rand.nextInt(10);


    @RequestMapping(value = "/magic", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.CREATED)
    public Magic8Answers getQuoteList(@RequestBody Magic8Answers question) {
        this.magic8AnswersList.add(question);
        return this.magic8AnswersList.get(random);
    }

}
