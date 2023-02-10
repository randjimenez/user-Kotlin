package client.userkt.annotations

import client.userkt.annotations.validators.CellphoneSizeValidator
import jakarta.validation.Constraint
import jakarta.validation.Payload
import kotlin.reflect.KClass

@Target(AnnotationTarget.FIELD)
@Constraint(validatedBy = [CellphoneSizeValidator::class])
annotation class CellphoneSize(
    val message: String = "No se puede tener mas de dos celulares asociados",
    val groups: Array<KClass<Any>> = [],
    val payload: Array<KClass<Payload>> = [],
) {
}
