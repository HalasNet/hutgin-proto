package com.hutgin2.core.dao.hibernate;

import com.hutgin2.core.dao.GeneralDAO;
import com.hutgin2.core.dao.search.ExampleOptions;
import com.hutgin2.core.dao.search.Filter;
import com.hutgin2.core.dao.search.ISearch;
import com.hutgin2.core.dao.search.SearchResult;

import java.io.Serializable;
import java.util.List;

/**
 * Implementation of <code>GeneralDAO</code> using Hibernate.
 * The SessionFactory property is annotated for automatic resource injection.
 *
 * @author dwolverton
 */
@SuppressWarnings("unchecked")
public class GeneralDAOImpl extends HibernateBaseDAO implements GeneralDAO {

    public int count(ISearch search) {
        return _count(search);
    }

    public <T> T find(Class<T> type, Serializable id) {
        return (T) _get(type, id);
    }

    public <T> T[] find(Class<T> type, Serializable... ids) {
        return _get(type, ids);
    }

    public <T> List<T> findAll(Class<T> type) {
        return _all(type);
    }

    public void flush() {
        _flush();
    }

    public <T> T getReference(Class<T> type, Serializable id) {
        return _load(type, id);
    }

    public <T> T[] getReferences(Class<T> type, Serializable... ids) {
        return _load(type, ids);
    }

    public boolean isAttached(Object entity) {
        return _sessionContains(entity);
    }

    public void refresh(Object... entities) {
        _refresh(entities);
    }

    public boolean remove(Object entity) {
        return _deleteEntity(entity);
    }

    public void remove(Object... entities) {
        _deleteEntities(entities);
    }

    public boolean removeById(Class<?> type, Serializable id) {
        return _deleteById(type, id);
    }

    public void removeByIds(Class<?> type, Serializable... ids) {
        _deleteById(type, ids);
    }

    public boolean save(Object entity) {
        return _saveOrUpdateIsNew(entity);
    }

    public boolean[] save(Object... entities) {
        return _saveOrUpdateIsNew(entities);
    }

    public List search(ISearch search) {
        return _search(search);
    }

    public SearchResult searchAndCount(ISearch search) {
        return _searchAndCount(search);
    }

    public Object searchUnique(ISearch search) {
        return _searchUnique(search);
    }

    public Filter getFilterFromExample(Object example) {
        return _getFilterFromExample(example);
    }

    public Filter getFilterFromExample(Object example, ExampleOptions options) {
        return _getFilterFromExample(example, options);
    }
}
