package com.swkim.mysololife.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.swkim.mysololife.R
import com.swkim.mysololife.databinding.FragmentBookmarkBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER


class BookmarkFragment : Fragment() {
    private lateinit var binding : FragmentBookmarkBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_bookmark, container, false)

        binding.hometap.setOnClickListener {
            it.findNavController().navigate(R.id.action_bookmarkFragment_to_homeFragment)
        }
        binding.tiptap.setOnClickListener {
            it.findNavController().navigate(R.id.action_bookmarkFragment_to_tipFragment)
        }
        binding.talktap.setOnClickListener {
            it.findNavController().navigate(R.id.action_bookmarkFragment_to_talkFragment)
        }
        binding.storetap.setOnClickListener {
            it.findNavController().navigate(R.id.action_bookmarkFragment_to_storeFragment)
        }

        return binding.root
    }

}