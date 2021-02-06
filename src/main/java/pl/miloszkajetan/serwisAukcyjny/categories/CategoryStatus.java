package pl.miloszkajetan.serwisAukcyjny.categories;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CategoryStatus {
    boolean opened;
    boolean closed;
}
