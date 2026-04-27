package org.enginecontrolserver.presentation.controller;

import lombok.RequiredArgsConstructor;
import org.enginecontrolserver.application.service.LogService;
import org.enginecontrolserver.presentation.dto.LogDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequiredArgsConstructor
@RestController
@RequestMapping("/log")
public class LogController {
    
    private final LogService logService;
    @PostMapping
    public void log(@RequestBody LogDTO logDTO){
        logService.log(logDTO);
    }
    
}
