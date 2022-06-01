package com.example.webChat.chatApplicationConfig;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

@Controller
public class MessageController {
    @MessageMapping("/message")
    @SendTo("/topic/messages")
        public TextContent greeting(UserName userName) throws Exception {
        Thread.sleep(1000);
        return new TextContent(HtmlUtils.htmlEscape(((userName.getName()))));
    }
}

