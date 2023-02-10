package client.userkt.exceptions

import client.userkt.exceptions.enums.FailedResponse
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler

@ControllerAdvice
class ExceptionHandlerErrors : ResponseEntityExceptionHandler() {

    @ExceptionHandler(value = [(NotClientException::class)])
    @ResponseStatus(HttpStatus.NOT_FOUND)
    fun handleNotClientException(): ResponseEntity<Any> {
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
            .body(MessageErrorResponse(FailedResponse.NOT_CLIENT.message))
    }

    @ExceptionHandler(value = [(UserAlreadyExistException::class)])
    @ResponseStatus(HttpStatus.CONFLICT)
    fun handleUserAlreadyExistException(): ResponseEntity<Any> {
        return ResponseEntity.status(HttpStatus.CONFLICT)
            .body(MessageErrorResponse(FailedResponse.USER_EXIST.message))
    }

    @ExceptionHandler(value = [(CellPhoneSizeException::class)])
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    fun cellPhoneListSizeException(): ResponseEntity<Any> {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
            .body(MessageErrorResponse(FailedResponse.PHONE_LIST_SIZE.message))
    }
}