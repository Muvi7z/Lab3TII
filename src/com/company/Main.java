package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
        public String getGenreName(){
            return this.graphics+ " " + this.genre.name() + " " + this.subGenre;
        }

    }
    public static String  writeAn(String ques){
        Scanner in = new Scanner(System.in);
        System.out.println(ques);
        String answer="";
        do {
            answer = in.nextLine();
        }
        while (!answer.equals("y") && !answer.equals("n") && !answer.equals("yes") && !answer.equals("not"));
        return answer;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String answer = "";
        for(Genre.Type genre: Genre.Type.values()){
            System.out.println(genre.question);
            do {
                answer = in.nextLine();
            }
            while (!answer.equals("y") && !answer.equals("n") && !answer.equals("yes") && !answer.equals("not"));
            if(answer.equals("y")|| answer.equals("yes")){
                switch (genre) {
                    case Action:
                       answer =  writeAn("Игрок должен устранить противника с помощью оружия?");
                        if(answer.equals("y")|| answer.equals("yes")){
                            answer =  writeAn("Видите ли вы главного героя?");
                            if(answer.equals("y")|| answer.equals("yes")){
                                genreList.add(new Genre(Genre.Type.Action,"3d","Шутеры от первого лица","Игрок должен устранить противника с помощью оружия?"));
                                System.out.println("Жанр игры:" + genreList.get(0).getGenreName());
                                break;
                            }
                            else {
                                genreList.add(new Genre(Genre.Type.Action,"3d","Шутеры от третьего лица","Видите ли вы главного героя?"));
                                System.out.println("Жанр игры:" + genreList.get(0).getGenreName());
                                break;
                            }
                        }
                        else {
                            answer =  writeAn("Игрок должен незаметно избегать противников?");
                            if(answer.equals("y")|| answer.equals("yes")){
                                genreList.add(new Genre(Genre.Type.Action,"3d","Стелс","Игрок должен незаметно избегать противников?"));
                                System.out.println("Жанр игры:" + genreList.get(0).getGenreName());
                                break;
                            }
                            else {
                                answer =  writeAn("В игре имитируется рукопашный бой?");
                                if(answer.equals("y")|| answer.equals("yes")){
                                    genreList.add(new Genre(Genre.Type.Action,"2d","Файтинги"));
                                    System.out.println("Жанр игры:" + genreList.get(0).getGenreName());
                                    break;
                                }
                            }
                        }
                        answer =  writeAn("Игрок должен передвигаться по платформам?");
                        if(answer.equals("y")|| answer.equals("yes")){
                            genreList.add(new Genre(Genre.Type.Action,"2d","Платформер"));

                            System.out.println("Жанр игры:" + genreList.get(0).getGenreName());
                            break;
                        }
                        else {
                            System.out.println("Жанр игры неизвестен!");
                            break;
                        }
                    case Simulators:
                        answer =  writeAn("Имитация управления автомобилем?");
                        if(answer.equals("y")|| answer.equals("yes")){
                            genreList.add(new Genre(Genre.Type.Simulators,"3d","Авто-симуляторы"));
                            System.out.println("Жанр игры:" + genreList.get(0).getGenreName());
                            break;
                        }
                        answer =  writeAn("Имитация процесса строительства?");
                        if(answer.equals("y")|| answer.equals("yes")){
                            genreList.add(new Genre(Genre.Type.Simulators,"3d","Симулятор строительства"));
                            System.out.println("Жанр игры:" + genreList.get(0).getGenreName());
                            break;
                        }
                        answer =  writeAn("Имитация процесса строительства?");
                        if(answer.equals("y")|| answer.equals("yes")){
                            genreList.add(new Genre(Genre.Type.Simulators,"3d","Симулятор жизни"));
                            System.out.println("Жанр игры:" + genreList.get(0).getGenreName());
                            break;
                        }
                        else {
                            System.out.println("Жанр игры неизвестен!");
                            break;
                        }
                    case Strategy:
                        answer =  writeAn("Игроки выполняют действия в реальном времени?");
                        if(answer.equals("y")|| answer.equals("yes")){
                            genreList.add(new Genre(Genre.Type.Strategy,"3d","Реального времени"));
                            System.out.println("Жанр игры:" + genreList.get(0).getGenreName());
                            break;
                        }
                        answer =  writeAn("Игрок должен расправиться с наступающими врагами с помощью различных построек?");
                        if(answer.equals("y")|| answer.equals("yes")){
                            genreList.add(new Genre(Genre.Type.Strategy,"3d","Товер дефенц"));
                            System.out.println("Жанр игры:" + genreList.get(0).getGenreName());
                            break;
                        }
                        else {
                            System.out.println("Жанр игры неизвестен!");
                            break;
                        }

                    case Sports:
                        answer =  writeAn("Игрок должен участвовать в гонках?");
                        if(answer.equals("y")|| answer.equals("yes")){
                            genreList.add(new Genre(Genre.Type.Sports,"3d","Гоночные"));
                            System.out.println("Жанр игры:" + genreList.get(0).getGenreName());
                            break;
                        }
                        else{
                            genreList.add(new Genre(Genre.Type.Sports,"3d","Симулятор"));
                            System.out.println("Жанр игры:" + genreList.get(0).getGenreName());
                            break;

                        }

                    case RPG:
                        answer =  writeAn("Игрок должен сражаться с несколькими врагами, повышая уровень?");
                        if(answer.equals("y")|| answer.equals("yes")){
                            genreList.add(new Genre(Genre.Type.RPG,"3d","Экшен-рпг"));
                            System.out.println("Жанр игры:" + genreList.get(0).getGenreName());
                            break;
                        }
                        answer =  writeAn("В игре множество игроков взаимодействуют друг с другом?");
                        if(answer.equals("y")|| answer.equals("yes")){
                            genreList.add(new Genre(Genre.Type.RPG,"3d","ММО-рпг"));
                            System.out.println("Жанр игры:" + genreList.get(0).getGenreName());
                            break;
                        }
                        else {
                            System.out.println("Жанр игры неизвестен!");
                            break;
                        }
                    case Sandbox:
                        genreList.add(new Genre(Genre.Type.Sandbox,"3d","Крафтинг"));
                        System.out.println("Жанр игры:" + genreList.get(0).getGenreName());
                        break;
                    case Quests:
                        answer =  writeAn("В игре необходимо вводить текстовые команды для управления игроком?");
                        if(answer.equals("y")|| answer.equals("yes")){
                            genreList.add(new Genre(Genre.Type.Quests,"2d","Текстовые"));
                            System.out.println("Жанр игры:" + genreList.get(0).getGenreName());
                            break;
                        }
                        answer =  writeAn("В игре необходимо решать логические задачи или загадки?");
                        if(answer.equals("y")|| answer.equals("yes")){
                            genreList.add(new Genre(Genre.Type.Quests,"2d","Головоломки"));
                            System.out.println("Жанр игры:" + genreList.get(0).getGenreName());
                            break;
                        }
                        else {
                            genreList.add(new Genre(Genre.Type.Quests,"2d","Графические"));
                            System.out.println("Жанр игры:" + genreList.get(0).getGenreName());
                            break;
                        }
                    default:
                        System.out.println("Жанр игры неизвестен!");
                }
                break;
            }
        }

    }
}
