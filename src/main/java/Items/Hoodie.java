package Items;

import lombok.Data;

@Data
public class Hoodie extends Item{


    public Hoodie(int price, String name) {
        super(price, name);
    }


}
