package com.rafael.pubication.mapper;

import com.rafael.pubication.controller.PublicationRequest;
import com.rafael.pubication.domain.Publication;
import com.rafael.pubication.repository.entity.PublicationEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PublicationMapper {

    PublicationEntity toPublicationEntity(Publication publication);

    Publication toPublication(PublicationEntity publicationEntity);

    Publication toPublication(PublicationRequest publicationRequest);
}
