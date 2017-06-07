package com.devix.www.mvprecyclerview.Class;

import com.devix.www.mvprecyclerview.Interface.LoadItemsInteractor;
import com.devix.www.mvprecyclerview.Interface.MainPresenter;
import com.devix.www.mvprecyclerview.Interface.MainView;

import java.util.List;

/**
 * Created by Carlos Anguiano on 06/06/17.
 * For more info contact: c.joseanguiano@gmail.com
 */

public class MainPresenterImpl implements MainPresenter, LoadItemsInteractor.OnFinishedListener {

    private MainView mainView;
    private LoadItemsInteractor findItemsInteractor;

    public MainPresenterImpl(MainView mainView, LoadItemsInteractor findItemsInteractor) {
        this.mainView = mainView;
        this.findItemsInteractor = findItemsInteractor;
    }

    @Override
    public void onResumeJ() {
        if (mainView != null) {
            mainView.showProgressJ();
        }
        findItemsInteractor.findItemsJ(this);
    }

    @Override
    public void onItemClickedJ(int position) {
        if (mainView != null) {
            mainView.showMessageJ("Position " + (position + 1) + " clicked");
        }
    }

    @Override
    public void onDestroyJ() {
        mainView = null;
    }

    @Override
    public void onFinishedJ(List<String> items) {
        if (mainView != null) {
            mainView.setItemsJ(items);
            mainView.hideProgressJ();
        }
    }
}
