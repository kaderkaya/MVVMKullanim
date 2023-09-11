package com.kaderkayaarslan.mvvmkullanim

import androidx.lifecycle.MutableLiveData

class Repository {
    var MatematikselSonuc = MutableLiveData<String>()


    init {
        MatematikselSonuc = MutableLiveData<String>("0")
    }
    fun MatematikselSonucGetir() :  MutableLiveData<String> {
         return MatematikselSonuc
    }

    fun topla(alinanSayi1:String,alinanSayi2:String){
        val sayi1 = alinanSayi1.toInt()
        val sayi2 = alinanSayi2.toInt()
        val toplam = sayi1 + sayi2
        MatematikselSonuc.value = toplam.toString()

    }
    fun carp(alinanSayi1:String,alinanSayi2:String){
        val sayi1 = alinanSayi1.toInt()
        val sayi2 = alinanSayi2.toInt()
        val toplam = sayi1 * sayi2
        MatematikselSonuc.value = toplam.toString()

    }
}