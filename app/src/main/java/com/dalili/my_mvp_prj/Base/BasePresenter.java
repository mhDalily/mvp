package com.dalili.my_mvp_prj.Base;

public interface BasePresenter<T extends BaseView> {
    void attachView(T view);
    void detachView();
}
