package br.com.cronos.msauthors.domain.dto.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Builder;
import lombok.Getter;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.util.UUID;

@Builder
@Getter
public class AuthorResponseDTO {
    private UUID id;
    private String name;
    private String email;
    private String description;
    @JsonFormat(pattern="dd/MM/yyyy HH:mm:ss")
    @DateTimeFormat(pattern = "dd/MM/yyyy HH:mm:ss")
    private LocalDateTime createdAt;
}
