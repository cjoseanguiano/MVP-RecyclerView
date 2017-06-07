package com.devix.www.mvprecyclerview.Interface;

import java.util.List;

/**
 * Created by Carlos Anguiano on 06/06/17.
 * For more info contact: c.joseanguiano@gmail.com
 */

public interface MainView {

    void showProgressJ();

    void hideProgressJ();

    void setItemsJ(List<String> items);

    void showMessageJ(String message);
}
