package Example;

import java.util.*;

public class DotComBust {
    //объявление переменных
    private GameHelper helper=new GameHelper();
    private ArrayList<DotCom> dotComsList=new ArrayList<DotCom>();
    private int numOfGuesses=0;

    private void setUpGame() {
        // объекты в ArrayList
        DotCom one=new DotCom();
        one.setName("Pets.com");
        DotCom two=new DotCom();
        two.setName("eToys.com");
        DotCom three=new DotCom();
        three.setName("Go2.com");
        dotComsList.add(one);
        dotComsList.add(two);
        dotComsList.add(three);
//информация для игрока
        System.out.println("Ваша цель - потопить три сайта.");
        System.out.println("Pets.com,eToys.com,Go2.com");
        System.out.println("Попытайтесь потопить их за минимальное количество ходов");
// перебор объектов
        for(DotCom dotComToSet:dotComsList) {
            //какой сайт нашли
            ArrayList<String> newLocation=helper.placeDotCom(3);//
            //где он находится
            dotComToSet.setLocationCells(newLocation);// Вызов метода установки этого DotCom, чтобы присвоить только что полученную позицию
        }
    }

    private void startPlaying() {
        //проверка, остались ли еще объекты
        while(!dotComsList.isEmpty()) {
            //ход игрока
            String userGuess=helper.getUserInput("Сделайте ход");
            //проверка попадания
            checkUserGuess(userGuess);
        }
        finishGame();
    }

    private void checkUserGuess(String userGuess) {
        //подсчет попыток
        numOfGuesses++;
        //результат по умолчанию
        String result="Мимо";
        //перебор объектов
        for(DotCom dotComToTest:dotComsList) {
            //проверка попадания
            result=dotComToTest.checkYourself(userGuess);
            if(result.equals("Попал")) {
                break;
            }
            //если потопил - из массива удаляются лишние клетки
            if(result.equals("Потопил")) {
                dotComsList.remove(dotComToTest);
                break;
            }
        }
        //вывод результата
        System.out.println(result);
    }
    // информация о результатах игры
    private void finishGame() {
        System.out.println("Все сайты ушли ко дну!");
        if(numOfGuesses<=18) {
            System.out.println("Это заняло у вас всего" + numOfGuesses + "попыток");

        }else {
            System.out.println("Это заняло у вас много времени - " + numOfGuesses + "попыток");

        }
    }


    public static void main(String[] args) {
        DotComBust game=new DotComBust();
        game.setUpGame();
        game.startPlaying();
    }
}