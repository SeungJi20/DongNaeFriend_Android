package com.example.dongnaefriend_android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.renderscript.ScriptGroup.Binding
import com.example.dongnaefriend_android.databinding.ActivityHomeBinding
import com.example.dongnaefriend_android.databinding.FragmentCommunityBinding

class HomeActivity : AppCompatActivity() {
    private lateinit var Binding:ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(Binding.root)

        supportFragmentManager
            .beginTransaction()
            .replace(Binding.containerFragment.id, HomeFragment())
            .commitAllowingStateLoss()

        Binding.navBottom.run{
            setOnItemSelectedListener {
                when(it.itemId){
                    R.id.menu_home ->{
                        supportFragmentManager
                            .beginTransaction()
                            .replace(Binding.containerFragment.id, HomeFragment())
                            .commitAllowingStateLoss()
                    }
                    R.id.menu_commnunity ->{
                        supportFragmentManager
                            .beginTransaction()
                            .replace(Binding.containerFragment.id, CommunityFragment())
                            .commitAllowingStateLoss()
                    }
                    R.id.menu_dongnaeinformation ->{
                        supportFragmentManager
                            .beginTransaction()
                            .replace(Binding.containerFragment.id, DongnaeinformationFragment())
                            .commitAllowingStateLoss()
                    }
                    R.id.menu_accountbook ->{
                        supportFragmentManager
                            .beginTransaction()
                            .replace(Binding.containerFragment.id, AccountbookFragment())
                            .commitAllowingStateLoss()
                    }
                    R.id.menu_mypage ->{
                        supportFragmentManager
                            .beginTransaction()
                            .replace(Binding.containerFragment.id, MypageFragment())
                            .commitAllowingStateLoss()
                    }
                }
                true
            }
            selectedItemId = R.id.menu_home

        }


    }
}