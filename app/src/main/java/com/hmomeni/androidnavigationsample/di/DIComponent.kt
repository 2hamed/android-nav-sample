package com.hmomeni.androidnavigationsample.di

import com.hmomeni.androidnavigationsample.MainActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class])
interface DIComponent {
    fun inject(mainActivity: MainActivity)
}