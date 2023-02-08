package client.userkt.mapper

import client.userkt.data.dto.CellPhones
import client.userkt.data.entity.CellPhoneEntity
import org.springframework.stereotype.Component

@Component
class CellPhoneMapper {

    fun toDto(cellPhoneEntity: CellPhoneEntity): CellPhones {
        return CellPhones(
            cellPhoneEntity.id,
            cellPhoneEntity.cellPhone,
            cellPhoneEntity.principal
        )
    }
}