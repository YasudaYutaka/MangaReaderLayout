package com.yutaka.mangareaderlayout.ui.sobre;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import mehdi.sakout.aboutpage.AboutPage;
import mehdi.sakout.aboutpage.Element;

import com.yutaka.mangareaderlayout.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SobreFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SobreFragment extends Fragment {

    public SobreFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // return inflater.inflate(R.layout.fragment_sobre, container, false);

        String descricao = "App para ler mangás e assistir animes. Atualizado todos os dias com a melhor qualidade de imagem!";

        return new AboutPage(getActivity())
                .setImage(R.drawable.noragami_yato)
                .setDescription(descricao)

                .addGroup("Entre em contato")
                .addEmail("atendimento@mangareaderlayout.com", "Envie um e-mail")

                .addGroup("Redes Sociais")
                .addFacebook("RafaelRyy", "Facebook")
                .addInstagram("rafael.yasuda", "Instagram")
                .addGitHub("YasudaYutaka", "GitHub")
                .addPlayStore("com.whatsapp", "Download APP")

                .create();

    }
}