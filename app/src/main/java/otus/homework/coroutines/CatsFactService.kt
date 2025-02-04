package otus.homework.coroutines

import otus.homework.coroutines.models.CatFact
import retrofit2.Response
import retrofit2.http.GET

interface CatsFactService {

    @GET("fact")
    suspend fun getCatFact() : Response<CatFact>
}