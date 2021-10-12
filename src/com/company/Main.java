package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static ArrayList<Genre> genreList = new ArrayList<Genre>();

    public static class Genre{
        String subGenre="";
        String graphics ="";
        Type genre = Type.Action;
        public Genre(Type genre,String graphics, String subGenre){

        }
        public enum Type{
            Action,
            Simulators,
            Strategy,
            Sports,
            RPG,
            Sandbox,
            Quests
        }

    }
    public static void main(String[] args) {
        genreList.add(new Genre(Genre.Type.Action,))
    }
}
