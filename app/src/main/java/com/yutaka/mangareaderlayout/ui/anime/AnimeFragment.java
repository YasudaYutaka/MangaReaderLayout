package com.yutaka.mangareaderlayout.ui.anime;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.yutaka.mangareaderlayout.R;
import com.yutaka.mangareaderlayout.ui.anime.adapter.AnimeAdapter;
import com.yutaka.mangareaderlayout.ui.anime.model.Anime;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link AnimeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class AnimeFragment extends Fragment {

    public AnimeFragment() {
        // Required empty public constructor
    }

    private RecyclerView recyclerAnime;
    private List<Anime> animes = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

       // RecyclerVIew
       View view = inflater.inflate(R.layout.fragment_anime, container, false);
        recyclerAnime = view.findViewById(R.id.recyclerAnime);
        // LayoutManager
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerAnime.setLayoutManager(layoutManager);
        // Adapter
        this.prepararManga();
        AnimeAdapter animeAdapter = new AnimeAdapter(animes);
        recyclerAnime.setAdapter(animeAdapter);

        // Inflate the layout for this fragment
        return view; //inflater.inflate(R.layout.fragment_anime, container, false);
    }

    public void prepararManga() {

        Anime a = new Anime("Noragami","Episódio 1",R.drawable.noragami_cover);
        animes.add(a);
        a = new Anime("Pokemon Journeys","Episódio 26",R.drawable.pokemon_cover);
        animes.add(a);
        a = new Anime("Naruto: Shippuden","Episódio 226",R.drawable.naruto_cover_anime);
        animes.add(a);
        a = new Anime("Danmachi","Episódio 18",R.drawable.danmachi_cover);
        animes.add(a);
    }

}