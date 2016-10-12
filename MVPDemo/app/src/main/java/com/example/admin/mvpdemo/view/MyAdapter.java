package com.example.admin.mvpdemo.view;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.admin.mvpdemo.R;
import com.example.admin.mvpdemo.adapter.MyBaseAdapter;
import com.example.admin.mvpdemo.model.presenter.Girl;

import java.util.List;

/**
 * Created by admin on 2016/8/16.
 */
public class MyAdapter extends MyBaseAdapter {

    private List<Girl> girlList;
    private Context context;
    
    public MyAdapter(Context context){
        this.context = context;
    }

    public void setData(List<Girl> girlList){
        this.girlList = girlList;
        notifyDataSetChanged();
    }
    @Override
    public int getCount() {
        if(girlList==null || girlList.size()==0){
            return 0;
        }
        return girlList.size();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = View.inflate(context, R.layout.list_item,null);
        TextView tv_name = (TextView) convertView.findViewById(R.id.tv_name);
        tv_name.setText(girlList.get(position).getGirlName());
        return convertView;
    }
}
