package com.example.jwt.domain.country.dto;

import com.example.jwt.domain.country.Country;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-09-14T10:45:39+0200",
    comments = "version: 1.5.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.5.jar, environment: Java 17.0.4.1 (Amazon.com Inc.)"
)
@Component
public class CountryMapperImpl implements CountryMapper {

    @Override
    public List<Country> fromDTOs(List<CountryDTO> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<Country> list = new ArrayList<Country>( dtos.size() );
        for ( CountryDTO countryDTO : dtos ) {
            list.add( fromDTO( countryDTO ) );
        }

        return list;
    }

    @Override
    public Set<Country> fromDTOs(Set<CountryDTO> dtos) {
        if ( dtos == null ) {
            return null;
        }

        Set<Country> set = new LinkedHashSet<Country>( Math.max( (int) ( dtos.size() / .75f ) + 1, 16 ) );
        for ( CountryDTO countryDTO : dtos ) {
            set.add( fromDTO( countryDTO ) );
        }

        return set;
    }

    @Override
    public List<CountryDTO> toDTOs(List<Country> BOs) {
        if ( BOs == null ) {
            return null;
        }

        List<CountryDTO> list = new ArrayList<CountryDTO>( BOs.size() );
        for ( Country country : BOs ) {
            list.add( toDTO( country ) );
        }

        return list;
    }

    @Override
    public Set<CountryDTO> toDTOs(Set<Country> BOs) {
        if ( BOs == null ) {
            return null;
        }

        Set<CountryDTO> set = new LinkedHashSet<CountryDTO>( Math.max( (int) ( BOs.size() / .75f ) + 1, 16 ) );
        for ( Country country : BOs ) {
            set.add( toDTO( country ) );
        }

        return set;
    }

    @Override
    public Country fromDTO(CountryDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Country country = new Country();

        country.setId( dto.getId() );

        return country;
    }

    @Override
    public CountryDTO toDTO(Country country) {
        if ( country == null ) {
            return null;
        }

        CountryDTO countryDTO = new CountryDTO();

        countryDTO.setId( country.getId() );

        return countryDTO;
    }
}
