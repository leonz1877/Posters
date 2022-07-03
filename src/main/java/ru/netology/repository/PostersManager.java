package ru.netology.repository;

public class PostersManager {
    //Поля
    private int limit = 10;

    //Конструкторы
    public PostersManager(int limit) {
        this.limit = limit;
    }

    public PostersManager() {
        this.limit = limit;
    }

    //Методы
    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    private PostersMovie[] films = new PostersMovie[0];

    public void save(ru.netology.repository.PostersMovie film) {
        PostersMovie[] temp = new PostersMovie[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            temp[i] = films[i];
        }
        temp[temp.length - 1] = film;
        films = temp;
    }

    public PostersMovie[] findAll() {
        return films;
    }

    public PostersMovie[] findLast() {
        // проверяем, если в репозитории фильмов менее чем установлено методом limit - выводим все что есть
        int lastFilms;
        if (films.length < limit) {
            lastFilms = films.length;
        } else {
            lastFilms = limit;
        }
        PostersMovie[] lastLimit = new PostersMovie[lastFilms];
        for (int i = 0; i < lastLimit.length; i++) {
            lastLimit[i] = films[films.length - 1 - i];
        }
        ;
        return lastLimit;
    }
}
