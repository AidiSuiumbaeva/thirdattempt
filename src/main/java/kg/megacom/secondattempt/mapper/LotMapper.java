package kg.megacom.secondattempt.mapper;

import kg.megacom.secondattempt.models.Lot;
import kg.megacom.secondattempt.models.Status;
import kg.megacom.secondattempt.models.dto.LotDto;
import kg.megacom.secondattempt.models.dto.StatusDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface LotMapper {
    LotMapper getInstance= Mappers.getMapper(LotMapper.class);
    @Mapping(source = "statusDto", target="status")
    Lot lotDtoToLot(LotDto lotDto);
    @Mapping(source = "status", target="statusDto")
    LotDto lotToLotDto(Lot lot);

    List<LotDto> lotsToLotDtos(List<Lot> statuses);
}
