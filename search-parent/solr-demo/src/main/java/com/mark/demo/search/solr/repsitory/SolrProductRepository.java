package com.mark.demo.search.solr.repsitory;

import com.mark.demo.search.solr.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.solr.core.query.*;
import org.springframework.data.solr.core.query.result.FacetPage;
import org.springframework.data.solr.repository.support.SimpleSolrRepository;

/**
 * Created by admin on 2017/9/29.
 */
public class SolrProductRepository extends SimpleSolrRepository<Product, String> implements ProductRepository {
    @Override
    public Page<Product> findByPopularity(Integer popularity) {
        Query query = new SimpleQuery(new Criteria("popularity").is(popularity));
        return getSolrOperations().queryForPage(query, Product.class);
    }

    @Override
    public FacetPage<Product> findByNameStartingWithAndFacetOnAvailable(String namePrefix) {
        FacetQuery query = new SimpleFacetQuery(new Criteria("name").startsWith(namePrefix));
        query.setFacetOptions(new FacetOptions("available"));
        return getSolrOperations().queryForFacetPage(query, Product.class);
    }

    @Override
    public Page<Product> findByAvailableTrue() {
        Query query = new SimpleQuery(new Criteria(new SimpleField(Criteria.WILDCARD)).expression(Criteria.WILDCARD));
        query.addFilterQuery(new SimpleQuery(new Criteria("available").is(true)));

        return getSolrOperations().queryForPage(query, Product.class);
    }
}
