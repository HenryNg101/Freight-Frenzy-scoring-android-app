package com.example.freightfrenzy.screens.registered_teams

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.example.freightfrenzy.R
import com.example.freightfrenzy.databinding.FragmentRegisteredTeamsBinding
import com.example.freightfrenzy.screens.registered_teams.RegisteredTeamsViewModel

class RegisteredTeamsFragment: Fragment() {
    private lateinit var registeredTeamsViewModel: RegisteredTeamsViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        activity?.setTitle("Registered Teams")
        val binding: FragmentRegisteredTeamsBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_registered_teams, container, false)

        //Get the ViewModel for this fragment
        registeredTeamsViewModel = ViewModelProvider(this).get(RegisteredTeamsViewModel::class.java)

        //Set up navigation for all button(s) on the screen
        binding.chooseTeamButton.setOnClickListener{ view!!.findNavController().navigate(RegisteredTeamsFragmentDirections.actionRegisteredTeamsFragmentToRegisteredTeamFragment()) }
        return binding.root
    }
}

//TODO: Create a RecycleView to view all registered teams and their info, and results.