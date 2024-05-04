package br.com.cronos.msauthors.api;

import br.com.cronos.msauthors.domain.dto.request.CreateCategoryRequestDTO;
import br.com.cronos.msauthors.domain.entity.Category;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/categorys")
public class CategoryController {

    @PersistenceContext
    private EntityManager entityManager;

    @PostMapping
    @Transactional
    public ResponseEntity<Category> create(@Valid @RequestBody CreateCategoryRequestDTO createCategoryRequest) {
        Category category = new Category(createCategoryRequest.getName(), createCategoryRequest.getDescription());
        entityManager.persist(category);
        return ResponseEntity.status(HttpStatus.CREATED).body(category);
    }

}
