package kg.megacom.secondattempt.controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import kg.megacom.secondattempt.models.dto.StatusDto;
import kg.megacom.secondattempt.services.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/status")
@Api(value = "Status Management",description = "Методы для управления статусом")
public class StatusController {
    @Autowired
    private StatusService statusService;
    @PostMapping(value = "/save")
    public StatusDto save(@RequestBody StatusDto statusDto){
        return statusService.saveStatus(statusDto);
    }

    @GetMapping(value = "/list")
    public List<StatusDto> getStatuses(){
        return statusService.getList();
    }


    @GetMapping(value = "/get/{id}")
    @ApiOperation(value = "get status by id")
public StatusDto getById(@PathVariable Long id){
       return statusService.find(id);
}


}
