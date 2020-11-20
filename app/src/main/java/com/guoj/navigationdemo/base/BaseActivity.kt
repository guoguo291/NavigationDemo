package com.guoj.navigationdemo.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.guoj.navigationdemo.R

abstract class BaseActivity:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutResId())
    }
    abstract fun getLayoutResId(): Int
}