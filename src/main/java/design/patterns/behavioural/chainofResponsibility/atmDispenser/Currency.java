package design.patterns.behavioural.chainofResponsibility.atmDispenser;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

/**
 * Created By durgesh.soni on 19/04/20
 */

@Data
@AllArgsConstructor
public class Currency {
    private Country country;
    private int value;

    @Getter
    @AllArgsConstructor
    enum Country {
        AMERICA("DOLLAR"),
        INDIA("INR");

        private String currencyCode;
    }

}
