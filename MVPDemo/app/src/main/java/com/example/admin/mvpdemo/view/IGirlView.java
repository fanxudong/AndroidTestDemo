package com.example.admin.mvpdemo.view;

import com.example.admin.mvpdemo.model.presenter.Girl;

import java.util.List;

/**
 * Created by admin on 2016/8/15.
 */
public interface IGirlView {

    void showProgress();

    void showGirl(List<Girl> girlList);
}
