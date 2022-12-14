package com.cigdemkocak.navigationcomponentexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.cigdemkocak.navigationcomponentexample.databinding.FragmentSayfaXBinding


class SayfaXFragment : Fragment() {
    private lateinit var tasarim:FragmentSayfaXBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        tasarim = FragmentSayfaXBinding.inflate(inflater, container, false)
        tasarim.buttonXdenY.setOnClickListener{
            Navigation.findNavController(it).navigate(R.id.xSayfasindanYsayfasina)
        }
        return tasarim.root
    }


}