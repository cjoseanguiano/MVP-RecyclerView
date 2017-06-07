package com.devix.www.mvprecyclerview.Class;

import android.os.Handler;

import com.devix.www.mvprecyclerview.Interface.LoadItemsInteractor;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Carlos Anguiano on 06/06/17.
 * For more info contact: c.joseanguiano@gmail.com
 */

public class LoadItemsInteractorImpl implements LoadItemsInteractor {
    @Override
    public void findItemsJ(final OnFinishedListener listener) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                listener.onFinishedJ(createArrayList());
            }
        }, 2000);
    }

    private List<String> createArrayList() {

        return Arrays.asList(
                "1", "2", "3", "4", "5", "6", "7", "8", "9", "10","11","12","13","14","15"
        );
    }
}
