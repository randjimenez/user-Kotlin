package client.userkt.annotations.validators

import client.userkt.annotations.CellphoneSize
import client.userkt.exceptions.CellPhoneSizeException
import jakarta.validation.ConstraintValidator
import jakarta.validation.ConstraintValidatorContext

class CellphoneSizeValidator : ConstraintValidator<CellphoneSize, List<Any>> {
    override fun isValid(list: List<Any>?, context: ConstraintValidatorContext?): Boolean {
        if (list != null) {
            return if (list.size <= 2) return true else throw CellPhoneSizeException()
        }
        return true;
    }
}