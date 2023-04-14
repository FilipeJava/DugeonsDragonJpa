package br.com.fiap.dugeonsDragons.dao;

import br.com.fiap.dugeonsDragons.entity.Campanha;

import javax.persistence.EntityManager;

public class CampanhaDaoImpl extends GenericDaoImpl<Campanha, Long> implements CampanhaDao {

    public CampanhaDaoImpl(EntityManager em) {
        super(em);
    }

}