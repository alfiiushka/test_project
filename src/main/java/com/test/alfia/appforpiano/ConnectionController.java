package com.test.alfia.appforpiano;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.net.URLEncoder;
import java.util.List;


@RestController
public class ConnectionController {

    @Autowired
    private JsonParseService jsonParseService;

    @GetMapping(value = "/questions")
    public List<RequestViewDTO> getQuestions(@RequestParam(value = "name", defaultValue = "java") String name) {
        List<RequestViewDTO> items=null;
        try {
            String url = String.format("https://api.stackexchange.com/2.2/search?order=desc&sort=votes&intitle=%s&site=stackoverflow",
                    URLEncoder.encode(name,"UTF-8"));
            items=jsonParseService.getItems(url);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return items;
    }
}
