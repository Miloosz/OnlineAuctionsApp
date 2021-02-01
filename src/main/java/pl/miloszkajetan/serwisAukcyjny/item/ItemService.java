package pl.miloszkajetan.serwisAukcyjny.item;

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


    private void addItem(Item item) {

        itemRepository.save(item);                                           // Czy tak może być?

    }

    private void deleteItem(Item item) {
        itemRepository.delete(item);

    }

    private void editItem(Item item) {


    }

    private void searchItem() {

    }
}
