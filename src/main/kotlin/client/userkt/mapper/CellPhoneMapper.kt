package client.userkt.mapper

import client.userkt.data.dto.CellPhone
import client.userkt.data.entity.CellPhoneEntity
import org.springframework.stereotype.Component

@Component
class CellPhoneMapper {

    fun toDto(cellPhoneEntity: CellPhoneEntity): CellPhone {
        return CellPhone(
            cellPhoneEntity.id,
            cellPhoneEntity.cellPhone,
            cellPhoneEntity.principal
        )
    }
}