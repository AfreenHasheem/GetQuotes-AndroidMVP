package com.example.getquotes;

public class MainPresenterImplementation implements MainPresenter, GetQuoteInteractor.onFinishedListener {

    //objects of the View Interface and Model Interface(i.e Interactor) created here

    private MainView mainView;
    private GetQuoteInteractor getQuoteInteractor;

    public MainPresenterImplementation(MainView mainView, GetQuoteInteractor getQuoteInteractor) {
        this.mainView = mainView;
        this.getQuoteInteractor = getQuoteInteractor;
    }

   /* onButtonClick method would be triggered in the MainActivity
    class when the button is clicked and will display a progressBar while it gets the next random quote.*/
    @Override
    public void onButtonClick() {
        if(mainView != null){
            mainView.showPogress();
        }

        getQuoteInteractor.getNextQuote(this);

    }

    //onDestroy() method would be invoked inside the lifecycle method onDestroy() of the MainActivity.
    @Override
    public void onDestroy() {
        mainView = null;

    }

   /* onFinished() method gets called when the handler is completed inside the GetQuoteInteractorImpl.
    It returns the string which will be displayed in the TextView using the MainView’s instance.*/
    @Override
    public void onFinished(String quote) {
        if (mainView != null){
            mainView.setQuote(quote);
            mainView.hideProgress();
        }

    }
}
