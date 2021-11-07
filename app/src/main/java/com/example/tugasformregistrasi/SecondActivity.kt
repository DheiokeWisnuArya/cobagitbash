package com.example.tugasformregistrasi

import android.app.Person
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    companion object{

        const val KEY_ORANG = "KEY_ORANG"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val tvSecondActivity = findViewById<TextView>(R.id.tv_second_activity)

        val person = intent.getParcelableExtra<Orang>(KEY_ORANG) as Orang

        tvSecondActivity.text = "Nama :  ${person.nama} \nAlamat : ${person.alamat} " +
                "\nNo Handphone :  ${person.nohp} "+
                "\nJenis Kelamin : ${person.jeniskelamin}"+
                "\nJenis Kendaraan : ${person.jeniskendaraan}"
    }
}