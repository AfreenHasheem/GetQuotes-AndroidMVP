package com.example.getquotes;

public interface MainContract {

    interface MainView {

   /* showProgress() and hideProgress() would be used for displaying and hiding the progressBar
    while the next random quote is fetched from the GetQuoteInteractorImpl class*/

        void showPogress();

        void hideProgress();

        //setQuote() will set the random string on the textView.
        void setQuote(String quote);
    }

    interface MainPresenter {

        void onButtonClick();

        void onDestroy();
    }

    interface GetQuoteInteractor {

        interface onFinishedListener {

            void onFinished(String string);

        }

        void getNextQuote(com.example.getquotes.MainContract.GetQuoteInteractor.onFinishedListener onFinishedListener);
    }



}
