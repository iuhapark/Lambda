package com.dennis.api.post;

import com.dennis.api.common.AbstractService;
import com.dennis.api.enums.Messenger;

import java.util.List;
import java.util.Optional;

public class PostServiceImpl extends AbstractService implements PostService {
    public static PostServiceImpl instance = new PostServiceImpl();
    static PostServiceImpl getInstance(){
        return instance;
    }

    @Override
    public Messenger save(Object o) {
        return null;
    }

    @Override
    public List<?> findAll() {
        return null;
    }

    @Override
    public Optional findById(Long id) {
        return Optional.empty();
    }

    @Override
    public String count() {
        return null;
    }

    @Override
    public Optional getOne(String id) {
        return Optional.empty();
    }

    @Override
    public String delete(Object o) {
        return null;
    }

    @Override
    public String deleteAll() {
        return null;
    }

    @Override
    public Boolean existsById(Long id) {
        return null;
    }
}
