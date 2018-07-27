package com.hencoder.hencoderpracticedraw1.activity;

import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.hencoder.hencoderpracticedraw1.R;
import com.hencoder.hencoderpracticedraw1.bean.CustomViewListBean;


import java.util.List;


/**
 * Created by domain on 2018-04-02.
 * Email:sunlongyue@foxmail.com
 * describe:
 */

public class MainAdapter extends BaseQuickAdapter<CustomViewListBean, BaseViewHolder> {

    public MainAdapter(int layoutResId, @Nullable List<CustomViewListBean> data) {
        super(layoutResId, data);
    }
    @Override
    protected void convert(BaseViewHolder helper, CustomViewListBean item) {
        helper.setText(R.id.tv_name, item.getName());
    }
}

