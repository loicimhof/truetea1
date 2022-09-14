package com.example.jwt.domain.order_tea;


import com.example.jwt.domain.order_tea.dto.OrderPositionDTO;
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
public class OrderPositionController {

    private final OrderPositionService orderPositionService;
    private final OrderTeaMapper orderTeaMapper;

    @Autowired
    public OrderPositionController(OrderPositionService orderPositionService, OrderTeaMapper orderTeaMapper) {
        this.orderPositionService = orderPositionService;
        this.orderTeaMapper = orderTeaMapper;
    }

    @GetMapping("/{id}")
    public ResponseEntity<OrderPositionDTO> retrieveById(@PathVariable UUID id) {
        OrderPosition orderPosition = orderPositionService.findById(id);
        return new ResponseEntity<>(orderTeaMapper.toDTO(orderPosition), HttpStatus.OK);
    }

    @GetMapping({"", "/"})
    public ResponseEntity<List<OrderPositionDTO>> retrieveAll() {
        List<OrderPosition> orderPositions = orderPositionService.findAll();
        return new ResponseEntity<>(orderTeaMapper.toDTOs(orderPositions), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<OrderPositionDTO> updateById(@PathVariable UUID id, @RequestBody OrderPositionDTO orderPositionDTO) {
        OrderPosition orderPosition = orderPositionService.updateById(id, orderTeaMapper.fromDTO(orderPositionDTO));
        return new ResponseEntity<>(orderTeaMapper.toDTO(orderPosition), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable UUID id) {
        orderPositionService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}