package com.hmomeni.androidnavigationsample.di

import com.hmomeni.androidnavigationsample.MainActivity
import com.hmomeni.androidnavigationsample.fragments.FragmentFour
import com.hmomeni.androidnavigationsample.fragments.FragmentOne
import com.hmomeni.androidnavigationsample.fragments.FragmentThree
import com.hmomeni.androidnavigationsample.fragments.FragmentTwo
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class])
interface DIComponent {
    fun inject(mainActivity: MainActivity)
    fun inject(mainActivity: FragmentOne)
    fun inject(fragmentTwo: FragmentTwo)
    fun inject(fragmentThree: FragmentThree)
    fun inject(fragmentFour: FragmentFour)
}