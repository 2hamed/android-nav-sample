package com.hmomeni.androidnavigationsample

import android.app.Application
import com.hmomeni.androidnavigationsample.di.AppModule
import com.hmomeni.androidnavigationsample.di.DIComponent
import com.hmomeni.androidnavigationsample.di.DaggerDIComponent

class App : Application() {
    lateinit var di: DIComponent
    override fun onCreate() {
        super.onCreate()
        di = DaggerDIComponent.builder().appModule(AppModule()).build()
    }
}