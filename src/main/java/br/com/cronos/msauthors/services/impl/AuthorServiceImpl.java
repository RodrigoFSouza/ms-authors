package br.com.cronos.msauthors.services.impl;

import br.com.cronos.msauthors.domain.dto.request.CreateAuthorRequestDTO;
import br.com.cronos.msauthors.domain.dto.response.AuthorResponseDTO;
import br.com.cronos.msauthors.domain.entity.Author;
import br.com.cronos.msauthors.repository.AuthorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthorServiceImpl implements AuthorService {
    private final AuthorRepository authorRepository;
    @Override
    public AuthorResponseDTO create(final CreateAuthorRequestDTO createAuthorRequestDTO) {
        final Author author = Author.builder()
                .name(createAuthorRequestDTO.getName())
                .email(createAuthorRequestDTO.getEmail())
                .description(createAuthorRequestDTO.getDescription())
                .build();

        final Author authorSaved = authorRepository.save(author);
        return AuthorResponseDTO.builder()
                .id(authorSaved.getId())
                .name(authorSaved.getName())
                .email(authorSaved.getEmail())
                .description(authorSaved.getDescription())
                .createdAt(authorSaved.getCreatedAt())
                .build();
    }
}
