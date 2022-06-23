package com.example.anime

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.navigation.findNavController
import com.bumptech.glide.Glide
import com.example.anime.databinding.FragmentFirstBinding
import com.example.anime.entity.Response
import com.example.anime.model.OrderViewModel


class FirstFragment : Fragment() {

    private val viewModel: OrderViewModel by viewModels()

    private var _binding: FragmentFirstBinding?=null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        viewModel.animeStatus.observe(viewLifecycleOwner){
            Glide.with(binding.image).load(it.images[0].url).into(binding.image)
        }

        binding.nextFragment.setOnClickListener{
            viewModel.getAnimeData()

        }
    }


}