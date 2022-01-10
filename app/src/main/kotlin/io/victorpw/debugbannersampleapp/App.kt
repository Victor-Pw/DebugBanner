package io.victorpw.debugbannersampleapp

import android.app.Application
import io.victorpw.debugBanner.DebugBanner


/**
 *
 * Created by Arman Chatikyan on 20 Aug 2018
 *
 */

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        DebugBanner.init(application = this)
    }
}