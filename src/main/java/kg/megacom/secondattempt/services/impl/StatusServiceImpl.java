package kg.megacom.secondattempt.services.impl;

import kg.megacom.secondattempt.mapper.ClassMapper;
import kg.megacom.secondattempt.mapper.StatusMapper;
import kg.megacom.secondattempt.models.Status;
import kg.megacom.secondattempt.models.dto.StatusDto;
import kg.megacom.secondattempt.repositories.StatusRep;
import kg.megacom.secondattempt.services.StatusService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StatusServiceImpl implements StatusService {
    private StatusRep service;

    @Override
    public StatusDto saveStatus(StatusDto statusDto) {
        Status status= StatusMapper.getInstance.statusDtoToStatus(statusDto);
       status= service.save(status);
       statusDto=StatusMapper.getInstance.statusToStatuses(status);
        return statusDto;
    }

    @Override
    public StatusDto find(Long id) {

        return StatusMapper.getInstance.statusToStatuses(service.findById(id).orElse(null));
    }

    @Override
    public List<StatusDto> getList() {
        return StatusMapper.getInstance.statusToStatusDto(service.findAll());
    }
}
