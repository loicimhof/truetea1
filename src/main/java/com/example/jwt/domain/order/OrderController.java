package com.example.jwt.domain.order;


import com.example.jwt.domain.order.dto.OrderDTO;
import com.example.jwt.domain.order.dto.OrderMapper;
import com.example.jwt.domain.order_tea.dto.OrderPositionDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@Validated
@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderService orderService;
    private final OrderMapper orderMapper;

    @Autowired
    public OrderController(OrderService orderService, OrderMapper orderMapper) {
        this.orderService = orderService;
        this.orderMapper = orderMapper;
    }

    @GetMapping("/{id}")
    public ResponseEntity<OrderDTO> retrieveById(@PathVariable UUID id) {
        Order order = orderService.findById(id);
        return new ResponseEntity<>(orderMapper.toDTO(order), HttpStatus.OK);
    }

    @GetMapping({"", "/"})
    public ResponseEntity<List<OrderDTO>> retrieveAll() {
        List<Order> orders = orderService.findAll();
        return new ResponseEntity<>(orderMapper.toDTOs(orders), HttpStatus.OK);
    }

    @PostMapping({"", "/"})
    public ResponseEntity<OrderDTO> saveOrder(@RequestBody OrderDTO orderDTO) throws Exception {
        Order savedOrder = orderService.save(orderMapper.fromDTO(orderDTO));
        return ResponseEntity.ok()
                .body(orderMapper.toDTO(savedOrder));
    }

    @PutMapping("/{id}")
    public ResponseEntity<OrderDTO> updateById(@PathVariable UUID id, @RequestBody OrderDTO orderDTO) {
        Order order = orderService.updateById(id, orderMapper.fromDTO(orderDTO));
        return new ResponseEntity<>(orderMapper.toDTO(order), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable UUID id) {
        orderService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}

