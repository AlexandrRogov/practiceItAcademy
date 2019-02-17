package Task01_2;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class Customer {

    private long id;

    private BigDecimal bill;

}
