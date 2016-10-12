package com.example.admin.mvpdemo.model.presenter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 2016/8/15.
 */
public class GirlModelImpl implements IGirlModel {

    @Override
    public void loadGirl(OnGirlLoadCompleter onGirlLoadCompleter) {
        List<Girl> girlList = new ArrayList<>();
        for (int i=0;i< 50;i++){
            Girl girl = new Girl();
            girl.setGirlName("美女"+(i+1)+"号");
            girlList.add(girl);
        }



    }
}
