package kg.megacom.secondattempt.controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import kg.megacom.secondattempt.models.dto.LotDto;
import kg.megacom.secondattempt.models.dto.StatusDto;
import kg.megacom.secondattempt.services.LotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/lot")
@Api(value = "Lot Management",description = "Методы для управления лотом")
public class LotController {
    @Autowired
    private LotService service;

    @PostMapping(value = "/save")
    public LotDto save(@RequestBody LotDto lotDto){
        return service.save(lotDto);
    }

    @GetMapping(value = "/list")
    public List<LotDto> getStatuses(){
        return service.getList();
    }


    @GetMapping(value = "/get/{id}")
    @ApiOperation(value = "get lot by id")
    public LotDto getById(@PathVariable Long id){
        return service.find(id);
    }




}
