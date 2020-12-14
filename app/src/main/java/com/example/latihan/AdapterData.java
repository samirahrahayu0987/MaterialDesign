package com.example.latihan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;
public class AdapterData extends RecyclerView.Adapter<AdapterData.ViewHolder>{
    private ArrayList<Prodi> rvData;

    public AdapterData(ArrayList<Prodi> rvData) {
        this.rvData = rvData;
    }

    @NonNull
    @Override
    public AdapterData.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // membuat view baru
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.rv_layout, parent,
                false);
        // mengeset ukuran view, margin, padding, dan parameter layout lainnya
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterData.ViewHolder holder, int position) {
        Prodi prodi=rvData.get(position);
        Glide.with(holder.itemView.getContext())
                .load(prodi.getPhoto())
                .apply(new RequestOptions().override(500, 750))
                .into(holder.gambar);

        holder.tvTitle.setText(prodi.getNamaprodi());
        holder.tvSubtitle.setText(prodi.getNamakajur());

        holder.cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(holder.itemView.getContext(), "Anda Memilih " +
                        rvData.get(holder.getAdapterPosition()).getNamaprodi(), Toast.LENGTH_SHORT).show();

            }
        });

    }

    @Override
    public int getItemCount() {
        // menghitung ukuran dataset / jumlah data yang ditampilkan di RecyclerView
        return rvData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView tvTitle;
        public TextView tvSubtitle;
        public CardView cv;
        public ImageView gambar;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTitle = (TextView) itemView.findViewById(R.id.tv_title);
            tvSubtitle = (TextView) itemView.findViewById(R.id.tv_subtitle);
            cv=(CardView) itemView.findViewById(R.id.card_view);
            gambar=(ImageView)itemView.findViewById(R.id.icon);
        }
    }
}
