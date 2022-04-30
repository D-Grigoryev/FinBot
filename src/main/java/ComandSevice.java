import java.io.IOException;


public class ComandSevice {
    Object info = "неверная команда";
    Jsontest jsontest = new Jsontest();
    public String printInfo(String text) throws IOException {
        if (text.startsWith("/")) {
            switch (text) {
                case "/help":
                    info = "Чем Вам помочь?";
                    break;
                case "/info":
                    info = "Я бот, который может показывать курсы валют, но скоро я буду уметь больше";
                    break;
                case "/money":
                    jsontest.parser();
                    info =  "Дата: "+jsontest.date+"\n"
                            +"Валюта: "+jsontest.name+"\n"
                            +"Стоимость: " +jsontest.value+" руб.";
                    System.out.println(info);
                    break;
            }
        }else {
            info = "Вы не ввели команду, команда должна начинаться с символа /";
        }
        return (String) info;
    }
}
