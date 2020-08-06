package com.yutaka.mangareaderlayout.ui.manga;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.yutaka.mangareaderlayout.R;
import com.yutaka.mangareaderlayout.ui.manga.adapter.MangaAdapter;
import com.yutaka.mangareaderlayout.ui.manga.model.Manga;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MangaFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MangaFragment extends Fragment {

    public MangaFragment() {
        // Required empty public constructor
    }

    private RecyclerView recyclerManga;
    private List<Manga> mangas = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // RecyclerView
        View view = inflater.inflate(R.layout.fragment_manga, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.recyclerManga); // RETURN NA VIEW
        // Layout Mangaer
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        //RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getActivity(), 2);
        recyclerView.setLayoutManager(layoutManager);
        // Adapter
        this.prepararMangas();
        MangaAdapter mangaAdapter = new MangaAdapter(mangas);
        recyclerView.setAdapter(mangaAdapter);

        // Inflate the layout for this fragment
        return view;//inflater.inflate(R.layout.fragment_manga, container, false);
    }

    public void prepararMangas() {

        Manga m = new Manga("Black Clover","Aventura","1",R.drawable.blackcover_cover); //https://mangacovers.com/
        this.mangas.add(m);
        m = new Manga("Death Note","Mistério","6",R.drawable.deathnote_cover);
        this.mangas.add(m);
        m = new Manga("Attack on Titan","Ação/Mistério","6",R.drawable.attackontitan_cover);
        this.mangas.add(m);
        m = new Manga("Naruto","Ação","55",R.drawable.naruto_cover);
        this.mangas.add(m);
        m = new Manga("Boku no Hero","Ação","18",R.drawable.bokunohero_cover);
        this.mangas.add(m);
        m = new Manga("Tokyo Ghoul","Mistério","1",R.drawable.tokyoghoul_cover);
        this.mangas.add(m);
        m = new Manga("Hunter x Hunter","Ação","10",R.drawable.hxh_cover);
        this.mangas.add(m);
        m = new Manga("Fullmetal Alchemist", "Mistério", "15", R.drawable.fma_cover);
        this.mangas.add(m);
    }

}