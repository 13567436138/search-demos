package com.mark.demo.security.repsitory;

import com.mark.demo.security.entity.Article;
import org.springframework.data.solr.repository.SolrCrudRepository;

/**
 * Created by admin on 2017/9/30.
 */
public interface SolrRepsitory extends SolrCrudRepository<Article,String> {

}
