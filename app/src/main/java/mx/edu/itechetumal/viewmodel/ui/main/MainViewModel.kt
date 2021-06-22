package mx.edu.itechetumal.viewmodel.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
//import androidx.

class MainViewModel : ViewModel() {
    // TODO: Implement the ViewModel
    private val  usdToPesos=20.35f
    private var pesosTxt=""
    private var result = 0f
    //private var result:MutableLiveData<Float> = MutableLiveData()

    //calculate the resulkts
    fun setAmount(value: String){
        pesosTxt=value
        result = value.toFloat()*usdToPesos
        //result.setValue(value.toFloat()*usdToPesos)
    }

    //fun getResult():Float?{
    fun getResult():Float?{
        return result
    }
}