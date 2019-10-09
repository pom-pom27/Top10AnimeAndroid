package com.example.myrecycleview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class card_viewHeroAdapter extends
        RecyclerView.Adapter<card_viewHeroAdapter.CardViewViewHolder> {

    private ArrayList<Anime> list;

    private card_viewHeroAdapter.OnItemClickCallback onItemClickCallback;
    public card_viewHeroAdapter(ArrayList<Anime> list) {
        this.list = list;
    }

    public void setOnItemClickCallback(card_viewHeroAdapter.OnItemClickCallback onItemClickCallback){
        this.onItemClickCallback = onItemClickCallback;
    }


    @NonNull
    @Override
    public card_viewHeroAdapter.CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup parent,
                                                                      int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cardview_hero,
                parent, false);
        return new CardViewViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull final card_viewHeroAdapter.CardViewViewHolder holder,
                                 final int position) {

        final Anime hero = list.get(position);

        Glide.with(holder.itemView.getContext())
                .load(hero.getPhoto())
                .apply(new RequestOptions().override(256,100))
                .into(holder.imgPhoto);
        holder.tvName.setText(hero.getName());
        holder.urutan.setText(hero.getUrutan());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.posisi = position;
                onItemClickCallback.onItemClicked(list.get(holder.getAdapterPosition()));

            }
        });
        holder.itemView.setClipToOutline(true);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class CardViewViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvSinopsis, urutan;


        public CardViewViewHolder(@NonNull View itemView) {
            super(itemView);

            imgPhoto = itemView.findViewById(R.id.img_item);
            tvName = itemView.findViewById(R.id.anime_name);
            urutan = itemView.findViewById(R.id.urutan);
        }
    }
    public interface OnItemClickCallback{
        void onItemClicked(Anime data);
    }
}
