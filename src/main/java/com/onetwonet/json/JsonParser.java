package com.onetwonet.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.onetwonet.dto.Bets;
import com.onetwonet.jpa.model.Bet;
import net.minidev.json.JSONObject;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class JsonParser {
    private final ObjectMapper objectMapper = new ObjectMapper();

    {
        objectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        objectMapper.findAndRegisterModules();
    }

    public <T> T getModel(String json, Class<T> clazz){
        try {
            return objectMapper.readValue(json, clazz);
        } catch (JsonProcessingException e) {
            throw new RuntimeException("Cannot map Entity from : " + json, e);
        }
    }

    public Bets getBetsModel(Bets message){
        JSONObject jsonObject = new JSONObject();
        String json = jsonObject.toString(message);
        return getModel(json, Bets.class);
    }

    public String objectToString(List<Bet> bets){
        Bets betsModel = new Bets(bets);
        String jsonInString;
        try {
            jsonInString = objectMapper.writeValueAsString(betsModel);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        return jsonInString;
    }
}
