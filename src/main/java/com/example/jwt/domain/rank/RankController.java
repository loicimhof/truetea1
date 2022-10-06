package com.example.jwt.domain.rank;


import com.example.jwt.domain.rank.dto.RankDTO;
import com.example.jwt.domain.rank.dto.RankMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@Validated
@RestController
@RequestMapping("/ranks")
public class RankController {

    private final RankService rankService;
    private final RankMapper rankMapper;

    @Autowired
    public RankController(RankService rankService, RankMapper rankMapper) {
        this.rankService = rankService;
        this.rankMapper = rankMapper;
    }

    @GetMapping("/{id}")
    public ResponseEntity<RankDTO> retrieveById(@PathVariable UUID id) {
        Rank rank = rankService.findById(id);
        return new ResponseEntity<>(rankMapper.toDTO(rank), HttpStatus.OK);
    }

    @GetMapping({"", "/"})
    public ResponseEntity<List<RankDTO>> retrieveAll() {
        List<Rank> ranks = rankService.findAll();
        return new ResponseEntity<>(rankMapper.toDTOs(ranks), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<RankDTO> updateById(@PathVariable UUID id, @RequestBody RankDTO rankDTO) {
        Rank rank = rankService.updateById(id, rankMapper.fromDTO(rankDTO));
        return new ResponseEntity<>(rankMapper.toDTO(rank), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable UUID id) {
        rankService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}

