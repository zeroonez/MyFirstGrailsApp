package com.nguyenno.apps.rest;

import com.nguyenno.apps.User;
import com.nguyenno.apps.configs.MemsourceRestProperties;
import com.nguyenno.apps.projects.ListOfProjects;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.reactive.function.client.ClientResponse;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.Arrays;

public class MemSourceService {
    private WebClient webClient;
    private MultiValueMap<String, String> cookieMap = new LinkedMultiValueMap<>();
    private MemsourceRestProperties memsourceRestProperties;


    public MemSourceService(MemsourceRestProperties memsourceRestProperties) {
        this.memsourceRestProperties = memsourceRestProperties;
        this.webClient = WebClient.builder()
                .build();
    }

    public Boolean amILogIn(){
        return webClient.get()
                .uri(memsourceRestProperties.getWhoAmIUri())
                .accept(MediaType.APPLICATION_JSON)
                .cookies(cookies -> cookies.addAll(cookieMap))
                .exchange()
                .flatMap(response -> handleResponse(response))
                .block();
    }

    public void loginToSession(User user){
        webClient.post()
                .uri(memsourceRestProperties.getLoginToSessionUri())//https://cloud.memsource.com/web/api2/v1/auth/loginToSession
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON)
                .body(Mono.just(user), User.class)
                .exchange()
                .flatMap(r -> Mono.just(r.cookies()))
                .block()
                .forEach( (k, v) ->
                        cookieMap.put(k, Arrays.asList(v.get(0).getValue()))
                );
    }

    public ListOfProjects getListOfProjects(){
        return webClient.get()
                .uri(memsourceRestProperties.getProjectsUri())//https://cloud.memsource.com/web/api2/v1/projects
                .accept(MediaType.APPLICATION_JSON)
                .cookies(cookies -> cookies.addAll(cookieMap))
                .exchange()
                .flatMap(response -> response.toEntity(ListOfProjects.class))
                .block()
                .getBody();
    }

    private Mono<Boolean> handleResponse(ClientResponse clientResponse){
        if(clientResponse.statusCode().is4xxClientError()){
            return Mono.just(false);
        }
        return Mono.just(true);
    }

}
