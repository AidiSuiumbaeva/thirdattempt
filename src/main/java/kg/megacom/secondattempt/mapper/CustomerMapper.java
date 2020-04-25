package kg.megacom.secondattempt.mapper;

import kg.megacom.secondattempt.models.Customer;
import kg.megacom.secondattempt.models.dto.CustomerDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface CustomerMapper {

    CustomerMapper getInstance= Mappers.getMapper(CustomerMapper.class);


    Customer customerDtoToCustomer(CustomerDto customerDto);
    CustomerDto customerToCustomerDto(Customer customer);

    List<CustomerDto> customersToCustomerDtos(List<Customer> customers);
}
