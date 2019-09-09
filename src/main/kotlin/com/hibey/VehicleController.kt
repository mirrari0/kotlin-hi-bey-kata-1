package com.hibey

import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/search")
class VehicleController {

    @CrossOrigin
    @GetMapping("/all")
    fun getVehicles(): Array<Vehicle> {
        return arrayOf(
            Vehicle(
                make = "Honda",
                model = "Civic",
                year = "2016",
                body = "Si",
                drive = "FWD",
                transmission = "Manual",
                doorCount = "2",
                manufacturerLocation = "Japan",
                fuelType = "Regular Unleaded",
                numberProduced = "282828"
            )
        )
    }

//    @CrossOrigin
//    @GetMapping("/checkDb")
//    fun checkDb(): List<Vehicle>{
//        return vehicleRepository.findAll().map {
//            Vehicle(
//                it.make,
//                it.model,
//                it.modelYear,
//                it.modelBody,
//                it.modelDrive,
//                it.modelTransmissionType,
//                it.modelDoors,
//                it.makeCountry,
//                it.engineFuelType,
//                it.count
//            )
//        }
//
//    }
}