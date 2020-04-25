package kg.megacom.secondattempt.services;

import kg.megacom.secondattempt.models.dto.CustomerDto;
import kg.megacom.secondattempt.models.dto.LotDto;

import java.util.List;

public interface CustomerService {
    CustomerDto save(CustomerDto customerDto);
    CustomerDto find(Long id);
    List<CustomerDto> getList();
}
