package client.userkt.controller

import client.userkt.data.entity.ClientEntity
import client.userkt.service.ClientService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@ControllerAdvice
class ClientController(private val clientService: ClientService) {

    @GetMapping("find")
    fun findUserByDni(@RequestParam dni: Long): ResponseEntity<ClientEntity> {
        return ResponseEntity.ok().body(clientService.findUser(dni))
    }
}