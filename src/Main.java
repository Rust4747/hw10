public class Main {
    public static void main(String[] args) {
        String phone = "7-905 509-99-66";
        phone = phone.replace("-", "");
        phone = phone.replace(" ", "");
        phone = phone.replace("+", "");
        if (phone.length() == 10) {
            phone = '7' + phone;
        } else if (phone.length()>11) {
            throw  new RuntimeException("телефон длинный");

        } else if (phone.length()<10) {
            throw new RuntimeException("короткий телефон");

        } else if (phone.length()==11 && phone.charAt(0) != '7') {
            throw new RuntimeException("посторонний номер");
            
        }
        System.out.println("phone = " + phone);
        String expPhone= "79055097966";
        if (phone.equals(expPhone)) {
            System.out.println("успех");
        } else {
            System.out.println("неудача");
        }
        System.out.println("Задание 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = "Ivanov Ivan Ivanovich";
        System.out.println(firstName+" "+middleName+" "+lastName);

        System.out.println("Задание 2");
        System.out.println(fullName.toUpperCase());

        System.out.println("Задание 3");
        String fullName1 = "Иванов Семён Семёнович";
        fullName1 = fullName1.replace("ё","е");
        System.out.println(fullName1);


    }

}