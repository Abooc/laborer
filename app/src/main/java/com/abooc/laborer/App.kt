package com.abooc.laborer

import android.app.Application
import com.abooc.widget.Toast

/**
 * Created by dayu on 2017/9/1.
 */
class App : Application() {

    override fun onCreate() {
        super.onCreate()
        Toast.init(this)
    }

}