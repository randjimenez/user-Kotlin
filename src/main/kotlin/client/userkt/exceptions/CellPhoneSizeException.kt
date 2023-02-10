package client.userkt.exceptions

import client.userkt.exceptions.enums.FailedResponse

class CellPhoneSizeException(message: String = FailedResponse.PHONE_LIST_SIZE.message) : Exception(message) {
}