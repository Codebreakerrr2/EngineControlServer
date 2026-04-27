package org.enginecontrolserver.presentation.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class LogDTO {

 public enum Level{
        INFO,
        ERROR,
        DEBUG
    }
    private String message;
    private Level level;
    private String timestamp;
    private String thread;
    private String source;


}
