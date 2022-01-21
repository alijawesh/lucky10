package com.example.lucky10

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation


class winFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_win, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val PlayAgain : Button = view.findViewById(R.id.PlayAgainButton)

        PlayAgain.setOnClickListener {
            (Navigation.findNavController(view).navigate(R.id.action_winFragment_to_mainFragment))


        }


    }







}
