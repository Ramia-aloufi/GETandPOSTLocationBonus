package com.example.getandpostlocationbonus

 class Names {
     var name :List<NamesItem>? = null

     data class NamesItem(
         var name: String? = null,
         var location: String? = null,
         var pk: Int? = null
     )
 }