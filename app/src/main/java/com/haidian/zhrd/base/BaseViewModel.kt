package com.haidian.zhrd.base;

import android.app.Application
import android.util.Pair
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.MutableLiveData
import com.kunminx.architecture.ui.callback.UnPeekLiveData

abstract class BaseViewModel(application: Application) : AndroidViewModel(application) {

    lateinit var lifecycleOwner: LifecycleOwner

    val errorLiveData = UnPeekLiveData<Pair<String, String>>()

    val toastLiveData = UnPeekLiveData<String>()

    val hideLoadingViewLiveData = MutableLiveData<Boolean>()

    val throwError = { errCode: Int, errMsg: String ->
        errorLiveData.value = Pair("$errCode", errMsg)
        Unit
    }

    fun showMsg(msg: String) {
        toastLiveData.value = msg
    }
}