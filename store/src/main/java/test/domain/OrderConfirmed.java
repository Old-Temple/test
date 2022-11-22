package test.domain;

import test.domain.*;
import test.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class OrderConfirmed extends AbstractEvent {

    private Long id;
    private Long menuId;
    private Long customerId;
    private String customerAddress;
    private Integer price;
    private Long shopId;
}


