package matshagen.example.androidjetpacktest.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import matshagen.example.androidjetpacktest.model.PlacesResponse

class ListViewModel: ViewModel() {

    val places = MutableLiveData<List<PlacesResponse.Feature.Properties>>()
    val placesLoadError = MutableLiveData<Boolean>()
    val loading = MutableLiveData<Boolean>()

    fun refresh() {
        val place1 = PlacesResponse.Feature.Properties("Icon", 111, "Oslo")
        val place2 = PlacesResponse.Feature.Properties("Icon", 222, "Stockholm")
        val place3 = PlacesResponse.Feature.Properties("Icon", 333, "Copenhagen")
        val placeList = arrayListOf<PlacesResponse.Feature.Properties>(place1, place2, place3)

        places.value = placeList
        placesLoadError.value = false
        loading.value = false

    }

}