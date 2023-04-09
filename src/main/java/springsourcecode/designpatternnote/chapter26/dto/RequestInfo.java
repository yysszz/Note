package springsourcecode.designpatternnote.chapter26.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RequestInfo {

    private String apiName;

    private double responseTime;

    private long timestamp;

}
