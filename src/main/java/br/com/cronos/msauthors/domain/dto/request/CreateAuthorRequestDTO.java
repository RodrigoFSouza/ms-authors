package br.com.cronos.msauthors.domain.dto.request;

import br.com.cronos.msauthors.domain.annotations.UniqueValue;
import br.com.cronos.msauthors.domain.entity.Author;
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
    @UniqueValue(domainClass =  Author.class, fieldName = "email")
    private String email;
    @NotNull
    @Length(min = 2, max = 400)
    private String description;
}
