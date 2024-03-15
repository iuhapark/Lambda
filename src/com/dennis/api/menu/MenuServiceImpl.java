package com.dennis.api.menu;

public class MenuServiceImpl implements MenuService {

    private final static MenuServiceImpl instance = new MenuServiceImpl();

    private MenuServiceImpl() {
        repo = MenuRepository.getInstance();
    }
    public static MenuServiceImpl getInstance() {
        return instance;
    }

    private MenuRepository repo;




}
