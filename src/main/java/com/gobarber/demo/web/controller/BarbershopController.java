package com.gobarber.demo.web.controller;

import com.gobarber.demo.persistence.entity.BarberShopEntity;
import com.gobarber.demo.persistence.entity.Dto.BarberShopDto;
import com.gobarber.demo.persistence.entity.Dto.LocationStreetDto;
import com.gobarber.demo.persistence.entity.Dto.ServiceDto;
import com.gobarber.demo.persistence.entity.Dto.VistaBarberShopDto;
import com.gobarber.demo.persistence.entity.mapper.BarbershopMapper;
import com.gobarber.demo.persistence.entity.mapper.LocationStreetMapper;
import com.gobarber.demo.persistence.entity.mapper.ServiceMapper;
import com.gobarber.demo.persistence.entity.mapper.VistaBarbershopMapper;
import com.gobarber.demo.service.BarbershopService;
import com.gobarber.demo.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/gobarber/barbershops")
public class BarbershopController {

    private final BarbershopService barbershopService;
    private final BarbershopMapper barbershopMapper;
    private final LocationStreetMapper locationStreetMapper;
    private final LocationService locationService;
    private final ServiceMapper serviceMapper;
    private final VistaBarbershopMapper barbershopVistaMapper;

    @Autowired
    public BarbershopController(BarbershopService barbershopService, BarbershopMapper barbershopMapper, LocationStreetMapper locationStreetMapper, LocationService locationService, ServiceMapper serviceMapper, VistaBarbershopMapper barbershopVistaMapper) {
        this.barbershopService = barbershopService;
        this.barbershopMapper = barbershopMapper;
        this.locationStreetMapper = locationStreetMapper;
        this.locationService = locationService;
        this.serviceMapper = serviceMapper;
        this.barbershopVistaMapper = barbershopVistaMapper;
    }
    @GetMapping
    public ResponseEntity<List<BarberShopDto>> getAll(){
        List<BarberShopDto> barberShopDtos = null;
        barberShopDtos = this.barbershopService.getAll().stream()
                .map(barbershop -> this.barbershopMapper.barbershopEntityToBarbershopDto(barbershop))
                .collect(Collectors.toList());
        return  ResponseEntity.ok(barberShopDtos);
    }

    @GetMapping("/vista/{id}")
    public ResponseEntity<VistaBarberShopDto> getBarberShopInfo(@PathVariable int id) {
        BarberShopEntity barberShopEntity = this.barbershopService.getById(id);
        BarberShopDto barberShopDto = this.barbershopMapper.barbershopEntityToBarbershopDto(barberShopEntity);

        List<LocationStreetDto> locationStreetDtos = this.barbershopService.getStreetBarberShop(barberShopEntity.getIdBarberShop())
                .stream().map(location -> this.locationStreetMapper.locationEntityToLocationStreetDto(location))
                .collect(Collectors.toList());
        
        List<ServiceDto> serviceDtos = this.barbershopService.getBarbershopServices(barberShopEntity.getIdBarberShop())
                .stream().map(service -> this.serviceMapper.serviceEntityToServiceDto(service))
                .collect(Collectors.toList());

        VistaBarberShopDto barberShopInfoDto = this.barbershopVistaMapper.barbershopEntitytoVistaBarbershop(barberShopEntity);

        barberShopInfoDto.setBarberShopDto(barberShopDto);
        barberShopInfoDto.setLocationDto(locationStreetDtos);
        barberShopInfoDto.setServiceDto(serviceDtos);

        return ResponseEntity.ok(barberShopInfoDto);
    }

    /*

     List<BarberShopDto> barberShopDtos = null;
        barberShopDtos = this.barbershopService.getAll().stream()
                .map(barbershop -> this.barbershopMapper.barbershopEntityToBarbershopDto(barbershop))
                .collect(Collectors.toList());
        return  ResponseEntity.ok(barberShopDtos);


    barberShopInfoDto.setId(barberShop.getId());
    barberShopInfoDto.setName(barberShop.getName());
    barberShopInfoDto.setAddress(barberShop.getAddress());
    barberShopInfoDto.setLocation(locationEntityToLocationDto(barberShop.getLocation()));
    barberShopInfoDto.setServices(serviceEntityToServiceDto(barberShop.getServices()));
    */

    /*@GetMapping
    public ResponseEntity<List<BarberShopDto>> getAll(){
        List<BarberShopDto> barberShopDtos = null;
        barberShopDtos = this.barbershopService.getAll().stream()
                .map(barbershop -> this.barbershopMapper.barbershopEntityToBarbershopDto(barbershop))
                .collect(Collectors.toList());
        return  ResponseEntity.ok(barberShopDtos);
    }*/
    @GetMapping("/name/{id}")
    public ResponseEntity<String> name(@PathVariable int id){
        return ResponseEntity.ok(this.barbershopService.getName(id));
    }

    @GetMapping("/street/{idBarbershop}")
    public ResponseEntity<List<LocationStreetDto>> getStreetBarbershop(@PathVariable int idBarbershop) {
        List<LocationStreetDto> locations = this.barbershopService.getStreetBarberShop(idBarbershop)
                .stream().map(location -> this.locationStreetMapper.locationEntityToLocationStreetDto(location))
                .collect(Collectors.toList());
        return ResponseEntity.ok(locations);
    }
    @GetMapping("/services/{idBarbershop}")
    public ResponseEntity<List<ServiceDto>> getBarbershopServices (@PathVariable int idBarbershop){
        List<ServiceDto> servicesDto = this.barbershopService.getBarbershopServices(idBarbershop)
                .stream().map(service -> this.serviceMapper.serviceEntityToServiceDto(service))
                .collect(Collectors.toList());
        return ResponseEntity.ok(servicesDto);
    }

}
