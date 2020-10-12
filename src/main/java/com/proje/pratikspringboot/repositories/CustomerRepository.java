package com.proje.pratikspringboot.repositories;

import com.proje.pratikspringboot.domain.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository  extends CrudRepository<Customer,Long>
{

}
