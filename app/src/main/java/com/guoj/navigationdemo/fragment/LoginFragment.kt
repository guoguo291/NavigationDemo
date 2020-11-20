package com.guoj.navigationdemo.fragment

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import com.guoj.navigationdemo.R
import com.guoj.navigationdemo.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_login.*

class LoginFragment:BaseFragment() {
    override fun getLayoutResId(): Int {
        return R.layout.fragment_login
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun initView() {
        val navController = findNavController()
        btn_toForgetPage.setOnClickListener {
            navController.navigate(R.id.action_login_fragment_to_forget_fragment)
        }
        btn_toRegisterPage.setOnClickListener {
            navController.navigate(R.id.action_login_fragment_to_registerFragment)
        }
    }
}