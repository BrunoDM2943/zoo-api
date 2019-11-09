package zoo.api.service

import zoo.api.domain.Animal
import zoo.api.repository.AnimalRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AnimalService(@Inject
                    val repository: AnimalRepository) {
    fun saveAnimal(animal:Animal) = repository.save(animal)
    fun list() = repository.list()
}