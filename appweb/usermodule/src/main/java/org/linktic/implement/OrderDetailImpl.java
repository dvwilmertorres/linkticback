package org.linktic.implement;

import org.linktic.services.OrderDetailService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailImpl implements OrderDetailService {
    @Override
    public ResponseEntity<String> crudOrder(String request) {
        return null;
    }

    @Override
    public ResponseEntity<String> findAllOrder() {
        return null;
    }
}
