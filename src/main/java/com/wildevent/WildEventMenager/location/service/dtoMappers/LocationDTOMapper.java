package com.wildevent.WildEventMenager.location.service.dtoMappers;

import com.wildevent.WildEventMenager.location.model.Location;
import com.wildevent.WildEventMenager.location.model.dto.LocationDTO;
import com.wildevent.WildEventMenager.location.model.dto.LocationIdTitleDTO;
import org.springframework.stereotype.Service;

@Service
public interface LocationDTOMapper {

    LocationDTO getLocationDtoFromLocation(Location location);
    LocationIdTitleDTO getLocationIdTitleDTO(Location location);
}
