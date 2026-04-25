package org.enginecontrolserver.infrastructure;


import org.springframework.stereotype.Component;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Component
public class EngineClient {
    private final HttpClient httpClient =  HttpClient.newBuilder().build();
    private final String engineUrl = "http://localhost:8081";

    public void requestCreatEntity(String json){
        try {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(engineUrl + "/entity"))
                    .header("Content-Type", "application/json")
                    .POST(HttpRequest.BodyPublishers.ofString(json))
                    .build();

            httpClient.send(request, HttpResponse.BodyHandlers.ofString());

        } catch (Exception e) {
            throw new RuntimeException("Failed to send to engine", e);
        }
    }

}
