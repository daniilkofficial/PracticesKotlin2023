package LP4_14_SingleTon_Object

object Database {
    //private constructor()
    val name = "main.db"
    val version = 1
    val data = mutableListOf<String>()
    fun insertData(str: String) {
        data.add(str)
    }

//    companion object {
//        var db: Database? = null
//        fun getInstance(): Database {
//            db?.let {
//                return it
//            }
//            val instance = Database()
//            db = instance
//            return instance
//        }
//    }
}