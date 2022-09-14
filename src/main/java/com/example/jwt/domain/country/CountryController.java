package com.example.jwt.domain.country;


import com.example.jwt.domain.country.dto.CountryDTO;
import com.example.jwt.domain.country.dto.CountryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@Validated
@RestController
@RequestMapping("/country")
public class CountryController {

    private final CountryService countryService;
    private final CountryMapper countryMapper;

    @Autowired
    public CountryController(CountryService countryService, CountryMapper countryMapper) {
        this.countryService = countryService;
        this.countryMapper = countryMapper;
    }

    @GetMapping("/{id}")
    public ResponseEntity<CountryDTO> retrieveById(@PathVariable UUID id) {
        Country country = countryService.findById(id);
        return new ResponseEntity<>(countryMapper.toDTO(country), HttpStatus.OK);
    }

    @GetMapping({"", "/"})
    public ResponseEntity<List<CountryDTO>> retrieveAll() {
        List<Country> countrys = countryService.findAll();
        return new ResponseEntity<>(countryMapper.toDTOs(countrys), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CountryDTO> updateById(@PathVariable UUID id, @RequestBody CountryDTO countryDTO) {
        Country country = countryService.updateById(id, countryMapper.fromDTO(countryDTO));
        return new ResponseEntity<>(countryMapper.toDTO(country), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable UUID id) {
        countryService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
