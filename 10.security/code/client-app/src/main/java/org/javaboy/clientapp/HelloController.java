package org.javaboy.clientapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

/**
 * HelloController
 *
 * @author arctic
 * @date 2020/5/6
 **/
@Controller
public class HelloController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/index.html")
    public String index(String code, Model model){
        Object msg = "";
        if (code!=null){
            MultiValueMap<String, String> map = new LinkedMultiValueMap<>();
            map.add("code", code);
            map.add("client_id", "javaboy");
            map.add("client_secret", "123");
            map.add("redirect_uri", "http://localhost:8082/index.html");
            map.add("grant_type", "authorization_code");
            Map resp = restTemplate.postForObject("http://localhost:8080/oauth/token", map, Map.class);
            System.out.println("resp = " + resp);
            HttpHeaders headers = new HttpHeaders();
            assert resp != null;
            headers.add("authorization", "Bearer "+resp.get("access_token"));
            HttpEntity<?> httpEntity = new HttpEntity<>(headers);
            ResponseEntity<String> responseEntity = restTemplate.exchange("http://localhost:8081/hello", HttpMethod.GET, httpEntity, String.class);
            msg = responseEntity.getBody();
        }
        model.addAttribute("msg", msg);
        return "index";

    }
}
