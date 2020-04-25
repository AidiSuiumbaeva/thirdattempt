package kg.megacom.secondattempt.services.impl;

import kg.megacom.secondattempt.mapper.CustomerMapper;
import kg.megacom.secondattempt.models.Customer;
import kg.megacom.secondattempt.models.dto.CustomerDto;
import kg.megacom.secondattempt.repositories.CustomerRep;
import kg.megacom.secondattempt.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRep customerRep;
    @Override
    public CustomerDto save(CustomerDto customerDto) {
        Customer customer= CustomerMapper.getInstance.customerDtoToCustomer(customerDto);
        customerRep.save(customer);
        customerDto=CustomerMapper.getInstance.customerToCustomerDto(customer);

        return customerDto;
    }

    @Override
    public CustomerDto find(Long id) {

        return CustomerMapper.getInstance.customerToCustomerDto(customerRep.findById(id).orElse(null));
    }

    @Override
    public List<CustomerDto> getList() {
        return CustomerMapper.getInstance.customersToCustomerDtos(customerRep.findAll());
    }
}
