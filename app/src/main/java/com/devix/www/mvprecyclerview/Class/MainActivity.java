package com.devix.www.mvprecyclerview.Class;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.Toast;


import com.devix.www.mvprecyclerview.Interface.MainPresenter;
import com.devix.www.mvprecyclerview.Interface.MainView;
import com.devix.www.mvprecyclerview.R;

import java.util.List;

public class MainActivity extends AppCompatActivity implements MainView, AdapterView.OnItemClickListener {

    private ListView listView;
    private ProgressBar progressBar;
    private MainPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.list);
        listView.setOnItemClickListener(this);
        progressBar = (ProgressBar) findViewById(R.id.progress);
        presenter = new MainPresenterImpl(this, new LoadItemsInteractorImpl());
    }

    @Override
    public void onResume() {
        super.onResume();
        presenter.onResumeJ();
    }

    @Override
    public void onDestroy() {
        presenter.onDestroyJ();
        super.onDestroy();
    }


    @Override
    public void showProgressJ() {
        progressBar.setVisibility(View.VISIBLE);
        listView.setVisibility(View.INVISIBLE);
    }

    @Override
    public void hideProgressJ() {
        progressBar.setVisibility(View.INVISIBLE);
        listView.setVisibility(View.VISIBLE);
    }

    @Override
    public void setItemsJ(List<String> items) {
        listView.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, items));
    }

    @Override
    public void showMessageJ(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
    presenter.onItemClickedJ(position);
    }
}
