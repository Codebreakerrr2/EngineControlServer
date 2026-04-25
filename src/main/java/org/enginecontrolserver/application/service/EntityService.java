package org.enginecontrolserver.application.service;

import org.enginecontrolserver.presentation.dto.EntityDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

@Service
public class EntityService {

    private HashMap<String, EntityDTO> entityDTOMap =  new HashMap<>();

    public EntityDTO createEntity(EntityDTO entityDTO){
        if (entityDTO.getId() == null) {
            throw new IllegalArgumentException("Engine must provide ID");
        }
        entityDTOMap.put(entityDTO.getId(), entityDTO);
        return entityDTO;
    }
    public ArrayList<EntityDTO> getEntityDTOList(){
        return new ArrayList<>(entityDTOMap.values());
    }
    public EntityDTO getEntityDTO(String uuid){
        return entityDTOMap.get(uuid);
    }

    public void deleteEntity(String uuid){
        entityDTOMap.remove(uuid);
    }


}
