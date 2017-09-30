package com.mark.demo.search.solr.repsitory;

import com.mark.demo.search.solr.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.solr.core.query.result.FacetPage;

/**
 * Created by admin on 2017/9/29.
 */
public interface ProductRepository extends CrudRepository<Product, String>{
    Page<Product> findByPopularity(Integer popularity);

    FacetPage<Product> findByNameStartingWithAndFacetOnAvailable(String namePrefix);

    Page<Product> findByAvailableTrue();
}
