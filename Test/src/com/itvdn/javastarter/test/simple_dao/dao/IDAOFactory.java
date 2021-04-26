package com.itvdn.javastarter.test.simple_dao.dao;

import java.sql.Connection;


public interface IDAOFactory {

    CarDAO getCarDAO();

    ClientDAO getClientDAO();


}
