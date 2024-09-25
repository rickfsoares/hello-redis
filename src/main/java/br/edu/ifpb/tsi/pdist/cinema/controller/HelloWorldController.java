package br.edu.ifpb.tsi.pdist.cinema.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import br.edu.ifpb.tsi.pdist.cinema.service.HelloWorldService;
import br.edu.ifpb.tsi.pdist.cinema.DTO.Mensagem;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {

    @Autowired
    private HelloWorldService helloWorldService;

    @GetMapping
    public String getMensagem(@RequestParam("key") String key) {
        return helloWorldService.getMensagem(key);
    }

    @PostMapping
    public void criarMensagem(@RequestBody Mensagem msg) {
        helloWorldService.criar(msg.getKey(), msg.getMensagem());
    }
}
