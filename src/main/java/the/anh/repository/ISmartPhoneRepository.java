package the.anh.repository;

import org.springframework.data.repository.CrudRepository;
import the.anh.model.SmartPhone;

public interface ISmartPhoneRepository extends CrudRepository<SmartPhone, Long> {
    Iterable<SmartPhone> findAllByProducerContaining(String producer);
}
