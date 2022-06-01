package com.example.webChat.chatApplicationConfig;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class TextContent {

    @NotBlank(message = "Message can't be blank")
    private String content;

}