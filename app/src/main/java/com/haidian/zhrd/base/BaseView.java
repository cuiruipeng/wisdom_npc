package com.haidian.zhrd.base;

/**
 * Time: 2020/3/11 9:13
 * <p>
 * Author: 橘子丶
 */
public interface BaseView {
    void showLoading();

    void hideLoading();

    void onError(int errorCode, String errorMsg);
}
