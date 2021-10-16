package PRO2_TipeDataNumber

fun main() {
    //DATA TYPE
    // secara garis besar tipe data number dibagi menjadi 2, yaitu integer dan floating point

    //INTEGER
    //BYTE = 8 BITS
    var age: Byte = 30
    println(age)
    //SHORT = 16 BITS
    var height: Int = 170
    //INTEGER = 32 BITS
    var distance: Short = 2000
    //LONG = 64 BITS
    var balance: Long = 100000000L //harus tambahin L

    //FLOATING POINT
    //FLOAT = 32 BITS (jaranf digunakan)
    var value: Float = 98.89F //(menggunakan titik, bukan koma) harus tambahin F
    println(value)
    //DOUBLE = 64 BITS
    var radius: Double = 123456.7890

    //LITERAL
    // Desimal (format default untuk angka),
    // Hexadesimal(depan harus menggunakan 0x),
    // Binary(depan harus menggunakan 0b)
    //
    var desimal: Int = 100
    var hexadesimal: Int = 0xFF
    var binary: Int= 0b001

    println(binary) //output nya dalam bentuk desimal

    //UNDERSCORE
    //Fitur yang ada dijava, digunakan untuk mempermudah membaca angka atau sebagai separator
    var uang: Long = 100_000_000_000L
    println(uang)


    //CONVERSION
    var number: Int= 100
    var number2: Int= 250
    //contoh
    var tobyte: Byte= number.toByte()
    tobyte = number2.toByte() //gak iso, bahaya nanti bisa number over flow, angkanya bisa muter
    var toshort: Short= number.toShort()
    toshort = number2.toShort() // iso, masih dalam range
    var toint: Int= number.toInt()
    var tolong: Long= number.toLong()
    var tofloat: Float= number.toFloat()
    var todouble: Double= number.toDouble()
}