package com.yutaka.mangareaderlayout.ui.anime;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.yutaka.mangareaderlayout.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link AnimeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class AnimeFragment extends Fragment {

    public AnimeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_anime, container, false);
    }
}