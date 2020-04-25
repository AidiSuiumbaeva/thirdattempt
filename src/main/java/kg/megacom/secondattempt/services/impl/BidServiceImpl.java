package kg.megacom.secondattempt.services.impl;

import kg.megacom.secondattempt.mapper.BidMapper;
import kg.megacom.secondattempt.models.Bid;
import kg.megacom.secondattempt.models.dto.BidDto;
import kg.megacom.secondattempt.repositories.BidRep;
import kg.megacom.secondattempt.services.BidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BidServiceImpl implements BidService {
    @Autowired
    private BidRep bidRep;
    @Override
    public BidDto save(BidDto bidDto) {
        Bid bid= BidMapper.getInstance.bidDtoToBids(bidDto);
        bidRep.save(bid);
        bidDto=BidMapper.getInstance.bidToBidDto(bid);
        return bidDto;
    }

    @Override
    public BidDto find(Long id) {

        return BidMapper.getInstance.bidToBidDto(bidRep.findById(id).orElse(null));
    }

    @Override
    public List<BidDto> getList() {

        return BidMapper.getInstance.bidsToBidDtos(bidRep.findAll());
    }
}
