package pl.miloszkajetan.serwisAukcyjny.item;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pl.miloszkajetan.serwisAukcyjny.categories.CategoryEnum;
import pl.miloszkajetan.serwisAukcyjny.user.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Item extends BaseEntity {
    private String itemName;
    private String seller; //Czy tutaj łaczyc z User ze dany uzytkonik dodal item na sprzedaz czy gdzies indziej
    private BigDecimal price;
    private LocalDate lifeOfItem;
    private LocalDate createdAuction;

    @Enumerated(EnumType.STRING)
    private CategoryEnum category;

}
