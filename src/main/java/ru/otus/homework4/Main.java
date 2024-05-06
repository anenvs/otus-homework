package ru.otus.homework4;

public class Main {
    public static void main(String[] args) {
        //USER PART
        User[] users = {
                new User("Иван", "Джекичанов", "Иванович", 1986, "dzchan"),
                new User("Дмитрий", "Зевсов", "Петрович", 1972, "zevs"),
                new User("Ольга", "Дукалис", "Викторовна", 1957, "duka"),
                new User("Анна", "Пуджов", "Степановна", 2002, "pudge"),
                new User("Николай", "Поттеров", "Геннадиевич", 1997, "potter"),
                new User("Антон", "Арагорнов", "Витальевич", 2012, "ara"),
                new User("Яна", "Шакшука", "Владимировна", 2000, "shak"),
                new User("Виктор", "Дарквейдеров", "Иванович", 1963, "dark"),
                new User("Александр", "Сталоне", "Иванович", 1951, "stal"),
                new User("Михаил", "Таргаринов", "Иванович", 1980, "targ"),
                new User("Андрей", "Сильванов", "Иванович", 2007, "silv")
        };

        for (int i = 0; i < users.length; i++) {
            if((2024 - users[i].getBirthday()) >= 40 ) {
                users[i].userInfo();
            }
        }

        //BOX PART
        //создаем коробку
        Box box = new Box("Синяя", "Маленькая");
        box.printBoxInfo();

        //меняем цвет
        box.setColor("Зеленая");
        box.printBoxInfo();

        //помещаем в коробку предмет
        box.fillBox("Шаурма");

        //проверка невозможности положить, если есть что-то внутри, либо она закрыта

        box.setIsOpen(false);
        box.fillBox("Сухарики семга сыр");
        box.printBoxInfo();
        box.setIsOpen(true);

        //Выкидываем предмет
        box.cleanBox();
        box.printBoxInfo();

        //Проверка, что после очистки можем положить что-то еще
        box.fillBox("Читос");
        box.printBoxInfo();

    }
}
