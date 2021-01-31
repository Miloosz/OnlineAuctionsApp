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


    public void addItem() {

    }

    public void deleteItem() {

    }

    public void editItem() {

    }

    public void searchItem() {

    }
}
