package kg.megacom.secondattempt.mapper;

import kg.megacom.secondattempt.models.*;
import kg.megacom.secondattempt.models.dto.*;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ClassMapper {
    ClassMapper INSTANCE= Mappers.getMapper(ClassMapper.class);

    @Mappings({
            @Mapping(source = "lot", target="lotDto"),
            @Mapping(source = "customer", target="customerDto")})
    BidDto bidToBidDto(Bid bid);
    @Mappings({
            @Mapping(source = "lotDto", target="lot"),
            @Mapping(source = "customerDto", target="customer")})
    Bid bidDtoToBids(BidDto bidDto);


    Customer customerDtoToCustomer(CustomerDto customerDto);
    CustomerDto customerToCustomerDto(Customer customer);

  //  @Mapping(source = "statusDto", target="status")
    Lot lotDtoToLot(LotDto lotDto);
    //@Mapping(source = "status", target="statusDto")
    LotDto lotToLotDto(Lot lot);



}
