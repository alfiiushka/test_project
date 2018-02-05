package com.test.alfia.appforpiano;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;


@RestController
@RequestMapping("/api")
public class ConnectionController {

    @GetMapping(value="/hello")
    public String getHello(){
        return "hi";
    }

    @GetMapping(value = "/questions")
    public String getQuestions(@RequestParam(value = "name", defaultValue = "java") String name) {
        RequestViewDTO requestViewDTO = null;
        try {
            RestTemplate restTemplate = new RestTemplate();
            String url = "https://api.stackexchange.com/2.2/search?order=desc&sort=votes&intitle=" + name + "&site=stackoverflow";
            ResponseEntity<RequestViewDTO[]> responseEntity = restTemplate.getForEntity(url, RequestViewDTO[].class);
            requestViewDTO = Arrays.stream(responseEntity.getBody()).findFirst().orElse(null);
        }catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
            if (requestViewDTO != null)
                return requestViewDTO.getLink();
            else
                return null;

    }
}
