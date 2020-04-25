package kg.megacom.secondattempt.controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import kg.megacom.secondattempt.models.dto.BidDto;
import kg.megacom.secondattempt.models.dto.LotDto;
import kg.megacom.secondattempt.services.BidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/bid")
@Api(value = "Bid Management",description = "Методы для управления ставками")
public class BidController {

    @Autowired
    private BidService service;


    @PostMapping(value = "/save")
    public BidDto save(@RequestBody BidDto bidDto){
        return service.save(bidDto);
    }

    @GetMapping(value = "/list")
    public List<BidDto> getStatuses(){
        return service.getList();
    }


    @GetMapping(value = "/get/{id}")
    @ApiOperation(value = "get bid by id")
    public BidDto getById(@PathVariable Long id){
        return service.find(id);
    }

}
