package com.dalili.my_mvp_prj.Home;

import android.content.Context;
import android.support.v4.app.Fragment;

import com.dalili.my_mvp_prj.data.news;

import java.util.List;

public class HomeFragment extends Fragment implements HomeContract.View {
    @Override
    public void showNewsList(List<news> newsList) {

    }


    @Override
    public Context getViewContext() {
        return null;
    }
}
