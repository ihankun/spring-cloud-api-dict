package com.ihankun.dict.server.config;

import org.apache.http.conn.HttpClientConnectionManager;
import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

/**
 * @author hankun
 */
@Configuration
public class RestTempleConfig {

    @Value("${restTemple.connectTimeout}")
    private Integer connectTimeout = 10000;

    @Value("${restTemple.readTimeout}")
    private Integer readTimeout = 10000;

    @Bean
    public HttpClientBuilder httpClientBuilder(HttpClientConnectionManager connectionManager) {
        HttpClientBuilder httpClientBuilder = HttpClientBuilder.create();
        httpClientBuilder.setConnectionManager(connectionManager);
        return httpClientBuilder;
    }

    @Bean
    public HttpComponentsClientHttpRequestFactory clientHttpRequestFactory(HttpClientBuilder httpClientBuilder){
        HttpComponentsClientHttpRequestFactory httpRequestFactory = new HttpComponentsClientHttpRequestFactory();
        httpRequestFactory.setHttpClient(httpClientBuilder.build());
        httpRequestFactory.setConnectionRequestTimeout(connectTimeout);
        httpRequestFactory.setConnectTimeout(connectTimeout);
        httpRequestFactory.setReadTimeout(readTimeout);
        return httpRequestFactory;
    }

    @Bean
    public RestTemplate restTemplate(HttpComponentsClientHttpRequestFactory httpRequestFactory){
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.setRequestFactory(httpRequestFactory);
        return restTemplate;
    }

}
