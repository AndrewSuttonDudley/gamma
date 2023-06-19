package com.crscreditapi.gamma.repository;

import com.crscreditapi.gamma.model.Customer;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.repository.ListPagingAndSortingRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface AbstractRepository extends ListCrudRepository<Customer, Long>, ListPagingAndSortingRepository<Customer, Long> {
}
