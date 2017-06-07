package com.devix.www.mvprecyclerview.Interface;

import java.util.List;

/**
 * Created by Carlos Anguiano on 06/06/17.
 * For more info contact: c.joseanguiano@gmail.com
 */

public interface LoadItemsInteractor {
    interface OnFinishedListener {
        void onFinishedJ(List<String> items);
    }

    void findItemsJ(OnFinishedListener listener);
}
