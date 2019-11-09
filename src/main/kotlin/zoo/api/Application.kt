package zoo.api

import io.micronaut.runtime.Micronaut

object Application {

    @JvmStatic
    fun main(args: Array<String>) {
        Micronaut.build()
                .packages("zoo.api.*")
                .mainClass(Application.javaClass)
                .start()
    }
}