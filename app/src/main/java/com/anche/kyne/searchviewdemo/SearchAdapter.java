package com.anche.kyne.searchviewdemo;

import android.content.Context;

import java.util.List;

/**
 * Created by Programmer on 2017/11/1.
 */

public class SearchAdapter extends CommonAdapter<SearchBean> {

    public SearchAdapter(Context context, List<SearchBean> data, int layoutId) {
        super(context, data, layoutId);
    }

    @Override
    public void convert(ViewHolder holder, int position) {

        holder.setImageResource(R.id.item_search_iv_icon,mData.get(position).getIconId())
                .setText(R.id.item_search_tv_title,mData.get(position).getTitle())
                .setText(R.id.item_search_tv_content,mData.get(position).getContent())
                .setText(R.id.item_search_tv_comments,mData.get(position).getComments());
    }
}
