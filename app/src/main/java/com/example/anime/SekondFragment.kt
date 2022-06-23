package com.example.anime

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.anime.databinding.FragmentSekondBinding


class SekondFragment : Fragment() {

    private var _binding: FragmentSekondBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSekondBinding.inflate(inflater, container, false)
        return binding.root
    }

}