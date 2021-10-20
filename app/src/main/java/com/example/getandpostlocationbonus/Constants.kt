package com.example.getandpostlocationbonus



object Constants {
     const val url =  "https://dojo-recipes.herokuapp.com"
    val apiInterface = APIClient().getClient()?.create(APIInterface::class.java)

}

