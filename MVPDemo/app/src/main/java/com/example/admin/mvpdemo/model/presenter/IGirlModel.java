package com.example.admin.mvpdemo.model.presenter;

import java.util.List;

/**
 * Created by admin on 2016/8/15.
 */
public interface IGirlModel {

    void loadGirl(OnGirlLoadCompleter onGirlLoadCompleter);

    interface OnGirlLoadCompleter{
        void onCompleter(List<Girl> girlList);
    }
}
