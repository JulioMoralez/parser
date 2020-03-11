package pack.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pack.model.User;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

@RestController
public class ParseController {

    @GetMapping("/parse")
    String parse() throws IOException {
        String address = "https://beru.ru/product/mediapleer-okko-smart-box-chernyi/100844254102";
//        String address = "https://beru.ru/product/mediapleer-apple-tv-4k-32gb/1732194227";
        URL url = new URL(address);
        BufferedReader br = new BufferedReader(new InputStreamReader(url.openConnection().getInputStream()));
        String s;
        while((s = br.readLine())!=null){
            System.out.println(s);
        }
        br.close();
        return "ololo";
    }
}
