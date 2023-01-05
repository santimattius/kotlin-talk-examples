@file:JvmName("TypeUtils")
package interoperability.extra


inline fun <reified T> getTypeName(): String {
    return T::class.java.typeName
}