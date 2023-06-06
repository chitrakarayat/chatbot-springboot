package com.example.chatbot.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.example.chatbot.service.ChatbotService;


@Controller
public class ChatController {

    @Autowired
    private ChatbotService chatBotService;
    
    @PostMapping("/chat")
    public String chat(@RequestParam("message") String message, Model model) {
        String response = chatBotService.handleInput(message);
        model.addAttribute("response", response);
        return "chat";
    }

    @ModelAttribute("questions")
    public List<String> questions(){
        List<String> questions = chatBotService.getAllQuestions();
        return questions;
    }
    
    @GetMapping("/chat")
    public String showChatForm(Model model) {
    	@SuppressWarnings("unused")
		List<String> questions = chatBotService.getAllQuestions();
        model.addAttribute("message", new String());
        return "chat";
    }
    
}
