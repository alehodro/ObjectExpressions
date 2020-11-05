fun main() {
    //Создаем счетчик рабочих дней
    val counter = Counter()
    //Создаем объект измененного класса Person с помощью object expressions
    // Переопределяем функцию doWork, добавив вызов метода счетчика для учета рабочих дней
    val person = object:Person(){
        override fun doWork() {
            super.doWork()
            counter.count()
        }
    }
    // Создаем рабочий офис
    val office = Office()
    // Вызываем метод начала рабочего дня и передаем в него наш объект
    office.startWorkingDay(person)


    //Создадим объект из абстрактного класса
    val cabriolet = object: Car("Ferrari","Cabriolet"){
        fun openRooftop(){
            println("Rooftop is opened up")
        }
    }

    // Протестируем
    cabriolet.startEngine()
    cabriolet.openRooftop()

    val theDoor = object : Door("old door"),DoorInterface{

        override fun openDoor() {
            println("This old door is squeaking")
            println("Door is opened")
        }

        override fun closeDoor() {
            println("This old door is squeaking")
            println("Door is opened")
        }

        override fun lock() {
            println("Door is locked")
        }

        override fun unlock() {
            println("Door is unlocked")
        }

    }
}