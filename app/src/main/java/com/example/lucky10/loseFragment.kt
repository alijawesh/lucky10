package com.example.lucky10

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation


class loseFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_lose, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val TryAgain : Button = view.findViewById(R.id.TryAgain)
        TryAgain.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_loseFragment_to_mainFragment)
        }
    }


}