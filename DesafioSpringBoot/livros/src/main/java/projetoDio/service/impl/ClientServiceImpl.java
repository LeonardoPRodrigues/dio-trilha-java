package projetoDio.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import projetoDio.model.Book;
import projetoDio.model.BookRepository;
import projetoDio.service.ClientService;

import java.util.Optional;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public Iterable<Book> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public Book findById(Integer id) {
        Optional<Book> book = bookRepository.findById(id);
        if(book.isPresent()) {
            return book.get();
        }
        else throw new RuntimeException("Livro inexistente");
    }

    @Override
    public void delete(Integer id) {
        bookRepository.deleteById(id);
    }

    @Override
    public void post(Book book) {
        bookRepository.save(book);
    }

    @Override
    public void put(Integer id, Book book) {
        Optional<Book> idBook = bookRepository.findById(id);
        if(idBook.isPresent()){
            bookRepository.save(book);
        }
    }




}
