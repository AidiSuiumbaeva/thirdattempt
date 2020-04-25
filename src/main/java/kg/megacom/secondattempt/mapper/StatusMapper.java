package kg.megacom.secondattempt.mapper;

import kg.megacom.secondattempt.models.Status;
import kg.megacom.secondattempt.models.dto.StatusDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface StatusMapper {
    StatusMapper getInstance= Mappers.getMapper(StatusMapper.class);

    Status statusDtoToStatus(StatusDto statusDto);
    StatusDto statusToStatuses(Status statuses);

    List<StatusDto> statusToStatusDto(List<Status> statuses);
}
