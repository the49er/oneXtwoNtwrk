package com.onetwonet.service;

import com.onetwonet.jpa.model.Bet;
import com.onetwonet.mapper.BetMapper;
import com.onetwonet.model.BetResponse;
import com.onetwonet.model.BetsCreateRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.decimal4j.util.DoubleRounder;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;


@RequiredArgsConstructor
@Slf4j
@Service
public class BetService {
    private final BetRepository betRepository;

    public List<BetResponse> createBets(BetsCreateRequest betsCreateRequest) {
        List<Bet> bets = betResponseToBet(betsCreateRequest);

        return bets.stream()
                .map(BetMapper.INSTANCE::toDto)
                .collect(Collectors.toList());
    }

    private Bet requestBodyModelToBet(BetResponse betResponse) {
        Bet betModel = new Bet();
        betModel.setId(betResponse.getId());
        betModel.setNumbets(betResponse.getNumbets());
        betModel.setGame(betResponse.getGame());
        betModel.setStake(BigDecimal.valueOf(DoubleRounder.round(betResponse.getStake(), 2)));
        betModel.setReturns(BigDecimal.valueOf(DoubleRounder.round(betResponse.getReturns(), 2)));
        betModel.setClientid(betResponse.getClientid());
        betModel.setDate(LocalDate.parse(betResponse.getDate()));

        return betModel;
    }

    public List<Bet> betResponseToBet(BetsCreateRequest betsCreateRequest) {
        return betsCreateRequest.getBets()
                .stream()
                .map(this::requestBodyModelToBet)
                .collect(Collectors.toList());
    }

    public List<BetResponse> findAll() {
        return betRepository.findAll()
                .stream()
                .map(BetMapper.INSTANCE::toDto)
                .collect(Collectors.toList());
    }
}
