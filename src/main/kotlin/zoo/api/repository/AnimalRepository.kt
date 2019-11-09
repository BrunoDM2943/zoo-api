package zoo.api.repository

import zoo.api.domain.Animal
import javax.inject.Singleton

@Singleton
class AnimalRepository {

    companion object {
        var animals: MutableMap<Long, Animal> = LinkedHashMap()
        var incremeter:Long = 0
    }

    fun save(animal: Animal): Animal {
        animal.id = ++incremeter
        animals[animal.id] = animal
        return animal
    }

    fun list() = animals.values
}