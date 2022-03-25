package com.swkim.mysololife.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.swkim.mysololife.R
import com.swkim.mysololife.databinding.FragmentHomeBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER


class HomeFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private lateinit var binding : FragmentHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false)

        binding.tiptap.setOnClickListener {
            it.findNavController().navigate(R.id.action_homeFragment_to_tipFragment)
        }
        binding.bookmarktap.setOnClickListener {
            it.findNavController().navigate(R.id.action_homeFragment_to_bookmarkFragment)
        }
        binding.talktap.setOnClickListener {
            it.findNavController().navigate(R.id.action_homeFragment_to_talkFragment)
        }
        binding.storetap.setOnClickListener {
            it.findNavController().navigate(R.id.action_homeFragment_to_storeFragment)
        }

        return binding.root
    }

}