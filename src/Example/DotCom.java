package Example;

import java.util.ArrayList;

import static java.lang.String.format;

//переменные, ArrayList с именами сайта
public class DotCom {
    private ArrayList<String> locationCells;
    private String name;
    //задаетс¤ место сайта
    public void setLocationCells(ArrayList<String> loc) {
        locationCells=loc;
    }
    //задаетс¤ им¤ сайта
    public void setName(String n) {
        name=n;
    }
    //проверка совпаданий заданного места с указанным пользователем
    public String checkYourself(String userInput) {
        String result="Мимо";
        int index=locationCells.indexOf(userInput);// Если игрок угадает правильно, информация о местоположении будет возвращена
        //удаление найденного элемента
        if(index>=0) {
            locationCells.remove(index);
            //проверка, удалены ли все части "сайта"
            if(locationCells.isEmpty()) {
                result="Потопил";
                System.out.println(format("Мы потопили %s!", name));
            } else {
                result="Попал";
            }
        }
        return result;
    }
}