package org.enginecontrolserver.presentation.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class EntityDTO {
    private String id;
    private String name;
    private String type;

}
