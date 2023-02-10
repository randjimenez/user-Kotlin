package client.userkt.mapper

import client.userkt.data.dto.Address
import client.userkt.data.entity.AddressEntity
import org.springframework.stereotype.Component

@Component
class AddressMapper {
    fun toDto(addressEntity: AddressEntity): Address {
        return Address(
            addressEntity.id,
            addressEntity.address,
            addressEntity.city,
            addressEntity.longitude,
            addressEntity.latitude
        )
    }

    fun toEntity(address: Address, dni: Long): AddressEntity {
        return AddressEntity(
            address.id,
            address.address,
            address.city,
            address.longitude,
            address.latitude,
            dni
        )

    }
}