package ymbky.firstcodesunnyweather.com.logic


import androidx.lifecycle.liveData
import kotlinx.coroutines.Dispatchers
import ymbky.firstcodesunnyweather.com.logic.model.Place
import ymbky.firstcodesunnyweather.com.logic.network.SunnyWeatherNetwork
import java.lang.Exception
import java.lang.RuntimeException

object Repository {
    fun searchPlaces(query:String)=liveData(Dispatchers.IO){
        val result=try {
            val placeResponse=SunnyWeatherNetwork.searchPlaces(query)
            if (placeResponse.status=="ok"){
                val places=placeResponse.places
                Result.success(places)
            }else{
                Result.failure(RuntimeException("Response status is ${placeResponse.status}"))
            }
        }catch (e:Exception){
            Result.failure<List<Place>>(e)
        }
        emit(result)
    }
}