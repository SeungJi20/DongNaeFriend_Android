package com.example.dongnaefriend_android

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.dongnaefriend_android.databinding.FragmentDongnaeinformationBinding


class DongnaeinformationFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return FragmentDongnaeinformationBinding.inflate(layoutInflater).root
    }

}