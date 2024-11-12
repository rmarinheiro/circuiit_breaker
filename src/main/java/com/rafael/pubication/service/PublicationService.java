package com.rafael.pubication.service;

import com.rafael.pubication.client.CommentClient;
import com.rafael.pubication.domain.Publication;
import com.rafael.pubication.mapper.PublicationMapper;
import com.rafael.pubication.repository.PublicationRepository;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublicationService {
    @Autowired
    private PublicationRepository publicationRepository;

    @Autowired
    private PublicationMapper publicationMapper;

    @Autowired
    private CommentClient commentClient;

    public void insert(Publication publication) {
        var publicationEntity = publicationMapper.toPublicationEntity(publication);
        publicationRepository.save(publicationEntity);
    }

    public List<Publication> findAll(){
        var publications = publicationRepository.findAll();
        return publications.stream().map(publicationMapper:: toPublication).toList();
    }
    @CircuitBreaker(name= "comments")
    public Publication findById(String id){
        var publication = publicationRepository.findById(id)
                .map(publicationMapper::toPublication)
                .orElseThrow(RuntimeException::new);

        var comments = commentClient.getComments(id);
        publication.setComments (comments);
        return publication;
    }
}
