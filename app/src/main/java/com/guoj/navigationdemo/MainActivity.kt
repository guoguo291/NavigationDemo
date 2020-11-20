package com.guoj.navigationdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.guoj.navigationdemo.base.BaseActivity
import com.guoj.navigationdemo.base.BaseFragment

class MainActivity : BaseActivity() {
    override fun getLayoutResId(): Int {
        return R.layout.activity_main
    }
}