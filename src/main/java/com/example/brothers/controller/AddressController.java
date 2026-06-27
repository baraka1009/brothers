package com.example.brothers.Controller;

import com.example.brothers.Entity.Address;
import com.example.brothers.Service.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/addresses")
@RequiredArgsConstructor
public class AddressController {

    private final AddressService addressService;

    @PostMapping
    public Address addAddress(@RequestBody Address address) {
        return addressService.addAddress(address);
    }

    @GetMapping
    public List<Address> getAllAddresses() {
        return addressService.getAllAddresses();
    }
}