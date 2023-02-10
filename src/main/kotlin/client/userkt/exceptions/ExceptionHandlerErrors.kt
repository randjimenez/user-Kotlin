package client.userkt.exceptions

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler

@ControllerAdvice
class ExceptionHandlerErrors : ResponseEntityExceptionHandler() {

    @ExceptionHandler(value = [(NotClientException::class)])
    fun handleNotClientException(): ResponseEntity.HeadersBuilder<*> {
        return ResponseEntity.notFound()
    }

    @ExceptionHandler(value = [(UserAlreadyExistException::class)])
    fun handleUserAlreadyExistException(): ResponseEntity.HeadersBuilder<*> {
        return ResponseEntity.status(HttpStatus.CONFLICT)
    }
}