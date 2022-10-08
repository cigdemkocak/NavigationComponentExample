package com.cigdemkocak.navigationcomponentexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.cigdemkocak.navigationcomponentexample.databinding.FragmentSayfaABinding

class SayfaAFragment : Fragment() {
    private lateinit var tasarim:FragmentSayfaABinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        tasarim = FragmentSayfaABinding.inflate(inflater, container, false)

        tasarim.buttonAdanB.setOnClickListener{
            Navigation.findNavController(it).navigate(R.id.aSayfasindanBSayfasina)

        }
        return tasarim.root
    }


}