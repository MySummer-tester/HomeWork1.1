package com.company;

public class Main {

    public static void main(String[] args) {
	    Member member1 = new Member("Ivanov", 2,10);
        Member member2 = new Member("Petrov", 5,2);
        Member member3 = new Member("Sidorov", 4,9);
        Member member4 = new Member("Kovalev", 8,8);
        Member[] members = new Member[4];
        members[0] = member1;
        members[1] = member2;
        members[2] = member3;
        members[3] = member4;
        Team team = new Team("Ракета",members);
        System.out.println(team.getInfoTeam());

        Course course = new Course();
        course.doIt(team);
        team.showResult();
    }
}





// Разобраться с имеющимся кодом.
//2. Добавить класс Team, который будет содержать:
//название команды;
//массив из четырех участников — в конструкторе можно сразу всех участников указывать);
//метод для вывода информации о членах команды, прошедших дистанцию;
//метод вывода информации обо всех членах команды.


//3. Добавить класс Course (полоса препятствий), в котором будут находиться:
//массив препятствий;
//метод, который будет просить команду пройти всю полосу.
//В итоге должно получиться похожее:
//public static void main(String[] args) {
//Course c = new Course(...); // Создаем полосу препятствий
//Team team = new Team(...); // Создаем команду
//c.doIt(team); // Просим команду пройти полосу
//team.showResults(); // Показываем результаты