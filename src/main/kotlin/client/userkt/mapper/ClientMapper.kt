package client.userkt.mapper

import client.userkt.data.dto.Client
import client.userkt.data.entity.ClientEntity
import org.springframework.stereotype.Component

@Component
class ClientMapper(){

    fun toDto(clientEntity: ClientEntity) : Client {
        return  Client(
            clientEntity.dni,
            clientEntity.name,
            clientEntity.lastName,
            clientEntity.dniType
        )
    }
}