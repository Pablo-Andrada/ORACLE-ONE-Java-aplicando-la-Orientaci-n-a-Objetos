package com.ORACLE.screenmatch.calculos;

import com.ORACLE.screenmatch.modelos.Pelicula;
import com.ORACLE.screenmatch.modelos.Serie;
import com.ORACLE.screenmatch.modelos.Titulo;

public class CalculadoraDeTiempo {
    private int tiempoTotal;

    public int getTiempoTotal() {
        return tiempoTotal;
    }

    public void setTiempoTotal(int tiempoTotal) {
        this.tiempoTotal = tiempoTotal;
    }

    public void incluye(Titulo titulo){
        this.tiempoTotal += titulo.getDuracionEnMinutos();
    }

}
