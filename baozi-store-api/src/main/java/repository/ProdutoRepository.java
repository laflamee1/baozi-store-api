package com.baozistore.baozi_store_api.repository;

import com.baozistore.baozi_store_api.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}