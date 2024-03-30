package com.example.discountapp.viewModels

import androidx.compose.runtime.State
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class CalculateViewModel2:ViewModel() {

//    private  val _price = mutableStateOf("")
//    val price: State<String> = _price

    var price by mutableStateOf("")
        private set
//    fun onValuePrice(value:String) {
//        price = value;
//    }
    var discount by mutableStateOf("")
        private set
//    fun onValueDiscount(value: String){
//        discount = value
//    }
    fun onValue(value: String,text:String){
        when(text){
            "price" -> price = value
            "discount" -> discount = value
        }
    }
    var priceDiscount by mutableStateOf(0.0)
        private set
    var totalDiscount by mutableStateOf(0.0)
        private set
    var showAlert by mutableStateOf(false)
        private set

    fun calculate(){
        if(price != "" &&  discount != ""){
            priceDiscount = calculatePrice(price.toDouble(),discount.toDouble())
            totalDiscount = calculateDiscount(price.toDouble(),discount.toDouble())
        }else{
            showAlert = true
        }
    }

    private fun calculatePrice(price:Double,discount:Double):Double{
        val res = price - calculateDiscount(price,discount)
        return kotlin.math.round(res * 100) / 100.0
    }

    private fun calculateDiscount(price:Double,discount:Double):Double{
        val res = price * (1 - discount / 100)
        return kotlin.math.round(res * 100) / 100.0
    }

    fun clear(){
        price = ""
        discount = ""
        priceDiscount = 0.0
        totalDiscount = 0.0
    }

    fun cancelAlert(){
        showAlert = false
    }
}