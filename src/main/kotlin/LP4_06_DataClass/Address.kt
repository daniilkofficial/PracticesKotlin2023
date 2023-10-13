package LP4_06_DataClass

class Address(val nameCity: String, val street: String, val numHome: Int) {

    fun copy(nameCity: String = this.nameCity, street: String = this.street, numHome: Int = this.numHome): Address {
        return Address(nameCity, street, numHome)
    }

    operator fun component1() = nameCity
    operator fun component2() = street
    operator fun component3() = numHome



    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Address

        if (nameCity != other.nameCity) return false
        if (street != other.street) return false
        if (numHome != other.numHome) return false

        return true
    }

    override fun hashCode(): Int {
        var result = nameCity.hashCode()
        result = 31 * result + street.hashCode()
        result = 31 * result + numHome
        return result
    }

    override fun toString(): String {
        return "Address(nameCity='$nameCity', street='$street', numHome=$numHome)"
    }


}