package kg.megacom.secondattempt.repositories;

import kg.megacom.secondattempt.models.Lot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LotRep extends JpaRepository<Lot,Long> {
}
