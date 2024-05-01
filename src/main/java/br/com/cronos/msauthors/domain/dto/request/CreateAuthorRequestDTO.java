package br.com.cronos.msauthors.domain.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

@Getter
@Setter
public class CreateAuthorRequestDTO {
    @NotNull
    private String name;
    @NotNull
    @Email
    private String email;
    @NotNull
    @Length(min = 2, max = 400)
    private String description;
}
