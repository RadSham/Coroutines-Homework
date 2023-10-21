package otus.homework.coroutines

import otus.homework.coroutines.models.CatPic
import retrofit2.Response
import retrofit2.http.GET

interface CatsPicService {
    @GET("search")
    suspend fun getCatPic() : Response<ArrayList<CatPic>>
}