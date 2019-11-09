package zoo.api.controller

import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller("/ping")
class PingController {

    @Get(produces = [MediaType.TEXT_PLAIN])
    fun ping() = "pong"
}