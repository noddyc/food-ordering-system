package com.food.ordering.system.order.service.domain;

import com.food.ordering.system.order.service.domain.ports.input.service.OrderApplicationService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.boot.test.context.SpringBootTest;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@SpringBootTest(classes = OrderApplicationService.class)
public class OrderAplicationServiceTest {

    @Test
    public void test1(){
        assert(true);
    }
}
