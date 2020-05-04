package day24

class TrickyKotlin6<T>(val type: Class<T>) {
    inline fun <reified U> classOrSuperClassOf(a: () -> U) = type.isAssignableFrom(U::class.java)
}

inline fun <reified T> TrickyKotlin6() = TrickyKotlin6(T::class.java)