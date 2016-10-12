package com.example.admin.mvpdemo.presenter;

import com.example.admin.mvpdemo.model.presenter.Girl;
import com.example.admin.mvpdemo.model.presenter.GirlModelImpl;
import com.example.admin.mvpdemo.model.presenter.IGirlModel;
import com.example.admin.mvpdemo.view.IGirlView;

import java.util.List;

/**
 * Created by admin on 2016/8/15.
 */
public class IGirlPresenter {

    //View Interface
    IGirlModel iGirlModel = new GirlModelImpl();


    //Model Interface
    IGirlView iGirlView;

    public IGirlPresenter(IGirlView iGirlView){
        super();
        this.iGirlView =iGirlView;
    }

    public void fetch(){
        if(iGirlView!=null){
            iGirlView.showProgress();
            iGirlModel.loadGirl(new IGirlModel.OnGirlLoadCompleter() {
                @Override
                public void onCompleter(List<Girl> girlList) {
                    iGirlView.showGirl(girlList);
                }
            });
        }
    }
}
