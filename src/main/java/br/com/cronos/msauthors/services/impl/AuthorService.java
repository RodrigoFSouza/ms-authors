package br.com.cronos.msauthors.services.impl;

import br.com.cronos.msauthors.domain.dto.request.CreateAuthorRequestDTO;
import br.com.cronos.msauthors.domain.dto.response.AuthorResponseDTO;

public interface AuthorService {
    AuthorResponseDTO create(CreateAuthorRequestDTO createAuthorRequestDTO);
}
