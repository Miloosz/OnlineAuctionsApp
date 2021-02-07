package pl.miloszkajetan.serwisAukcyjny.item;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;

@RestController
public class ItemController {
    private final ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @PostMapping("/items")
    public ResponseEntity<Void> addItemToService(@RequestBody ItemDTO itemDTO) throws URISyntaxException {
        Item itemId = itemService.addItem(itemDTO);
        return ResponseEntity.
                created(new URI("/items" + itemId.getId()))
                .build();
    }
}
