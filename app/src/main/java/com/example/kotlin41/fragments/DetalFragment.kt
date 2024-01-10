package com.example.kotlin41.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.kotlin41.Anime
import com.example.kotlin41.R
import com.example.kotlin41.databinding.FragmentDetalBinding

class DetalFragment : Fragment() {

    private lateinit var binding: FragmentDetalBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDetalBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initialize()
    }

    private fun initialize() = with(binding) {
        animeModel?.let {
            ivFragmentB.setImageResource(it.image)
            tvFargmentB.text = it.name
        }
    }

    companion object {
        var animeModel: Anime? = null
    }
}