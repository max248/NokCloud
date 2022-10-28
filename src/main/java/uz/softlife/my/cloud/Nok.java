package uz.softlife.my.cloud;

import lombok.Data;

import java.util.List;

@Data
public class Nok {
    private String name;
    private List<Ingredient> ingredients;
}
