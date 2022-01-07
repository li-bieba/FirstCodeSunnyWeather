package ymbky.firstcodesunnyweather.com.ui.place

import android.app.DownloadManager
import android.view.animation.Transformation
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import ymbky.firstcodesunnyweather.com.logic.Repository
import ymbky.firstcodesunnyweather.com.logic.model.Place

class PlaceViewModel:ViewModel (){
    private val searchLiveData= MutableLiveData<String>()

    val placeList=ArrayList<Place>()

    val placeLiveData= Transformations.switchMap(searchLiveData){
        query->
        Repository.searchPlaces(query)
    }
    fun searchPlaces(query:String){
        searchLiveData.value=query
    }
}