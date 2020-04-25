package kg.megacom.secondattempt.services;

import kg.megacom.secondattempt.models.dto.StatusDto;
import kg.megacom.secondattempt.models.dto.UserDto;

import java.util.List;

public interface StatusService {
    StatusDto saveStatus(StatusDto statusDto);
    StatusDto find(Long id);
    List<StatusDto> getList();

}
