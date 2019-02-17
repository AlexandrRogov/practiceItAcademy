package Task01_3;

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
