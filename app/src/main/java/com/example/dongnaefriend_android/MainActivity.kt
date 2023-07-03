package com.example.dongnaefriend_android

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.renderscript.ScriptGroup.Binding
import androidx.activity.result.contract.ActivityResultContracts
import com.example.dongnaefriend_android.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var Binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(Binding.root)

        Binding.btnStart.setOnClickListener{
            val intent = Intent(this,HomeActivity::class.java)

            startActivity(intent)
        }

    }
}