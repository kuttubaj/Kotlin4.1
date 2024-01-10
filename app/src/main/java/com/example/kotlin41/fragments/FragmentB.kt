package com.example.kotlin41.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.kotlin41.Anime
import com.example.kotlin41.AnimeAdapter
import com.example.kotlin41.OnItemCLickListener
import com.example.kotlin41.R
import com.example.kotlin41.databinding.FragmentBBinding

class FragmentB : Fragment(), OnItemCLickListener {

    private var _binding: FragmentBBinding? = null
    private val binding get() = _binding!!
    private val animeAdapter = AnimeAdapter(this)

    private val animeList = mutableListOf(
        Anime(R.drawable.seven_deadly_sins, "Seven deadly sins"),
        Anime(R.drawable.horimya, "Horimya"),
        Anime(R.drawable.tokio_ghoul, "Tokio Ghoul"),
        Anime(R.drawable.my_hero_academy, "My Hero Academy"),
        Anime(R.drawable.undead_andbadluck, "Undead and BadLuck"),
        Anime(R.drawable.doctor_stone, "Doctor Stoune"),
        Anime(R.drawable.ragna_crimson, "Ragna Crimson"),
        Anime(R.drawable.death_note, "Death Note"),
        Anime(R.drawable.parasite, "Parasite"),
        Anime(R.drawable.darvins_game, "Darvin's game"),
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentBBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        animeAdapter.setDataAnimeList(animeList)
        binding.rvAnimeB.adapter = animeAdapter
    }

    override fun OnItemClick(anime: Anime) {
        findNavController().navigate(R.id.fragment_B)
    }
}