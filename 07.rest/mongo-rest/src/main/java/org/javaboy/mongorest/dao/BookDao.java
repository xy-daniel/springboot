package org.javaboy.mongorest.dao;

import org.javaboy.mongorest.bean.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookDao extends MongoRepository<Book, Integer> {

}
