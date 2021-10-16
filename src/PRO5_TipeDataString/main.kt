package PRO5_TipeDataString

fun main(){
    var firstname: String = "Hase"
    var lastname: String = "Bii"
    var hobby: String = """
        drawwing,
        coding,
        scarying,
        and else.
    """
    println(firstname)
    println(lastname)
    println(hobby)

    // mengubah format untuk string multiline
    // menghapus white space tanpa menggunakan tanda
    var hobby2: String = """ 
        drawwing,
        coding,
        scarying,
        and else.
    """.trimIndent()

    //berfungsi menghapus seluruh karakter di depan tanda pipe(|)
    var hobby3: String = """ 
        |drawwing,
        |coding,
        |scarying,
        |and else.
    """.trimMargin()

    //tanda untuk trim margin bisa diganti sesuai keinginan
    var hobby4: String = """ 
        #drawwing,
        #coding,
        #scarying,
        #and else.
    """.trimMargin("#")

    println("\ntrim indent = \n $hobby2")
    println("\ntrim margin = \n $hobby3")
    println("\ntrim margin dg prefix = \n $hobby4")

    println("MENGGABUNGKAN STRING")
    //cara biasa, tidak direkomendasikan di kotlin
    var fullname: String = firstname+" "+lastname
    println(fullname)

    //string template, gunakan $(namavariable)
    var fullname2: String = "$firstname $lastname"
    println(fullname2)

    // kompleks, gunakan ${}
    var fullname3: String = "$fullname2 length = ${fullname2.length}"


}