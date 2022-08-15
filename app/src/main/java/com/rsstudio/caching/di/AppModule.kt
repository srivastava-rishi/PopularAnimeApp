package com.rsstudio.caching.di

import android.content.Context
import com.rsstudio.caching.application.AnimeApp
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun applicationContext( @ApplicationContext applicationContext: Context) : AnimeApp {
        return applicationContext as AnimeApp
    }
}