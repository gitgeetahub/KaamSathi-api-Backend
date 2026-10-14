package com.kaamsathi.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class RootController {
    @GetMapping("/")
    public Map<String, Object> root() {
        return Map.of("ok", true, "message", "KaamSathi backend is running. Use /api/health, /api/auth/login, etc.");
    }
}