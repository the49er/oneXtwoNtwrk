package com.onetwonet.mapper;

import com.onetwonet.jpa.model.Bet;
import com.onetwonet.model.BetResponse;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(uses = BetMapper.class)
public interface BetMapper {
    BetMapper INSTANCE = Mappers.getMapper(BetMapper.class);
    BetResponse toDto(Bet bet);
}
