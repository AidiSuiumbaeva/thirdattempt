package kg.megacom.secondattempt.services;

import kg.megacom.secondattempt.models.dto.BidDto;
import kg.megacom.secondattempt.models.dto.CustomerDto;

import java.util.List;

public interface BidService {
    BidDto save(BidDto bidDto);
    BidDto find(Long id);
    List<BidDto> getList();
}
