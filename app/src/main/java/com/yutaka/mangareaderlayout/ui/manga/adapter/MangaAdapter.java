package com.yutaka.mangareaderlayout.ui.manga.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.yutaka.mangareaderlayout.R;
import com.yutaka.mangareaderlayout.ui.manga.model.Manga;

import java.util.List;

public class MangaAdapter extends RecyclerView.Adapter<MangaAdapter.MyViewHolder> {

    private List<Manga> listManga;

    public MangaAdapter(List<Manga> m){
        this.listManga = m;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemLista = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.manga_detalhe, parent, false);

        return new MyViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Manga manga = listManga.get(position);

        holder.mangaCapa.setImageResource(manga.getCapaManga());
        holder.mangaTitulo.setText(manga.getNomeManga());
        holder.mangaGenero.setText(manga.getGeneroManga());
        holder.mangaCapitulo.setText(manga.getCapituloManga());

    }

    @Override
    public int getItemCount() {
        return listManga.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView mangaTitulo, mangaGenero, mangaCapitulo;
        private ImageView mangaCapa;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            mangaTitulo = itemView.findViewById(R.id.textMangaTitulo);
            mangaGenero = itemView.findViewById(R.id.textMangaGenero);
            mangaCapitulo = itemView.findViewById(R.id.textMangaCap);
            mangaCapa = itemView.findViewById(R.id.imageMangaCapa);

        }
    }

}
