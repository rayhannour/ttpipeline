package org.smgs.smgsservice.mappers;

import javax.annotation.processing.Generated;
import org.smgs.smgsservice.dto.BornRequestDTO;
import org.smgs.smgsservice.dto.BornResponseDTO;
import org.smgs.smgsservice.entities.Born;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-10-07T10:45:00+0200",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.13 (Oracle Corporation)"
)
@Component
public class BornMapperImpl implements BornMapper {

    @Override
    public BornResponseDTO bornToBornResponseDTO(Born born) {
        if ( born == null ) {
            return null;
        }

        BornResponseDTO bornResponseDTO = new BornResponseDTO();

        bornResponseDTO.setFullName( born.getFullName() );
        bornResponseDTO.setIp( born.getIp() );
        bornResponseDTO.setMacAdr( born.getMacAdr() );
        bornResponseDTO.setTcodgou( born.getTcodgou() );
        bornResponseDTO.setTcodpr( born.getTcodpr() );
        bornResponseDTO.setAlias( born.getAlias() );

        return bornResponseDTO;
    }

    @Override
    public Born bornRequestDTOToBorn(BornRequestDTO bornRequestDTO) {
        if ( bornRequestDTO == null ) {
            return null;
        }

        Born born = new Born();

        born.setFullName( bornRequestDTO.getFullName() );
        born.setIp( bornRequestDTO.getIp() );
        born.setMacAdr( bornRequestDTO.getMacAdr() );
        born.setTcodgou( bornRequestDTO.getTcodgou() );
        born.setTcodpr( bornRequestDTO.getTcodpr() );
        born.setAlias( bornRequestDTO.getAlias() );

        return born;
    }
}
