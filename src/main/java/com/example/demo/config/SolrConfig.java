package com.example.demo.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class SolrConfig {

    public final static String SOLR_BASE_URL = "http://localhost:8983/solr/";
    public final static String SOLR_CORE = "octo-spoon";
    public final static String SOLR_CONTENT_FIELD = "content";
    public final static String SOLR_CONTENT_KEY = "key";

}