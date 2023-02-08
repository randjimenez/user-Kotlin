package client.userkt.mapper

import client.userkt.data.dto.Client
import client.userkt.data.entity.ClientEntity
import client.userkt.data.enums.DniType
import org.springframework.stereotype.Component

@Component
class ClientMapper(){

    fun toDto(clientEntity: ClientEntity) : Client {
        return  Client(
            clientEntity.dniClient,
            clientEntity.name,
            clientEntity.lastName,
            DniType.valueOf(clientEntity.dniType),
            clientEntity.cellPhones
        )
    }
}