package Items;

import lombok.Data;
import lombok.Setter;


public class Item {

    public int price;

    public String name;

    public Item(int price, String name){
        this.name = name;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }
}
