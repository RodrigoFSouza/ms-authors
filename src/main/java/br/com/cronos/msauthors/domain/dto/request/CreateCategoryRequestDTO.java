package br.com.cronos.msauthors.domain.dto.request;

import br.com.cronos.msauthors.domain.annotations.UniqueValue;
import br.com.cronos.msauthors.domain.entity.Category;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CreateCategoryRequestDTO {
    @NotEmpty(message = "'name' é obrigatório")
    @UniqueValue(domainClass = Category.class, fieldName = "name")
    private String name;
    private String description;
}
