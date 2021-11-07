package com.example.tugasformregistrasi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.*

class MainActivity : AppCompatActivity() {

    var TAG = "MainActivity"
    var jenisKelaminTerpilih: String = ""
    var jenisKendaraanTerpilih: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i(TAG, "onCreate")

        val buttonsubmit = findViewById<Button>(R.id.btnsubmit)
        val buttonreset = findViewById<Button>(R.id.btnreset)

        buttonsubmit.setOnClickListener{
            val etNama = findViewById<EditText>(R.id.et_nama).text.toString()
            val etAlamat = findViewById<EditText>(R.id.et_alamat).text.toString()
            val etNohandphone = findViewById<EditText>(R.id.et_nohp).text.toString()
            val orang = Orang (etNama, etAlamat, etNohandphone, jenisKelaminTerpilih, jenisKendaraanTerpilih)

            val moveIntent = Intent(this@MainActivity, SecondActivity::class.java)
            moveIntent.putExtra(SecondActivity.KEY_ORANG, orang)
            startActivity(moveIntent)
        }

        buttonreset.setOnClickListener{
            val etNama = findViewById<EditText>(R.id.et_nama).setText("")
            val etAlamat = findViewById<EditText>(R.id.et_alamat).setText("")
            val etNohandphone = findViewById<EditText>(R.id.et_nohp).setText("")


        }
    }

    fun onRadioButtonClicked(view: android.view.View) {
        if (view is RadioButton){
            val checked = view.isChecked

            when (view.getId()){
                R.id.rb_laki ->
                    if (checked){
                        jenisKelaminTerpilih = findViewById<RadioButton>(R.id.rb_laki).text.toString()
                    }
                R.id.rb_perempuan ->
                    if (checked){
                        jenisKelaminTerpilih = findViewById<RadioButton>(R.id.rb_perempuan).text.toString()
                    }
            }

        }
    }

    fun onCheckBoxClicked(view: android.view.View) {
        if (view is CheckBox){
            val checked = view.isChecked

            when (view.getId()){
                R.id.cb_canter ->
                    if (checked){
                        jenisKendaraanTerpilih = findViewById<CheckBox>(R.id.cb_canter).text.toString()
                    }
                R.id.cb_isuzu ->
                    if (checked){
                        jenisKendaraanTerpilih = findViewById<CheckBox>(R.id.cb_isuzu).text.toString()
                    }
                R.id.cb_hino ->
                    if (checked){
                        jenisKendaraanTerpilih = findViewById<CheckBox>(R.id.cb_hino).text.toString()
                    }
                R.id.cb_quester ->
                    if (checked){
                        jenisKendaraanTerpilih = findViewById<CheckBox>(R.id.cb_quester).text.toString()
                    }
            }
        }
    }

}