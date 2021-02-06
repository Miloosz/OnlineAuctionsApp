package pl.miloszkajetan.serwisAukcyjny.item;

import lombok.Builder;

import java.time.LocalDate;

@Builder
public class ItemBuilder {
    public static Item item() {
        Item.builder()
                .itemName(item().getItemName())
                .user(item().getUser())
                .price(item().getPrice())
                .category(item().getCategory())
                .description(item().getDescription())
                .imgURL(item().getImgURL())
                .build();
        return null;
    }
}
