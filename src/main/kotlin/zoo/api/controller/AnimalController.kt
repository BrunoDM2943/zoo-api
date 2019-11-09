package zoo.api.controller

import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Post
import zoo.api.domain.Animal
import zoo.api.service.AnimalService
import javax.inject.Inject

@Controller("/animal")
class AnimalController(@Inject val animalService: AnimalService) {

    @Post
    fun save(@Body animal: Animal) = animalService.saveAnimal(animal)

    @Get
    fun get() = animalService.list()

}