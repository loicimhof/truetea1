package com.example.jwt.domain.teatype;

import com.example.jwt.core.generic.ExtendedRepository;
import com.example.jwt.domain.tea.Tea;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TeaTypeRepository extends ExtendedRepository<TeaType> {

}
