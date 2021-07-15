package com.TOI.TOI.dao;

import com.TOI.TOI.entity.Api;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public class ApiDaoHibernate implements ApiDao {

    @Override
    public <S extends Api> S save(S s) {
        return null;
    }

    @Override
    public <S extends Api> Iterable<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<Api> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public Iterable<Api> findAll() {
        return null;
    }

    @Override
    public Iterable<Api> findAllById(Iterable<Integer> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Integer integer) {

    }

    @Override
    public void delete(Api api) {

    }

    @Override
    public void deleteAll(Iterable<? extends Api> iterable) {

    }

    @Override
    public void deleteAll() {

    }
}
