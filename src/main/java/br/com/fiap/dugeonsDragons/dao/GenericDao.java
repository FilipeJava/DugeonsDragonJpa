package br.com.fiap.dugeonsDragons.dao;

import br.com.fiap.dugeonsDragons.exception.CommitException;
import br.com.fiap.dugeonsDragons.exception.IdNaoEncontradoException;

public interface GenericDao<T, K> {

    T salvar(T entidade);

    void remover(K id) throws IdNaoEncontradoException;

    T buscar(K id) throws IdNaoEncontradoException;

    void commit() throws CommitException;

}
