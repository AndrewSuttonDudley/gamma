package com.crscreditapi.gamma.mapper;

import com.crscreditapi.gamma.config.MapStructConfig;
import com.crscreditapi.gamma.dto.CustomerDto;
import com.crscreditapi.gamma.model.Customer;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Service;

@Service
@Mapper(
        componentModel = "spring",
        config = MapStructConfig.class
)
public abstract class CustomerMapper extends AbstractMapper<Customer, CustomerDto> {
}
