package uz.softlife.my.cloud;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class NokOrder {
    private String deliveryName;
    private String deliveryStreet;
    private String deliveryCity;
    private String deliveryState;
    private String deliveryZip;
    private String ccNumber;
    private String ccExpiration;
    private String ccCVV;
    private List<Nok> noks = new ArrayList<>();
    public void addNok(Nok nok) {
        this.noks.add(nok);
    }
}
