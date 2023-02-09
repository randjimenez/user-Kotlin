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
            addressEntity.longitude,
            addressEntity.latitude
        )
    }
}