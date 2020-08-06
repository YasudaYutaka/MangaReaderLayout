package com.yutaka.mangareaderlayout.ui.anime.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.yutaka.mangareaderlayout.R;
import com.yutaka.mangareaderlayout.ui.anime.model.Anime;

import java.util.List;

public class AnimeAdapter extends RecyclerView.Adapter<AnimeAdapter.MyViewHolder> {

    private List<Anime> listAnime;

    public AnimeAdapter(List<Anime> listAnime) {
        this.listAnime = listAnime;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemLista = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.anime_detalhe, parent, false);

        return new MyViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Anime anime = listAnime.get(position);
        holder.animeImagem.setImageResource(anime.getImagemAnime());
        holder.animeTitulo.setText(anime.getNomeAnime());
        holder.animeEpisodio.setText(anime.getEpisodioAnime());

    }

    @Override
    public int getItemCount() {
        return listAnime.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView animeImagem;
        TextView animeTitulo, animeEpisodio;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            animeImagem = itemView.findViewById(R.id.imageCapaAnime);
            animeTitulo = itemView.findViewById(R.id.textNomeAnime);
            animeEpisodio = itemView.findViewById(R.id.textEpisodioAnime);

        }
    }
}
