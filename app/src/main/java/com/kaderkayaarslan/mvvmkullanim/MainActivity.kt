package com.kaderkayaarslan.mvvmkullanim

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.kaderkayaarslan.mvvmkullanim.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var tasarim : ActivityMainBinding
    private val viewModel:MainActivityViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tasarim = DataBindingUtil.setContentView(this,R.layout.activity_main)

        tasarim.maninActivityNesnesi = this

        viewModel.sonuc.observe(this,{ s ->
            tasarim.hesaplamaSonuc = s
        })

       
    }

    fun buttonToplamaTikla(alinanSayi1:String,alinanSayi2:String){
        viewModel.toplamaYap(alinanSayi1,alinanSayi2)

    }
    fun buttonCarpmaTikla(alinanSayi1:String,alinanSayi2:String){
        viewModel.carpmaYap(alinanSayi1,alinanSayi2)



    }

}