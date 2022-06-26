package ru.netology.repository;

import ru.netology.domain.PostersMovie;

public class PostersManager {

    private int limit = 10;

    public PostersManager(int limit) {
        this.limit = limit;
    }

    public PostersManager () {
        this.limit = limit;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    private PostersMovie[] films = new PostersMovie[0];

    public void save(ru.netology.domain.PostersMovie film) {
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

    public PostersMovie[] findLast(){
        PostersMovie[] lastLimit = new PostersMovie [limit];
        for (int i = 0; i < limit; i++) {
            lastLimit[i] = films[films.length-1-i];
        };
        return lastLimit;
    }
}
