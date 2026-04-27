package org.enginecontrolserver.application.service;


import lombok.RequiredArgsConstructor;
import org.enginecontrolserver.presentation.dto.LogDTO;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;
@RequiredArgsConstructor
@Service
public class LogService {
    private final SimpMessagingTemplate messageTemplate;
    public void log(LogDTO logDTO){
        messageTemplate.convertAndSend("/topic/log", logDTO);
    }
}
