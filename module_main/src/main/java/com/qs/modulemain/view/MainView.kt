package com.qs.modulemain.view

import com.smallcat.shenhai.mvpbase.base.BaseView

interface MainView: BaseView{
    fun loginSuccess(data: String)
}