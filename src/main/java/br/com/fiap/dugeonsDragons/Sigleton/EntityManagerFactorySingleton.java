package br.com.fiap.dugeonsDragons.Sigleton;


import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class EntityManagerFactorySingleton {

    private static EntityManagerFactory instance;

    private EntityManagerFactorySingleton() {
    }

    public static EntityManagerFactory getInstance() {
        if (instance == null) {
            instance = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
        }
        return instance;
    }
   
}