package com.TOI.TOI.service;

import com.TOI.TOI.dao.ApiDao;
import com.TOI.TOI.entity.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ApiServiceImp implements ApiService {

    @Autowired
    private ApiDao apiDao;

    @Override
    public List<Api> findAll() {
        return (List<Api>) apiDao.findAll();
    }
}
