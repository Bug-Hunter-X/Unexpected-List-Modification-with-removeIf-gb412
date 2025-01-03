```kotlin
fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    val evenNumbers = mutableListOf<Int>()
    list.forEach { 
if(it % 2 == 0) {
        evenNumbers.add(it)
    }
}
    list.removeAll(evenNumbers)
    println(list)
}
```