package com.mark.demo.security.controller;

import com.mark.demo.security.base.PaginateResult;
import com.mark.demo.security.constant.CommonConst;
import com.mark.demo.security.entity.Article;
import com.mark.demo.security.entity.JsonMessage;
import com.mark.demo.security.utils.JsonMessageUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.util.Date;

/**
 * Created by admin on 2017/9/30.
 */
@Controller
@RequestMapping("/admins/search/solr")
public class SolrController {
    @RequestMapping("/list")
    public String list(HttpServletResponse response){
        response.setHeader("X-Frame-Options","SAMEORIGHT");
        return "admins/search/solr/list.ftl";
    }

    @RequestMapping("/list/data")
    @ResponseBody
    public PaginateResult<Article> listData(String key,Date date_start,Date date_end){
        return null;
    }

    @RequestMapping("/save")
    @ResponseBody
    public JsonMessage add(Article article){
        article.setDate(new Date());
        return JsonMessageUtils.getJsonMessage(CommonConst.SUCCESS);
    }
}
