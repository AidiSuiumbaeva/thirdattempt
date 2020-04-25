package kg.megacom.secondattempt.mapper;

import kg.megacom.secondattempt.models.Bid;
import kg.megacom.secondattempt.models.dto.BidDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface BidMapper {

    BidMapper getInstance= Mappers.getMapper(BidMapper.class);

    @Mappings({
            @Mapping(source = "lot", target="lotDto"),
            @Mapping(source = "customer", target="customerDto")})
    BidDto bidToBidDto(Bid bid);
    @Mappings({
            @Mapping(source = "lotDto", target="lot"),
            @Mapping(source = "customerDto", target="customer")})
    Bid bidDtoToBids(BidDto bidDto);

    List<BidDto> bidsToBidDtos(List<Bid> bids);
}
