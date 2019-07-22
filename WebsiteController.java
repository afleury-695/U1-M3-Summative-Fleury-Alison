//Quote of the day controller -- I elected to leave it as WebSiteController since it was just easier than redoing the name


package com.company.U1M3SummativeFleuryAlison59;

//imports needed to run this one
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

@RestController
public class WebsiteController {

    //private int id;
    private List<Quotes> quoteList;

    //the random generator setup
    public Random randomGenerator;

    public WebsiteController() {


        this.quoteList = new ArrayList<>();
        quoteList.add(new Quotes("People who don't like cats', said Valancy, 'Always seem to think there is a particular virtue in not liking them.", "Valancy of the Blue Castle"));
        quoteList.add(new Quotes("I have no authority to be believed, nor do I desire it, being too conscious of my own inerudition to be able to instruct others.", "Michel de Montaigne"));
        quoteList.add(new Quotes("I have no special talent, I am only passionately curious.", "Albert Einstien"));
        quoteList.add(new Quotes("A great man is always willing to be little.", "Emerson"));
        quoteList.add(new Quotes("The greatest wealth is to be willing to live with little.", "Plato"));
        quoteList.add(new Quotes("I don't think of all the misery but of all the beauty that still remains.", "Anne Frank"));
        quoteList.add(new Quotes("Little by little, one travels far.", "J.R.R. Tolkien"));
        quoteList.add(new Quotes("All I was doing was trying to get home from work.", "Rosa Parks"));
        quoteList.add(new Quotes("You only live once, but if you do it right, once is enough.", "Mae West"));
        quoteList.add(new Quotes("Fear is stupid.  So are regrets.", "Marilyn Monroe"));

    }
    //generating a random number -- note, you have to restart the server to get a new one (so run the program again and then hit postman GET)
    Random rand = new Random();

    int random = rand.nextInt(10);

    //GET Command for get quote of the day :)
    @RequestMapping(value = "/quote", method = RequestMethod.GET)
    public Quotes getQuoteList() {
        return this.quoteList.get(random);

    }
}



