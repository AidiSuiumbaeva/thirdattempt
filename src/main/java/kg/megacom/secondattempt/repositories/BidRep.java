package kg.megacom.secondattempt.repositories;

import kg.megacom.secondattempt.models.Bid;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BidRep extends JpaRepository<Bid,Long> {
}
