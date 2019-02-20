package week01.task03;

import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
public class Customer {

    private long id;

    private String name;

    private List<Good> goods = new ArrayList<Good>();

}
