package com.androidproject.comarkdown.account.setting

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.androidproject.comarkdown.R

/**
 * Created by evan on 2018/1/11.
 */
class SettingFragment:Fragment(),SettingContract.View{
    override lateinit var presenter: SettingContract.Presenter
    override var isActive: Boolean = false
        get() = isAdded

    override fun onResume() {
        super.onResume()
        presenter.start()
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater?.inflate(R.layout.activity_setting, null)
        return view
    }

    override fun getViewContext(): Context {
        return context
    }
}