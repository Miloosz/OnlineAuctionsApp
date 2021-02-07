package pl.miloszkajetan.serwisAukcyjny.item;

import lombok.*;
import pl.miloszkajetan.serwisAukcyjny.user.BaseEntity;
import pl.miloszkajetan.serwisAukcyjny.user.User;

import javax.persistence.*;
import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
public class Item extends BaseEntity {
    private String itemName;
    @ManyToOne
    private User user;
    private BigDecimal price;
    private String description;
    private String imgURL;
    @Enumerated(EnumType.STRING)
    private CategoryEnum category;
}
