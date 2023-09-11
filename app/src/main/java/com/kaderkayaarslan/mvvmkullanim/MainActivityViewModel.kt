package com.kaderkayaarslan.mvvmkullanim

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel()  {
    var sonuc = MutableLiveData<String>()
    var mrepo = Repository()

    init {
        sonuc = mrepo.MatematikselSonucGetir()
    }

    fun toplamaYap(alinanSayi1:String,alinanSayi2:String){
        mrepo.topla(alinanSayi1,alinanSayi2)
    }
    fun carpmaYap(alinanSayi1:String,alinanSayi2:String){
        mrepo.carp(alinanSayi1,alinanSayi2)

    }


}