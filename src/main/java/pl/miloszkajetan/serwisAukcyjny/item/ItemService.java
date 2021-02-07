package pl.miloszkajetan.serwisAukcyjny.item;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.miloszkajetan.serwisAukcyjny.user.UsersRepository;


@Service
public class ItemService {
    private ItemRepository itemRepository;
    private UsersRepository usersRepository;


    @Autowired
    public ItemService(ItemRepository itemRepository, UsersRepository usersRepository) {
        this.itemRepository = itemRepository;
        this.usersRepository = usersRepository;
    }

    public Item addItem(ItemDTO itemDTO) {
        Item item = Item.builder().itemName(itemDTO.getItemName())
                .user(usersRepository.getOne(itemDTO.getUserId()))
                .price(itemDTO.getPrice())
                .category(itemDTO.getCategory())
                .description(itemDTO.getDescription())
                .imgURL(itemDTO.getImgURL())
                .build();
        itemRepository.save(item);
        return item;
    }

    public void deleteItem(Item item) {
        itemRepository.delete(item);

    }

    public void editItem(Item item) {


    }

    public void searchItem() {

    }
}
