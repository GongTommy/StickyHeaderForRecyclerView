package com.xuanyu.stickyheader.sample;

import android.content.Context;
import android.view.View;

import com.xuanyu.stickyheader.BaseStickyHeaderModel;

public class StickyModel extends BaseStickyHeaderModel<HeaderStringModelImplSticky> {

    @Override
    public View getStickyView(Context context) {
        System.out.println("jiangbin getView");
        HeaderViewImplSticky headerView = new HeaderViewImplSticky(context);
        return headerView;
    }

    @Override
    public void onBindView(View view, HeaderStringModelImplSticky data) {

    }
}
