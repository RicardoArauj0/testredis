# testredis
Spring cache implementation with Redis

## Overview
This application is a simple implementation for Spring Cache using Redis. 
The main database is MySql and I'm using Redis to cache the responses.
The configuration for databases (redis and mysql) connection can be found on application.yml file.

The CustomCacheErrorHandler class has handlers to deal with errors related to cache.
Try to drop the redis container while running the code and see CustomCacheErrorHandler in action.
The file CacheConfiguration is used to configure the "time to live" for the cache and to register the CustomCacheErrorHandler.

## Running the appliation
To run the application you need to have maven and docker installed

"docker-compose up" to run the mysql and redis containers
"spring-boot:run" to start the application

