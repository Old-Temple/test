package test.external;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;

@FeignClient(name = "store", url = "${api.url.store}")
public interface ShopOrderService {
    @RequestMapping(method= RequestMethod.GET, path="/shopOrders/{id}")
    public ShopOrder getShopOrder(@PathVariable("id") Long id);
}

