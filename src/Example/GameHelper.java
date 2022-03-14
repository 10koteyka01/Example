package Example;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class GameHelper{
    //рисуем доску
    private static final String alphabet="abcdefg";
    private int gridLength=7;
    private int gridSize=49;
    private int [] grid =new int[gridSize];
    private int comCount=0;
    // обработка ошибок
    public String getUserInput(String prompt) {
        String inputLine=null;
        System.out.print(prompt+" ");
        try {
            BufferedReader is=new BufferedReader(new InputStreamReader(System.in));

            inputLine=is.readLine();
            if(inputLine.length()==0)
                return null;
        }catch (IOException e) {
            System.out.println("IOException:"+e);
        }
        return inputLine.toLowerCase();// становятся строчными буквами
    }

    public ArrayList<String> placeDotCom(int comSize){
        ArrayList<String> alphaCells=new ArrayList<String>();

        //координаты на доске
        String [] alphacoords=new String[comSize];
        String temp=null;
        //координаты сайта
        int [] coords =new int [comSize];
        //счетчик попыток
        int attempts=0;
        boolean success=false;
        int location=0;
        //следующий сайт
        comCount++;
        //выбор горизонтального положени¤
        int incr=1;
        //выбор вертикального положени¤
        if((comCount%2)==1) {
            incr=gridLength;
        }
//поиск
        while(!success&attempts++<200) {
            //старт в случайном месте
            location =(int)(Math.random()*gridSize);
            //позици¤ на сайте
            int x=0;
            success=true;
            //соседн¤¤ ¤чейка
            while(success&&x<comSize) {
                if(grid[location]==0) {
                    coords[x++]=location;
                    //следующа¤ соседн¤¤ ¤чейка
                    location+=incr;
                    //выход за рамки - снизу
                    if(location>=gridSize) {
                        success=false;
                    }
                    //выход за рамки - справа
                    if(x>0&&(location%gridLength==0)) {// Превышение правого края, ошибка
                        success=false;
                    }
                    //место уже используетс¤
                }else {
                    success=false;
                }
            }
        }
//перевод мместоположени¤ в символьные координаты
        int x=0;
        int row=0;
        int column=0;

        while (x<comSize) {
            //¤чейки отмечаютс¤ как использованные
            grid[coords[x]]=1;
            row=(int)(coords[x]/gridLength);// Получаем значение строки
            column=coords[x]%gridLength;// Получаем значение столбца
            temp=String.valueOf(alphabet.charAt(column));// преобразовать в строку

            alphaCells.add(temp.concat(Integer.toString(row)));
            x++;
        }
        return alphaCells;
    }
}