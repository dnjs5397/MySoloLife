package com.swkim.mysololife.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.swkim.mysololife.R
import com.swkim.mysololife.databinding.FragmentStoreBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class StoreFragment : Fragment() {
    private lateinit var binding : FragmentStoreBinding
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_store, container, false)
        // Inflate the layout for this fragment
        binding.hometap.setOnClickListener {
            it.findNavController().navigate(R.id.action_storeFragment_to_homeFragment)
        }
        binding.bookmarktap.setOnClickListener {
            it.findNavController().navigate(R.id.action_storeFragment_to_bookmarkFragment)
        }
        binding.talktap.setOnClickListener {
            it.findNavController().navigate(R.id.action_storeFragment_to_talkFragment)
        }
        binding.tiptap.setOnClickListener {
            it.findNavController().navigate(R.id.action_storeFragment_to_tipFragment)
        }
        return binding.root
    }


}