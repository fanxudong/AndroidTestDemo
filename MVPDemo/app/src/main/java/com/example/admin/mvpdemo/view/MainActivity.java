package com.example.admin.mvpdemo.view;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.admin.mvpdemo.R;
import com.example.admin.mvpdemo.model.presenter.Girl;
import com.example.admin.mvpdemo.presenter.IGirlPresenter;

import java.util.List;

public class MainActivity extends Activity implements IGirlView{

    private ListView listView;
    private MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);
        listView = (ListView) findViewById(R.id.listView);
        myAdapter = new MyAdapter(this);
        listView.setAdapter(myAdapter);
        new IGirlPresenter(this).fetch();
    }

    @Override
    public void showProgress() {

    }

    @Override
    public void showGirl(List<Girl> girlList) {
        myAdapter.setData(girlList);
    }
}
