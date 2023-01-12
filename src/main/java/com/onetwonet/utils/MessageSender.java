package com.onetwonet.utils;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
@Slf4j
@RequiredArgsConstructor
public class MessageSender implements Runnable {
    private HttpClient client = HttpClient.newHttpClient();

    @Value("${kafka.msg.generate.address}")
    private String generateKafkaMsgUrl;
    private final String jsonInString;
    private final HttpClient httpClient = HttpClient.newHttpClient();


    @Override
    public void run() {
        log.info("Send msg: new bets inserted");
        HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(generateKafkaMsgUrl))
                        .POST(HttpRequest.BodyPublishers.ofString(jsonInString))
                        .header("Content-Type", "application/json")
                        .build();

        try {
            httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
