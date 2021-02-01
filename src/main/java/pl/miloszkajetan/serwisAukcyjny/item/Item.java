package pl.miloszkajetan.serwisAukcyjny.item;

import lombok.*;
import pl.miloszkajetan.serwisAukcyjny.categories.CategoryEnum;
import pl.miloszkajetan.serwisAukcyjny.user.BaseEntity;
import pl.miloszkajetan.serwisAukcyjny.user.User;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

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
    private LocalDate lifeOfItem;
    private LocalDate createdAuction;
    private String description;
    @Enumerated(EnumType.STRING)
    private CategoryEnum category;


}
