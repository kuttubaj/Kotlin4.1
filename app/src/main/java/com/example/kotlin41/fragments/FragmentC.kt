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
import com.example.kotlin41.databinding.FragmentCBinding

class FragmentC : Fragment(), OnItemCLickListener {

    private var _binding: FragmentCBinding? = null
    private val binding get() = _binding!!
    private val animeAdapter = AnimeAdapter(this)

        private val animeList = mutableListOf(
            Anime(R.drawable.aidgo_rentaro,"Айдзё Рэнтаро"),
            Anime(R.drawable.hanadzono_hakari,"Ханадзоно Хакари"),
            Anime(R.drawable.inda_karane,"Инда Каранэ"),
            Anime(R.drawable.isimoto_sidzuka,"Ёсимото Сидзуко"),
            Anime(R.drawable.ii_nano,"ИИ Нано"),
            Anime(R.drawable.iakudzen_kusuri,"Якудзэн Куcури"),
            Anime(R.drawable.hanadzono_hahari,"Ханадзоно Хахари"),
            Anime(R.drawable.harago_kurumi,"Хараго Куруми"),
            Anime(R.drawable.suto_iku,"Суто Ику"),
            Anime(R.drawable.ucususisugi_mimimi,"Уцукусисуги Мимими "),
            Anime(R.drawable.iasasiki_iamame,"Ясасики Ямамэ "),
            Anime(R.drawable.momi_momidzi,"Моми Момидзи"),
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentCBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        animeAdapter.setDataAnimeList(animeList)
        binding.rvAnimeC.adapter = animeAdapter
    }

    override fun OnItemClick(anime: Anime) {
        findNavController().navigate(R.id.fragment_C)
    }
}