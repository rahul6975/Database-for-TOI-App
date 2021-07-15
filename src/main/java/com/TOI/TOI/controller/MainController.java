package com.TOI.TOI.controller;

import com.TOI.TOI.entity.Api;
import com.TOI.TOI.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class MainController {

    @Autowired
    private RestTemplate restTemplate;

    private ApiService apiService;

    @Autowired
    public void ApiRestController(ApiService theEmployeeService) {
        apiService = theEmployeeService;
    }

    @GetMapping("/hello")
    public List<Api> findAll() {
        return apiService.findAll();
    }

    @GetMapping("/sports")
    public Object sports() {
        return restTemplate.getForObject(
                "https://newsapi.org/v2/top-headlines?country=in&category=sports&apiKey=ac037dc54dbd40819a3e034f67e08531",
                Object.class);
    }

    @GetMapping("/politics")
    public Object getPolitics() {
        return restTemplate.getForObject(
                "https://newsapi.org/v2/top-headlines?country=in&category=politics&apiKey=ac037dc54dbd40819a3e034f67e08531",
                Object.class);
    }

    @GetMapping("/topHeadlines")
    public Object topHeadlines() {
        return restTemplate.getForObject(
                "https://newsapi.org/v2/top-headlines?country=in&apiKey=ac037dc54dbd40819a3e034f67e08531",
                Object.class);
    }

    @GetMapping("/entertainment")
    public Object entertainment() {
        return restTemplate.getForObject(
                "https://newsapi.org/v2/top-headlines?country=in&category=entertainment&apiKey=ac037dc54dbd40819a3e034f67e08531",
                Object.class);
    }

    @GetMapping("/technology")
    public Object technology() {
        return restTemplate.getForObject(
                "https://newsapi.org/v2/top-headlines?country=in&category=technology&apiKey=ac037dc54dbd40819a3e034f67e08531",
                Object.class);
    }

    @GetMapping("/health")
    public Object health() {
        return restTemplate.getForObject(
                "https://newsapi.org/v2/top-headlines?country=in&category=health&apiKey=ac037dc54dbd40819a3e034f67e08531",
                Object.class);
    }

    @GetMapping("/india")
    public Object india() {
        return restTemplate.getForObject(
                "https://newsapi.org/v2/top-headlines?country=in&apiKey=ac037dc54dbd40819a3e034f67e08531",
                Object.class);
    }

    @GetMapping("/business")
    public Object business() {
        return restTemplate.getForObject(
                "https://newsapi.org/v2/top-headlines?country=in&category=business&apiKey=ac037dc54dbd40819a3e034f67e08531",
                Object.class);
    }

}