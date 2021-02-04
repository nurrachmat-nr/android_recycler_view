package id.web.twinstation.belajarrecycler;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;

public class CardViewGuppyAdapter extends RecyclerView.Adapter<CardViewGuppyAdapter.ListViewHolder> {
    private ArrayList<Guppy> listGuppy;

    public CardViewGuppyAdapter(ArrayList<Guppy> list){
        this.listGuppy = list;
    }

    @NonNull
    @Override
    public CardViewGuppyAdapter.ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cardview_guppy, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewGuppyAdapter.ListViewHolder holder, int position) {
        Guppy guppy = listGuppy.get(position);
        holder.namaIkan.setText(guppy.getNama());
        holder.detailIkan.setText((guppy.getDetail()));
        holder.fotoIkan.setImageResource(guppy.getPhoto());
        //Nanti kita coba pakai Glide
    }

    @Override
    public int getItemCount() {
        return listGuppy.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView fotoIkan;
        TextView namaIkan, detailIkan;
        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            fotoIkan = itemView.findViewById(R.id.img_item_photo);
            namaIkan = itemView.findViewById(R.id.tv_item_name);
            detailIkan = itemView.findViewById(R.id.tv_item_detail);
        }
    }
}
