package com.example.reciclador;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Visor extends RecyclerView.ViewHolder {
    ImageView image;
    TextView text, email;


    public Visor(@NonNull View itemView) {
        super(itemView);
        image = itemView.findViewById(R.id.imagenview);
        text = itemView.findViewById(R.id.name);
        email = itemView.findViewById(R.id.email);

    }
}
