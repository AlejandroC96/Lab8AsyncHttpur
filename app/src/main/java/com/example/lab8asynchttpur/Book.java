package com.example.lab8asynchttpur;

import android.widget.ImageView;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public class Book {
    String titulo;
    String autor;
    String anio;
    String descripcion;

    public Book(String titulo, String autor, String anio, String descripcion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
        this.descripcion = descripcion;
    }

}
