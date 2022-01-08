package ymbky.firstcodesunnyweather.com

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

class SunnyWeatherApplication:Application() {
    companion object{
        const val TOKEN="FEJ4okCp4qJnaFMN"
        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context
    }

    override fun onCreate() {
        super.onCreate()
        context=applicationContext
    }
}