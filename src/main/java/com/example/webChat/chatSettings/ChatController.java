package com.example.webChat.chatSettings;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/home")
@RequiredArgsConstructor
public class ChatController {

    @GetMapping("/app")
   public String getChat() {
        return "/app";
    }

    @GetMapping
    public String getRoot() {
        return "/home";
    }

}
