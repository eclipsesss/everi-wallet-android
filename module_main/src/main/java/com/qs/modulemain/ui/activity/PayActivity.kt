package com.qs.modulemain.ui.activity

import com.qs.modulemain.R
import com.qs.modulemain.presenter.PayPresenter
import com.qs.modulemain.view.PayView
import com.smallcat.shenhai.mvpbase.base.BaseActivity
import com.smallcat.shenhai.mvpbase.extension.getResourceString


class PayActivity : BaseActivity<PayPresenter>(), PayView {

    override fun initPresenter() {
        mPresenter = PayPresenter(mContext)
    }

    override val layoutId: Int
        get() = R.layout.activity_pay

    override fun initData() {
        tvTitle?.text = getResourceString(R.string.everi_pay)
    }

    override fun loadSuccess(data: Any) {

    }

}
