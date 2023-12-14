fun main() {
    println("1 - это камень, 2 - ножницы, 3 - бумага")
    try {
        do {
            var a: Int
            do {
                println("\nВведите 1, 2 или 3")
                a = choiceUser()
            } while ((a > 3)||(a < 1))

            val b = choiceComputer()
            val result = startPlay(a, b)
            println(result)
        } while (result == "Победила ничья, продолжим")
    }
    catch (e: Exception) {
        println("Ошибка! Неправильно введён тип данных!")
    }
}

// Функция для выбора человека и вывода результата на экран.
private fun choiceUser(): Int {
    val user = readln().toInt()
    println("Ваш выбор - $user")
    return user
}

// Функция для выбора компьютера и вывода результата на экран.
private fun choiceComputer(): Int {
    val computer = (1..3).random()
    println("Выбор компьютера - $computer")
    return computer
}

// Функция, сравнивающая результаты игроков и показывающая победителя.
private fun startPlay(choice_user: Int, choice_computer: Int): String {
    var  result = ""

    if (((choice_user == 1) && (choice_computer == 1)) || ((choice_user == 2) && (choice_computer == 2)) || ((choice_user  == 3) && (choice_computer == 3)))
        result = "Победила ничья, продолжим"
    else
        if (((choice_user == 1) && (choice_computer == 2)) || ((choice_user == 2) && (choice_computer == 3)) || ((choice_user == 3) && (choice_computer == 1)))
            result = "Вы победили"
        else
            if (((choice_user == 2) && (choice_computer == 1)) || ((choice_user == 3) && (choice_computer == 2)) || ((choice_user == 1) && (choice_computer == 3)))
                result = "Компьютер победил"
    return result
}