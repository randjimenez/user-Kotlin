package client.userkt.mapper

import client.userkt.data.dto.Client
import client.userkt.data.entity.ClientEntity
import client.userkt.data.enums.DniType
import java.util.Date
import org.springframework.stereotype.Component

@Component
class ClientMapper(
    private val cellPhoneMapper: CellPhoneMapper,
    private val addressMapper: AddressMapper
) {

    fun toDto(clientEntity: ClientEntity): Client {
        return Client(
            clientEntity.dniClient,
            clientEntity.name,
            clientEntity.middleName,
            clientEntity.lastName,
            clientEntity.secondLastName,
            DniType.valueOf(clientEntity.dniType),
            clientEntity.cellPhones?.map { cellPhoneEntity -> cellPhoneMapper.toDto(cellPhoneEntity) }?.toList(),
            clientEntity.address?.map { addressEntity -> addressMapper.toDto(addressEntity) }?.toList()
        )
    }

    fun toEntity(client: Client): ClientEntity {
        return ClientEntity(
            client.dni,
            client.name,
            client.middleName,
            client.lastName,
            client.secondLastName,
            client.dniType.toString(),
            Date(),
            client.cellPhones?.map { cellPhone -> cellPhoneMapper.toEntity(cellPhone, client.dni) }?.toList(),
            client.address?.map { address -> addressMapper.toEntity(address, client.dni) }?.toList()
        )

    }
}