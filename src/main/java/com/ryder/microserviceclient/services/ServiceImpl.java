package com.ryder.microserviceclient.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ryder.microserviceclient.dao.IMicroserviceDAO;
import com.ryder.microserviceclient.entitys.Client;
import com.ryder.microserviceclient.exception.ClientNotFoundException;

@Service
public class ServiceImpl implements IService{

    @Autowired
    private IMicroserviceDAO dao;

    @Override
    public boolean insert(Client cl) {
        if(cl.getId()==0){
            return dao.save(cl)!=null;
        }

        return false;
    }

    @Override
    public List<Client> findAll() {
        return (List<Client>) dao.findAll();
            
    }

    @Override
    public Client findById(long id) {
       return dao.findById(id)
       .orElseThrow(()->new  ClientNotFoundException("client desn't exists "+id));
    }

    @Override
    public boolean deleteById(long id) {
        if(dao.existsById(id)){
            dao.deleteById(id);
            return true;
        }
        throw new ClientNotFoundException("client doesn't exists "+id);
    }

    @Override
    public boolean update(Client cl) {
        if(dao.existsById(cl.getId())){
           return dao.save(cl)!=null;
        }
        throw new ClientNotFoundException("client doesn't exists "+cl.getId());
    }
}
