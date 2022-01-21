package com.example.lucky10

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation


class MainFragment : Fragment() {
    var score = Data().score().random().toString()
     lateinit var SpinButton : Button
     lateinit var showword : TextView
     lateinit var showWinButton: Button
     lateinit var showLoseButton: Button


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        SpinButton = view.findViewById(R.id.SpinButton)
        showword = view.findViewById(R.id.showword)
        showLoseButton = view.findViewById(R.id.showLoseButton)
        showWinButton = view.findViewById(R.id.showWinButton)
       showLoseFragment()
        showWinFragment()
        spinButton()

    }

    fun spinButton(){
        SpinButton.setOnClickListener {
            showword.text = score
            print(score)

        }

    }
    fun showWinFragment(){
        showWinButton.setOnClickListener {
            view?.let { it1 -> Navigation.findNavController(it1).navigate(R.id.action_mainFragment_to_winFragment) }
        }
    }



    fun showLoseFragment(){
        showLoseButton.setOnClickListener {
            view?.let { it1 -> Navigation.findNavController(it1).navigate(R.id.action_mainFragment_to_loseFragment) }
        }
    }




}









