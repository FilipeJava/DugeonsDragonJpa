package br.com.fiap.dugeonsDragons.dao;

import br.com.fiap.dugeonsDragons.entity.Guilda;

import javax.persistence.EntityManager;

public class GuildaDaoImpl extends GenericDaoImpl<Guilda, Long> implements GuildaDao {

    public GuildaDaoImpl(EntityManager em) {
        super(em);
    }

}
