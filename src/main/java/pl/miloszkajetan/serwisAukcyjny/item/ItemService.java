package pl.miloszkajetan.serwisAukcyjny.item;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.miloszkajetan.serwisAukcyjny.user.UsersRepository;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;


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
        Item item = Item.builder()
                .itemName(itemDTO.getItemName())
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

    public List<ItemDTO> searchItem(String itemName) {
        return itemRepository.findByItemName(itemName)
                .stream().map(item -> getItemDTO(item)).collect(Collectors.toList()); //this::getItemDTO(item) = item ->
    }

    public List<ItemDTO> getAllItems() {
        return itemRepository.findAll().stream()
                .map(item -> {
                    return getItemDTO(item);
                }).collect(Collectors.toList());
    }


    private ItemDTO getItemDTO(Item item) {
        ItemDTO itemDTO = new ItemDTO();
        itemDTO.setCategory(item.getCategory());
        itemDTO.setDescription(item.getDescription());
        itemDTO.setImgURL(item.getImgURL());
        itemDTO.setItemName(item.getImgURL());
        itemDTO.setPrice(item.getPrice());
        itemDTO.setUserId(item.getId());
        return itemDTO;
    }


}
