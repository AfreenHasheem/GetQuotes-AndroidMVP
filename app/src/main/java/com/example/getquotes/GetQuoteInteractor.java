package com.example.getquotes;

public interface GetQuoteInteractor {

    interface onFinishedListener {

        void onFinished(String string);

    }

    void getNextQuote(onFinishedListener onFinishedListener);
}
