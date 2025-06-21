package com.ryder.microserviceclient.services;

import java.util.List;

import com.ryder.microserviceclient.entitys.Client;

public interface IService {
    boolean insert(Client cl);
    List<Client> findAll();
    Client findById(long id);
    boolean deleteById(long id);
    boolean update(Client cl);
}