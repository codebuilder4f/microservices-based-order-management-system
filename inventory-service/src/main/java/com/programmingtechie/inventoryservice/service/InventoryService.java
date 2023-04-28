package com.programmingtechie.inventoryservice.service;

import com.programmingtechie.inventoryservice.dto.InventoryResponse;
import com.programmingtechie.inventoryservice.repository.InventoryRepository;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class InventoryService {

    private final InventoryRepository inventoryRepository;

    @Transactional(readOnly = true)
    //@SneakyThrows
    public List<InventoryResponse> isInStock(List<String> skuCodes) {
        /*log.info("Wait started");
        Thread.sleep(10000);
        log.info("Wait ended");*/
        log.info("Inventory-service is processing , skuCodes - {}", skuCodes);
        return inventoryRepository.findBySkuCodeIn(skuCodes)
                .stream()
                .map(inventory -> // Map Inventory to InventoryResponse
                        InventoryResponse.builder()
                                .skuCode(inventory.getSkuCode())
                                .isInStock(inventory.getQuantity() > 0)
                                .build()).toList();
    }
}
