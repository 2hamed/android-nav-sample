package com.hmomeni.androidnavigationsample.di

import com.hmomeni.androidnavigationsample.nav.NavEvent
import dagger.Module
import dagger.Provides
import io.reactivex.processors.PublishProcessor
import javax.inject.Singleton

@Module
class AppModule {
    @Provides
    @Singleton
    fun providesNavEvents(): PublishProcessor<NavEvent> = PublishProcessor.create()
}