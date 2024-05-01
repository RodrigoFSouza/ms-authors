package br.com.cronos.msauthors.api;

import br.com.cronos.msauthors.domain.dto.request.CreateAuthorRequestDTO;
import br.com.cronos.msauthors.domain.dto.response.AuthorResponseDTO;
import br.com.cronos.msauthors.domain.entity.Author;
import br.com.cronos.msauthors.services.impl.AuthorService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/authors")
public class AuthorController {
    private final AuthorService authorService;
    @PostMapping
    public ResponseEntity<AuthorResponseDTO> create(@Valid @RequestBody CreateAuthorRequestDTO request) {
        AuthorResponseDTO author = authorService.create(request);
        return ResponseEntity.ok(author);
    }
}
