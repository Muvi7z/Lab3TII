package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static ArrayList<Genre> genreList = new ArrayList<Genre>();

    public static class Genre{
        String subGenre ="";
        String graphics ="";
        String question ="";
        Type genre = Type.Action;
        public Genre(Type genre,String graphics, String subGenre, String question){
            this.genre = genre;
            this.graphics = graphics;
            this.subGenre = subGenre;
            this.question = question;
        }
        public Genre(Type genre,String graphics, String subGenre){
            this.genre = genre;
            this.graphics = graphics;
            this.subGenre = subGenre;
        }
        public enum Type{
            Action("В игре нужно сражаться с противниками?"),
            Simulators("В игре необходимо выполнять какой-либо процесс как в реальной жизни?"),
            Strategy("В игре необходимо применять стратегическое мышление?"),
            Sports("В игре имитируется какой-либо вид спорта?"),
            RPG("В игре необходимо прокачивать персонажа, выполнять квесты?"),
            Sandbox("В игре дается полная свобода действия?"),
            Quests("В игре необходимо исследовать мир, решать различные головоломки и задачи?");
            String question = "";
            Type(String question){
                this.question=question;
            }

            public String getQuestion() {
                return question;
            }
        }

    }
    public static void main(String[] args) {
        genreList.add(new Genre(Genre.Type.Action,"3d","Шутеры от первого лица","Игрок должен устранить противника с помощью оружия?"));
        genreList.add(new Genre(Genre.Type.Action,"3d","Шутеры от третьего лица","Видите ли вы главного героя?"));
        genreList.add(new Genre(Genre.Type.Action,"3d","Стелс","Игрок должен незаметно избегать противников?"));
        genreList.add(new Genre(Genre.Type.Action,"3d","Приключения"));
        genreList.add(new Genre(Genre.Type.Simulators,"3d","Авто-симуляторы"));
        genreList.add(new Genre(Genre.Type.Simulators,"3d","Авиа-симуляторы"));
        genreList.add(new Genre(Genre.Type.Simulators,"3d","Симулятор строительства"));
        genreList.add(new Genre(Genre.Type.Simulators,"3d","Космический симулятор"));
        genreList.add(new Genre(Genre.Type.Strategy,"3d","Реального времени"));
        genreList.add(new Genre(Genre.Type.Strategy,"3d","Товер дефенц"));
        genreList.add(new Genre(Genre.Type.Sports,"3d","Симулятор"));
        genreList.add(new Genre(Genre.Type.Sports,"3d","Гоночные"));
        genreList.add(new Genre(Genre.Type.RPG,"3d","Экшен-рпг"));
        genreList.add(new Genre(Genre.Type.RPG,"3d","ММО-рпг"));
        genreList.add(new Genre(Genre.Type.Sandbox,"3d","Крафтинг"));
        genreList.add(new Genre(Genre.Type.Quests,"2d","Текстовые"));
        genreList.add(new Genre(Genre.Type.Quests,"2d","Новелла"));
        genreList.add(new Genre(Genre.Type.Quests,"2d","Графические"));
        genreList.add(new Genre(Genre.Type.Quests,"2d","Головоломки"));
        genreList.add(new Genre(Genre.Type.Action,"2d","Файтинги"));
        genreList.add(new Genre(Genre.Type.Action,"2d","Платформер"));
        genreList.add(new Genre(Genre.Type.Strategy,"2d","Пошаговые"));
        genreList.add(new Genre(Genre.Type.Strategy,"2d","Экономические"));
        Scanner in = new Scanner(System.in);
        final String[] answer = {""};
        for(Genre.Type genre: Genre.Type.values()){
            System.out.println(genre.question);
            do {
                answer[0] = in.nextLine();
            }
            while (!answer[0].equals("y") && !answer[0].equals("n") && !answer[0].equals("yes") && !answer[0].equals("not"));
            if(answer[0].equals("y")|| answer[0].equals("yes")){
                genreList.stream().map(x -> x.genre==genre).collect(Collectors.toList());
            }
        }

    }
}
