package dev.patika.ecommerce.business.abstracts;



import dev.patika.ecommerce.entities.Publisher;
import org.springframework.data.domain.Page;

public interface IPublisherService {
    Publisher save(Publisher publisher);
    Publisher get(int id);
    Publisher update(Publisher publisher);
    boolean delete(int id);
    Page<Publisher> cursor(int page, int pageSize);
}
