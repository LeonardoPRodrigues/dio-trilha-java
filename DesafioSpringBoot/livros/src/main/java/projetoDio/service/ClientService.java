package projetoDio.service;

import projetoDio.model.Book;

public interface ClientService {

    Iterable<Book> findAll();

    Book findById(Integer id);

    void delete(Integer id);

    void post(Book book);

    void put(Integer id, Book book);


}
