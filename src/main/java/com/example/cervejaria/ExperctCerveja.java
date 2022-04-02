package com.example.cervejaria;

import java.util.ArrayList;
import java.util.List;

public class ExperctCerveja {

    public List <String> getMarcas(String color){
        List<String> marcas= new ArrayList<>();
        if (color.equals("Pale lager")){
            marcas.add("Corona");
            marcas.add("\nHeineken");
            marcas.add("\nKriek");
            marcas.add("\nMotoneta");
        }
        if (color.equals("Blonde Ale")){
            marcas.add("Boussole");
            marcas.add("\nComic Blond");
            marcas.add("\nDelacruz");
            marcas.add("\nKasteel");
        }
        if (color.equals("Amber Ale")) {
            marcas.add("Banks");
            marcas.add("\nMadalena");
            marcas.add("\nPatagonia");
            marcas.add("\nRogue American");
        }
        if (color.equals("Red Ale")){
            marcas.add("Zeppa");
            marcas.add("\nDenver Red");
            marcas.add("\nWay Beer");

        }
        if (color.equals("Stout")){
            marcas.add("Madalena Stout");
            marcas.add("\nSchornstein");
            marcas.add("\nSaint Bier");
            marcas.add("\nShepherd");

        }


        return marcas;

    }



}
