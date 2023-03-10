package client.userkt.controller

import client.userkt.data.dto.Client
import client.userkt.mapper.ClientMapper
import client.userkt.service.ClientService
import jakarta.validation.Valid
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class ClientController(private val clientService: ClientService,
    private val clientMapper: ClientMapper ) {

    @GetMapping("find/by/id")
    fun findUserByDni(@RequestParam dni: Long): ResponseEntity<Client> {
        return ResponseEntity.ok().body(clientMapper.toDto(clientService.findClient(dni)))
    }

    @PostMapping("create/")
    fun createUser(@Valid @RequestBody client: Client): ResponseEntity<Client> {
        return ResponseEntity.ok()
            .body(clientMapper.toDto(clientService.createClient(clientMapper.toEntity(client))))
    }

    @PutMapping("update/info/")
    fun updateUser(@Valid @RequestBody client: Client): ResponseEntity<Client> {
        return ResponseEntity.ok()
            .body(clientMapper.toDto(clientService.updateClient(clientMapper.toEntity(client))))
    }

    @DeleteMapping("delete/terminated/")
    fun deleteUser(@RequestParam dni: Long): ResponseEntity<Any> {
        clientService.deleteClient(dni)
        return ResponseEntity.ok().build()
    }
}