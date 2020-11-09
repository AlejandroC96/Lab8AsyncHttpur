package com.example.lab8asynchttpur;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lab8asynchttpur.R;

import java.util.List;

public class RvAdapter  extends RecyclerView.Adapter<RvAdapter.LibroViewHolder> implements View.OnClickListener {

    private View.OnClickListener listener;

    List<Book> books;
    Context context;

    RvAdapter(List<Book> personas, Context context){
        this.books = personas;
        this.context = context;
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView){
        super.onAttachedToRecyclerView(recyclerView);
    }

    @NonNull
    @Override
    public RvAdapter.LibroViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.libro,parent,false);
        LibroViewHolder lvh = new LibroViewHolder(view);

        view.setOnClickListener(this);

        return lvh;
    }

    @Override
    public void onBindViewHolder(@NonNull RvAdapter.LibroViewHolder holder, int position) {
        holder.tituloLibro.setText(books.get(position).titulo);
        holder.autorlibro.setText(books.get(position).autor);
        holder.anioLibro.setText(books.get(position).anio);
        holder.descripcionLibro.setText(books.get(position).descripcion);
    }

    @Override
    public int getItemCount() {
        return books.size();
    }

    public void setOnClickListener(View.OnClickListener listener){
        this.listener=listener;
    }

    @Override
    public void onClick(View v) {
        if(listener != null){
            listener.onClick(v);
        }

    }

    public static class LibroViewHolder extends RecyclerView.ViewHolder{
        CardView cv;
        TextView tituloLibro;
        TextView autorlibro;
        TextView anioLibro;
        TextView descripcionLibro;
        ImageView fotoLibro;

        LibroViewHolder(View itemView){
            super(itemView);
            cv = (CardView)itemView.findViewById(R.id.cvLibro);
            tituloLibro = (TextView)itemView.findViewById(R.id.txtTituloLibro);
            autorlibro = (TextView)itemView.findViewById(R.id.txtAutorLibro);
            anioLibro = (TextView)itemView.findViewById(R.id.txtAnioLibro);
            descripcionLibro = (TextView)itemView.findViewById(R.id.txtDescripcionLibro);
            fotoLibro = (ImageView) itemView.findViewById(R.id.imgLibro);
        }
    }

}
