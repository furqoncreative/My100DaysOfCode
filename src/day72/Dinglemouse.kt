package day72

import java.util.*


class Dinglemouse : LinkedHashMap<String, String>() {
    fun setAge(age: Int): Dinglemouse {
        put("age", " I am $age.")
        return this
    }

    fun setSex(sex: Char): Dinglemouse {
        put("sex", if (sex == 'M') " I am male." else " I am female.")
        return this
    }

    fun setName(name: String): Dinglemouse {
        put("name", " My name is $name.")
        return this
    }

    fun hello() = "Hello." + java.lang.String.join("", values)
}