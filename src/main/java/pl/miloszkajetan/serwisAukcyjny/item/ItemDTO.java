package pl.miloszkajetan.serwisAukcyjny.item;

import lombok.Getter;
import lombok.Setter;
import pl.miloszkajetan.serwisAukcyjny.categories.CategoryEnum;
import java.math.BigDecimal;

@Getter
@Setter
public class ItemDTO  {
    private String itemName;
    private BigDecimal price;
    private String description;
    private String imgURL;
    private CategoryEnum category;
    private long userId;
}
