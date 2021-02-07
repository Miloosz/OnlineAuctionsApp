package pl.miloszkajetan.serwisAukcyjny.item;

import lombok.Builder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.miloszkajetan.serwisAukcyjny.categories.CategoryRepository;
import pl.miloszkajetan.serwisAukcyjny.user.UsersRepository;


@Service
public class ItemService {
    private ItemRepository itemRepository;
    private UsersRepository usersRepository;
    private CategoryRepository categoryRepository;

    @Autowired
    public ItemService(ItemRepository itemRepository, UsersRepository usersRepository, CategoryRepository categoryRepository) {
        this.itemRepository = itemRepository;
        this.usersRepository = usersRepository;
        this.categoryRepository = categoryRepository;
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
