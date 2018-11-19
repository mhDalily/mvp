package com.dalili.my_mvp_prj.Home;

import com.dalili.my_mvp_prj.Base.BasePresenter;
import com.dalili.my_mvp_prj.Base.BaseView;
import com.dalili.my_mvp_prj.data.news;

import java.util.List;

public interface HomeContract  {
    interface View extends BaseView{
        void showNewsList(List<news> newsList);
    }
    interface Presenter extends BasePresenter<View>{
        void getNewsList();
    }
}
