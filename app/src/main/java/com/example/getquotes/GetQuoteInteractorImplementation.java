package com.example.getquotes;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import android.os.Handler;

public class GetQuoteInteractorImplementation implements MainContract.GetQuoteInteractor {
    //This class contains an ArrayList of Quotes

    private List<String> quoteList = Arrays.asList(
            "Only I can change my life.",
            "Learn to enjoy every minute of your life.",
            "Life is 10% what happens to you and 90% how you react to it.",
            "The greatest gift of life is friendship, and I have received it.",
            "Lighten up, just enjoy life, smile more, laugh more, and don't get so worked up about things."
    );

    private String getRandomQuote() {
        Random random = new Random();
        int index = random.nextInt(quoteList.size());
        return quoteList.get(index);

    }

    @Override
    public void getNextQuote(final MainContract.GetQuoteInteractor.onFinishedListener onFinishedListener) {
        //on completion fo the handler, the onFinished() in the GetQuoteInteractor interface will be triggered
        new Handler().postDelayed(new Runnable(){

            @Override
            public void run() {
                onFinishedListener.onFinished(getRandomQuote());

            }
        }, 1200);

    }
}
