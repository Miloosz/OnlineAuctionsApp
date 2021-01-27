package pl.miloszkajetan.serwisAukcyjny.categories;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pl.miloszkajetan.serwisAukcyjny.user.BaseEntity;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Category extends BaseEntity {

    private Long categoryId;
    private String categoryName;

}
