package br.com.fiap.dugeonsDragons.dao;

import br.com.fiap.dugeonsDragons.exception.CommitException;
import br.com.fiap.dugeonsDragons.exception.IdNaoEncontradoException;

import javax.persistence.EntityManager;
import java.lang.reflect.ParameterizedType;

public abstract class GenericDaoImpl<T, K> implements GenericDao<T, K> {

    private EntityManager em;
    private Class<T> clazz;

    @SuppressWarnings("all")
    public GenericDaoImpl(EntityManager em) {
        this.em = em;
        this.clazz = (Class<T>) ((ParameterizedType)
                getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }

    public T salvar(T entidade) {
        return em.merge(entidade);
    }

    public void remover(K id) throws IdNaoEncontradoException {
        T entidade = buscar(id);
        em.remove(entidade);
    }

    public T buscar(K id) throws IdNaoEncontradoException {
        T entidade = em.find(clazz, id);
        if (entidade == null) {
            throw new IdNaoEncontradoException("Entidade nao encontrada");
        }
        return entidade;
    }

    public void commit() throws CommitException {
        try {
            em.getTransaction().begin();
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
            throw new CommitException();
        }
    }
}
