package com.penroz.springawsredis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/")
public class Controller {

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    @PostMapping
    public ResponseEntity<?> set(@RequestBody final Data data) {
        redisTemplate.opsForValue().set(data.getKey(), data.getValue());
        return ResponseEntity.ok(data);
    }

    @GetMapping("{key}")
    public ResponseEntity<?> get(@PathVariable final String key) {
        final String value = redisTemplate.opsForValue().get(key);
        final Data data = new Data(key, value);
        return ResponseEntity.ok(data);
    }
}
