package ymbky.firstcodesunnyweather.com.logic.network

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query
import ymbky.firstcodesunnyweather.com.SunnyWeatherApplication
import ymbky.firstcodesunnyweather.com.logic.model.PlaceResponse

interface PlaceService {
    @GET("v2/place?token=${SunnyWeatherApplication.TOKEN}&lang=zh_CN")
    fun searchPlace(@Query("query")query: String): Call<PlaceResponse>
}