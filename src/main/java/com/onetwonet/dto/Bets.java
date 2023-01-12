package com.onetwonet.dto;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.onetwonet.jpa.model.Bet;
import lombok.NoArgsConstructor;
import lombok.ToString;
import net.minidev.json.JSONStyle;

import java.util.List;

@ToString
@NoArgsConstructor

public class Bets extends JSONStyle {

    public void setBets(List<Bet> bets) {
        this.bets = bets;
    }

    private List<Bet> bets;

    public Bets(List<Bet> bets) {
        this.bets = bets;
    }

    public List<Bet> getBets() {
        return bets;
    }
}
