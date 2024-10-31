// Функция для вычисления факториала
fun factorial(n: Int): Int {
    return if (n == 0 || n == 1) 1 else n * factorial(n - 1)
}

// Функция для вычисления суммы факториалов нечетных чисел
fun sumOfOddFactorials(start: Int, end: Int): Int {
    var sum = 0
    for (i in start..end) {
        if (i % 2 != 0) { // Проверяем, является ли число нечетным
            sum += factorial(i) // Добавляем факториал нечетного числа к сумме
        }
    }
    return sum
}

// Главная функция
fun main() {
    val result = sumOfOddFactorials(1, 9) // Вызываем функцию для вычисления суммы
    println("Сумма факториалов нечетных чисел от 1 до 9: $result")
}
