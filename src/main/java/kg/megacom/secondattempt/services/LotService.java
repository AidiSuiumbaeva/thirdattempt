package kg.megacom.secondattempt.services;

import kg.megacom.secondattempt.models.dto.LotDto;
import kg.megacom.secondattempt.models.dto.StatusDto;

import java.util.List;

public interface LotService {
    LotDto save(LotDto lotDto);
    LotDto find(Long id);
    List<LotDto> getList();
}
