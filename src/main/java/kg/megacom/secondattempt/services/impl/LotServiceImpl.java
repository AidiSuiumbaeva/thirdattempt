package kg.megacom.secondattempt.services.impl;

import kg.megacom.secondattempt.mapper.LotMapper;
import kg.megacom.secondattempt.models.Lot;
import kg.megacom.secondattempt.models.dto.LotDto;
import kg.megacom.secondattempt.repositories.LotRep;
import kg.megacom.secondattempt.services.LotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LotServiceImpl implements LotService {
    @Autowired
    private LotRep lotRep;
    @Override
    public LotDto save(LotDto lotDto) {
        Lot lot= LotMapper.getInstance.lotDtoToLot(lotDto);
        lotRep.save(lot);
        lotDto=LotMapper.getInstance.lotToLotDto(lot);
        return lotDto;
    }

    @Override
    public LotDto find(Long id) {
        return LotMapper.getInstance.lotToLotDto(lotRep.findById(id).orElse(null));
    }

    @Override
    public List<LotDto> getList() {
        return LotMapper.getInstance.lotsToLotDtos(lotRep.findAll());
    }
}
