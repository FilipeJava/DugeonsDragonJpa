package br.com.fiap.dugeonsDragons.dao;

import br.com.fiap.dugeonsDragons.entity.Atributo;

import javax.persistence.EntityManager;

public class AtributoDaoImpl extends GenericDaoImpl<Atributo, Long> implements AtributoDao {

    public AtributoDaoImpl(EntityManager em) {
        super(em);
    }

}
