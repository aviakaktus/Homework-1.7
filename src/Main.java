public class Main {
    public static void main(String[] args) {
        //Домашка 1.7 Строки
        //Задача 1
        String firstName = "Ivan";
        String midlleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + midlleName;
        System.out.println("ФИО сотрудника - "+fullName);

        //Задача 2
        String fullNameUp = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullNameUp);

        //Задача 3
        String fullName3 = "Иванов Семён Семёнович";
        String[] words = fullName3.split("ё");
        int wordsSize = words.length;

        System.out.print("Данные ФИО сотрудника — ");
        for (int i=0; i < (wordsSize-1); i++){
            System.out.print(words[i] + "е");
        }
        System.out.println(words[(wordsSize-1)]);

        //Задача 4
        String fullName4 = "Ivanov Ivan Ivanovich";
        int index1 = fullName4.indexOf(' ');
        int index2 = fullName4.indexOf(' ', (index1+1));
        String firstName4= fullName4.substring(index1+1,index2);
        System.out.println("Имя сотрудника — " + firstName4);
        String middleName4 = fullName4.substring(index2+1, (fullName4.length()) );
        System.out.println("Отчество сотрудника — " + middleName4);
        String lastName4=fullName4.substring(0,index1);
        System.out.println("Фамилия сотрудника — " + lastName4);

        //Задача 5
        String fullName5 = "ivanov ivan ivanovich";
        int index5_1 = fullName5.indexOf(' ');
        int index5_2 = fullName5.indexOf(' ', (index5_1+1));
        System.out.print("Верное написание Ф. И. О. сотрудника с заглавных букв —  ");
        String uplastName5=fullName5.substring(0,1); //создаем строку из первой буквы фамилии
        String up1 = uplastName5.toUpperCase(); //1 буква становится заглавной
        System.out.print(up1); // печатаем первую букву
        String lolastName5=fullName5.substring(1,index5_1); //создаем строку фамилии без первой буквы
        System.out.print(lolastName5+ " "); // печатаем фамилию без первой буквы

        String upFirstName5= fullName5.substring(index5_1+1,index5_1+2);
        String up2 = upFirstName5.toUpperCase();
        System.out.print(up2);
        String loFirstName5=fullName5.substring(index5_1+2,index5_2);
        System.out.print(loFirstName5+ " ");

        String upMiddleName5= fullName5.substring(index5_2+1,index5_2+2);
        String up3 = upMiddleName5.toUpperCase();
        System.out.print(up3);
        String loMiddleName5=fullName5.substring(index5_2+2,fullName5.length());
        System.out.println(loMiddleName5+ " ");

        //Задача 6
        String str6_1 = "135";
        String str6_2 = "246";
        char[] char1 = str6_1.toCharArray();
        char[] char2 = str6_2.toCharArray();
        StringBuilder sb = new StringBuilder();
        int strSize = str6_1.length();
        for (int i=0; i < strSize; i++ ){
            sb.append(char1[i]);
            sb.append(char2[i]);
        }
        System.out.print(sb);
    }
}