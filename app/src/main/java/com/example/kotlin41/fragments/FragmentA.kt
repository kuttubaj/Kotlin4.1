package com.example.kotlin41.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.kotlin41.Anime
import com.example.kotlin41.AnimeAdapter
import com.example.kotlin41.OnItemCLickListener
import com.example.kotlin41.R
import com.example.kotlin41.databinding.FragmentABinding

class FragmentA : Fragment(), OnItemCLickListener {

    private var _binding: FragmentABinding? = null
    private val binding get() = _binding!!
    private val animeAdapter = AnimeAdapter(this)

    private val animeList = mutableListOf(
        Anime(R.drawable.horimya, "Horimiya"),
        Anime(R.drawable.magic_battle, "Magic Battle"),
        Anime(R.drawable.tokio_ghoul, "Tokio Ghoul"),
        Anime(R.drawable.my_hero_academy, "My Hero Academy"),
        Anime(R.drawable.undead_andbadluck, "Undead and BadLuck"),
        Anime(R.drawable.doctor_stone, "Doctor Stoune"),
        Anime(R.drawable.ragna_crimson, "Ragna Crimson"),
        Anime(R.drawable.death_note, "Death Note"),
        Anime(R.drawable.hanter_x_hanter, "Hanter x Hanter"),
        Anime(R.drawable.one_piece, "One Piece"),
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        _binding = FragmentABinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        animeAdapter.setDataAnimeList(animeList)
        binding.rvAnimeA.adapter = animeAdapter
    }

    override fun OnItemClick(anime: Anime) {
        DetalFragment.animeModel = anime
        findNavController().navigate(R.id.action_fragment_A_to_detalFragment)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}