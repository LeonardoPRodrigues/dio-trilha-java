package projetoDio.control;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import projetoDio.model.Book;
import projetoDio.service.ClientService;

@RestController
@RequestMapping("books")
public class ControllerRest {

    @Autowired
    private ClientService clientService;

    @GetMapping
    public ResponseEntity<Iterable<Book>> findAll(){
        return ResponseEntity.ok(clientService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Book> findById(@PathVariable Integer id){
        return ResponseEntity.ok(clientService.findById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Book> delete(@PathVariable Integer id){
        clientService.delete(id);
        return ResponseEntity.ok().build();
    }

    @PostMapping
    public ResponseEntity<Book> save(@RequestBody Book book){
        clientService.post(book);
        return ResponseEntity.ok(book);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Book> update(@PathVariable Integer id ,@RequestBody Book book){
        clientService.put(id, book);
        return ResponseEntity.ok(book);
    }




}
