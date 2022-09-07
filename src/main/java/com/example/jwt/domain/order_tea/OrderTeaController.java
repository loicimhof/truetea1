package com.example.jwt.domain.order_tea;


import com.example.jwt.domain.order_tea.dto.OrderTeaDTO;
import com.example.jwt.domain.order_tea.dto.OrderTeaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@Validated
@RestController
@RequestMapping("/orderTeas")
public class OrderTeaController {

    private final OrderTeaService orderTeaService;
    private final OrderTeaMapper orderTeaMapper;

    @Autowired
    public OrderTeaController(OrderTeaService orderTeaService, OrderTeaMapper orderTeaMapper) {
        this.orderTeaService = orderTeaService;
        this.orderTeaMapper = orderTeaMapper;
    }

    @GetMapping("/{id}")
    public ResponseEntity<OrderTeaDTO> retrieveById(@PathVariable UUID id) {
        OrderTea orderTea = orderTeaService.findById(id);
        return new ResponseEntity<>(orderTeaMapper.toDTO(orderTea), HttpStatus.OK);
    }

    @GetMapping({"", "/"})
    public ResponseEntity<List<OrderTeaDTO>> retrieveAll() {
        List<OrderTea> orderTeas = orderTeaService.findAll();
        return new ResponseEntity<>(orderTeaMapper.toDTOs(orderTeas), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<OrderTeaDTO> updateById(@PathVariable UUID id, @RequestBody OrderTeaDTO orderTeaDTO) {
        OrderTea orderTea = orderTeaService.updateById(id, orderTeaMapper.fromDTO(orderTeaDTO));
        return new ResponseEntity<>(orderTeaMapper.toDTO(orderTea), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable UUID id) {
        orderTeaService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}