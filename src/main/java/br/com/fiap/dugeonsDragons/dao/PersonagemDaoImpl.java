package br.com.fiap.dugeonsDragons.dao;

import br.com.fiap.dugeonsDragons.entity.Personagem;

import javax.persistence.EntityManager;

public class PersonagemDaoImpl extends GenericDaoImpl<Personagem, Long> implements PersonagemDao {

    public PersonagemDaoImpl(EntityManager em) {
        super(em);
    }

}
