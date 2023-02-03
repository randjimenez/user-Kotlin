package client.userkt.controller

import client.userkt.data.dto.Client
import client.userkt.mapper.ClientMapper
import client.userkt.service.ClientService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@ControllerAdvice
class ClientController(private val clientService: ClientService,
    private val clientMapper: ClientMapper ) {

    @GetMapping("find")
    fun findUserByDni(@RequestParam dni: Long): ResponseEntity<Client> {
        return ResponseEntity.ok().body(clientMapper.toDto(clientService.findUser(dni)))
    }
}