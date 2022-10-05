package com.example.jwt.domain.teatype;


import com.example.jwt.domain.teatype.dto.TeaTypeDTO;
import com.example.jwt.domain.teatype.dto.TeaTypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@Validated
@RestController
@RequestMapping("/teatype")
public class TeaTypeController {

    private final TeaTypeService teaTypeService;
    private final TeaTypeMapper teaTypeMapper;

    @Autowired
    public TeaTypeController(TeaTypeService teaTypeService, TeaTypeMapper teaTypeMapper) {
        this.teaTypeService = teaTypeService;
        this.teaTypeMapper = teaTypeMapper;
    }

    @GetMapping("/{id}")
    public ResponseEntity<TeaTypeDTO> retrieveById(@PathVariable UUID id) {
        TeaType teaType = teaTypeService.findById(id);
        return new ResponseEntity<>(teaTypeMapper.toDTO(teaType), HttpStatus.OK);
    }

    @GetMapping({"", "/"})
    public ResponseEntity<List<TeaTypeDTO>> retrieveAll() {
        List<TeaType> teaTypes = teaTypeService.findAll();
        return new ResponseEntity<>(teaTypeMapper.toDTOs(teaTypes), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<TeaTypeDTO> updateById(@PathVariable UUID id, @RequestBody TeaTypeDTO teaTypeDTO) {
        TeaType teaType = teaTypeService.updateById(id, teaTypeMapper.fromDTO(teaTypeDTO));
        return new ResponseEntity<>(teaTypeMapper.toDTO(teaType), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable UUID id) {
        teaTypeService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
