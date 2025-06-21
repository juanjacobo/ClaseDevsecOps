package com.ryder.microserviceclient.dao;
import org.springframework.data.repository.CrudRepository;
 
import com.ryder.microserviceclient.entitys.Client;


public interface IMicroserviceDAO extends CrudRepository<Client, Long>{
 
}
