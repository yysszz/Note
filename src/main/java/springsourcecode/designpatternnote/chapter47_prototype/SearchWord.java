package springsourcecode.designpatternnote.chapter47_prototype;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SearchWord {
    private String keyWord;
    private Integer count;
    private long lastUpdateTime;
}
