package kg.megacom.secondattempt.repositories;

import kg.megacom.secondattempt.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRep extends JpaRepository<Customer,Long> {
}
