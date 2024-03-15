package com.dennis.api.menu;

public class MenuRepository {

    private final static MenuRepository instance = new MenuRepository();

    private MenuRepository() {
    }

    public static MenuRepository getInstance() {
        return instance;
    }

}
