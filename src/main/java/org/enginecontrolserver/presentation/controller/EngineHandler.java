package org.enginecontrolserver.presentation.controller;


import lombok.RequiredArgsConstructor;
import org.enginecontrolserver.application.service.EntityService;
import org.enginecontrolserver.presentation.dto.EntityDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequiredArgsConstructor
@RestController
@RequestMapping("/engine")
public class EngineHandler {

    private final EntityService entityService;
    @PostMapping("/entity")
    public void recieveEntity(@RequestBody EntityDTO entityDTO) {
        entityService.createEntity(entityDTO);
    }
    @PostMapping("/updateEntity")
    public void updateEntity(@RequestBody EntityDTO entityDTO) {

    }


}
