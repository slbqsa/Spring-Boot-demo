package com.example.demo.controller;

import com.example.demo.dto.AccessTokenDTO;
import com.example.demo.provider.Githubprovider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by slbqsa on 2019/7/20
 */
@Controller
public class AuthorizeController {
    @Autowired
    private Githubprovider githubprovider;

    @GetMapping("/callback")
    public String callback(@RequestParam(name = "code")String code,
                           @RequestParam(name = "state")String state){
        AccessTokenDTO accessTokenDTO = new AccessTokenDTO();
        accessTokenDTO.setCode(code);
        accessTokenDTO.setRedirect_uri("http://localhost:8080/callback");
        accessTokenDTO.setState(state);
        accessTokenDTO.setClient_id(" Iv1.8aa52cefb3151283");
        accessTokenDTO.setClient_secret("64f4674e1c0bf8d5da9bb59be1b393dc418f7ff5");
        githubprovider.getAccessToken(accessTokenDTO);
        return "index";
    }
}
