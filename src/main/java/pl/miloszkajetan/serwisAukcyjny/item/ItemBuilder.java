package pl.miloszkajetan.serwisAukcyjny.item;

import lombok.Builder;

import java.time.LocalDate;

@Builder
public class ItemBuilder {
    public static Item item() {
        Item.builder()
                .itemName(item().getItemName())
                .user(item().getUser())             //Czy tak powinnien wygladc builder itemu z uzytkownikiem
                .price(item().getPrice())
                .category(item().getCategory())
                .lifeOfItem(item().getLifeOfItem())
                .createdAuction(LocalDate.now())
                .description(item().getDescription())
                .build();


        return null;
    }
}
