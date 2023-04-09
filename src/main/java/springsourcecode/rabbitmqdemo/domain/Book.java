package springsourcecode.rabbitmqdemo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book implements Serializable {

    private Integer id;

    private String name;
}
