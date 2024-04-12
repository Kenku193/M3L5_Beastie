package org.example.repository;

public interface Repository<T>{

    T getUser(Long id, String login, String password);

}
