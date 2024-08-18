package com.frankmoley.lil.api.service;

import com.frankmoley.lil.api.data.entity.CustomerEntity;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.assertNull;

public class CustomerServicePrivateMethodTest {

    @Test
    void translateDbToWebWithNull() throws Exception {
        Method privateMethod = CustomerService.class.getDeclaredMethod("translateDbToWeb", CustomerEntity.class);
        privateMethod.setAccessible(true);

        assertNull(privateMethod.invoke(new CustomerService(null), new Object[]{null}));
    }

}
