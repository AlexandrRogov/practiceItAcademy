package week01.task03;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Builder
@Data
class Good {

    private long id;

    private String info;

    private BigDecimal price;
}
