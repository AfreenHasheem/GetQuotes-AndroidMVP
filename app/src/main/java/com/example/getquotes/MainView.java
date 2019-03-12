package com.example.getquotes;

public interface MainView {

   /* showProgress() and hideProgress() would be used for displaying and hiding the progressBar
    while the next random quote is fetched from the GetQuoteInteractorImpl class*/

    void showPogress();

    void hideProgress();

    //setQuote() will set the random string on the textView.
    void setQuote(String quote);
}
