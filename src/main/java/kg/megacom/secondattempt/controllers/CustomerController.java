package kg.megacom.secondattempt.controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import kg.megacom.secondattempt.models.dto.CustomerDto;
import kg.megacom.secondattempt.models.dto.LotDto;
import kg.megacom.secondattempt.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/customer")
@Api(value = "Customer Management",description = "Методы для управления клиентом")
public class CustomerController {
    @Autowired
    private CustomerService service;

    @PostMapping(value = "/save")
    public CustomerDto save(@RequestBody CustomerDto customerDto){
        return service.save(customerDto);
    }

    @GetMapping(value = "/list")
    public List<CustomerDto> getStatuses(){
        return service.getList();
    }


    @GetMapping(value = "/get/{id}")
    @ApiOperation(value = "get customer by id")
    public CustomerDto getById(@PathVariable Long id){
        return service.find(id);
    }

}
