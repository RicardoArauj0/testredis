package com.cache.testredis.configuration;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.Cache;
import org.springframework.cache.interceptor.CacheErrorHandler;

@Slf4j
public class CustomCacheErrorHandler implements CacheErrorHandler {


  @Override
  public void handleCacheGetError(RuntimeException exception, Cache cache, Object key) {
    log.error("Exception on caching: {}", exception.getMessage());
  }

  @Override
  public void handleCachePutError(RuntimeException exception, Cache cache, Object key, Object value) {

  }

  @Override
  public void handleCacheEvictError(RuntimeException exception, Cache cache, Object key) {

  }

  @Override
  public void handleCacheClearError(RuntimeException exception, Cache cache) {

  }
}
