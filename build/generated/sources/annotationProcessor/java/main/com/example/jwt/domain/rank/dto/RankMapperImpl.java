package com.example.jwt.domain.rank.dto;

import com.example.jwt.domain.rank.Rank;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-10-05T15:42:18+0200",
    comments = "version: 1.5.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.5.jar, environment: Java 17.0.4.1 (Amazon.com Inc.)"
)
@Component
public class RankMapperImpl implements RankMapper {

    @Override
    public List<Rank> fromDTOs(List<RankDTO> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<Rank> list = new ArrayList<Rank>( dtos.size() );
        for ( RankDTO rankDTO : dtos ) {
            list.add( fromDTO( rankDTO ) );
        }

        return list;
    }

    @Override
    public Set<Rank> fromDTOs(Set<RankDTO> dtos) {
        if ( dtos == null ) {
            return null;
        }

        Set<Rank> set = new LinkedHashSet<Rank>( Math.max( (int) ( dtos.size() / .75f ) + 1, 16 ) );
        for ( RankDTO rankDTO : dtos ) {
            set.add( fromDTO( rankDTO ) );
        }

        return set;
    }

    @Override
    public List<RankDTO> toDTOs(List<Rank> BOs) {
        if ( BOs == null ) {
            return null;
        }

        List<RankDTO> list = new ArrayList<RankDTO>( BOs.size() );
        for ( Rank rank : BOs ) {
            list.add( toDTO( rank ) );
        }

        return list;
    }

    @Override
    public Set<RankDTO> toDTOs(Set<Rank> BOs) {
        if ( BOs == null ) {
            return null;
        }

        Set<RankDTO> set = new LinkedHashSet<RankDTO>( Math.max( (int) ( BOs.size() / .75f ) + 1, 16 ) );
        for ( Rank rank : BOs ) {
            set.add( toDTO( rank ) );
        }

        return set;
    }

    @Override
    public Rank fromDTO(RankDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Rank rank = new Rank();

        rank.setId( dto.getId() );
        rank.setName( dto.getName() );
        rank.setRequiredSeeds( dto.getRequiredSeeds() );
        if ( dto.getDiscount() != null ) {
            rank.setDiscount( dto.getDiscount().floatValue() );
        }

        return rank;
    }

    @Override
    public RankDTO toDTO(Rank ranks) {
        if ( ranks == null ) {
            return null;
        }

        RankDTO rankDTO = new RankDTO();

        rankDTO.setId( ranks.getId() );
        rankDTO.setName( ranks.getName() );
        rankDTO.setRequiredSeeds( ranks.getRequiredSeeds() );
        if ( ranks.getDiscount() != null ) {
            rankDTO.setDiscount( ranks.getDiscount().longValue() );
        }

        return rankDTO;
    }
}
