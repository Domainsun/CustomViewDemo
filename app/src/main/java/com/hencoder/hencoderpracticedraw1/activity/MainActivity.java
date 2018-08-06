package com.hencoder.hencoderpracticedraw1.activity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.hencoder.hencoderpracticedraw1.R;
import com.hencoder.hencoderpracticedraw1.bean.CustomViewListBean;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.rv)
    RecyclerView recyclerview;
    MainAdapter mainAdapter = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) { //this sententce is test for git2
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initAdapter();
        initData();
    }
    /*填充数据*/
    private void initData(){
        List<CustomViewListBean> listBeans=new ArrayList<>();
        CustomViewListBean bean=new CustomViewListBean();
        bean.setName("canvans 基础操作");
        CustomViewListBean bean1=new CustomViewListBean();
        bean1.setName("自定义view 顺序");
        listBeans.add(bean);
        listBeans.add(bean1);
        mainAdapter.setNewData(listBeans);
    }

    /* 初始化adapter*/
    public void initAdapter() {
        mainAdapter = new MainAdapter(R.layout.item_text, null);
        LinearLayoutManager mManager = new LinearLayoutManager(this);
        recyclerview.setLayoutManager(mManager);
//        recyclerview.addItemDecoration(new DefaultItemDecoration(Color.parseColor("#f0f3f5")));
        recyclerview.setAdapter(mainAdapter);

        mainAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                Intent intent = null;
                switch (position) {
                    case 0:
                        intent = new Intent(MainActivity.this, CustomViewBasicActivity.class);
                        break;
                    case 1:
                        intent = new Intent(MainActivity.this, DrawOrderActivity.class);
                        break;
                }
                startActivity(intent);
            }
        });
    }
}
