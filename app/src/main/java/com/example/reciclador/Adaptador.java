package com.example.reciclador;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adaptador extends RecyclerView.Adapter<Visor> {
    Context contexto;
    List<Persona> lista;

    public Adaptador(Context contexto, List<Persona> lista) {
        this.contexto = contexto;
        this.lista = lista;
    }

    @NonNull
    @Override
    public Visor onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new Visor(LayoutInflater.from(contexto).inflate(R.layout.carnet, parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull Visor holder, int position) {
    holder.image.setImageResource(lista.get(position).getImage());
    holder.text.setText(lista.get(position).getNombre());
    holder.email.setText(lista.get(position).getEmail());
    }

    @Override
    public int getItemCount() {
        return lista.size();
    }
}
