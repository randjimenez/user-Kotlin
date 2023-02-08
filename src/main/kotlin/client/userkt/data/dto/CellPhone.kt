package client.userkt.data.dto

import java.util.Date


data class CellPhone(

    var id: Long = 0,
    var cellPhone: String,
    var enabled: Boolean,
    var principal: Boolean,
    var createAt: Date,
    var updateAt: Date


){
}


