package pack.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pack.model.User;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

@RestController
public class ParseController {

    @GetMapping("/parse")
    String parse(@RequestParam(name="product", required =false) String product) throws IOException {
        String address = "https://beru.ru/product/" + product;
        System.out.println(address);
//        String address = "https://beru.ru/product/mediapleer-apple-tv-4k-32gb/1732194227";
        URL url = new URL(address);
        BufferedReader br = new BufferedReader(new InputStreamReader(url.openConnection().getInputStream()));
        String s;
        while((s = br.readLine())!=null){
//            if (s.contains("Ой123")){
//                br.close();
//                return "Нет товара";
//            }
            System.out.println(s);
        }
        br.close();
        return "Есть товар";
    }
}
