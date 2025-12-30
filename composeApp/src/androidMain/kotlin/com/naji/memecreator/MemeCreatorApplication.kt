package com.naji.memecreator

import android.app.Application
import com.naji.memecreator.di.initKoin
import org.koin.android.ext.koin.androidContext

class MemeCreatorApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        initKoin {
            androidContext(this@MemeCreatorApplication)
        }
    }
}