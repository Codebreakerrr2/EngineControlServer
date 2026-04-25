package org.enginecontrolserver.presentation.controller;


import lombok.RequiredArgsConstructor;
import org.enginecontrolserver.application.service.EntityService;
import org.enginecontrolserver.infrastructure.EngineClient;
import org.enginecontrolserver.presentation.dto.EntityDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/user/entity")
public class EntityController {

    private final EngineClient engineClient;
    private final EntityService entityService;
    @GetMapping
    public List<EntityDTO> getAllEntities(){
       return entityService.getEntityDTOList();
    }
    @PostMapping
    public void createEntity(@RequestBody EntityDTO entityDTO){
        engineClient.requestCreatEntity(
                "{\"id\":\"" + entityDTO.getId() + "\",\"name\":\"" + entityDTO.getName() + "\"}"
        );
    }

}
