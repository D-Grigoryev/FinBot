//Задача: Сделать телеграмм бота, который будет предоставлять сведения о котировках на бирже,
//        курсе валют,осуществлять конвертацию валюты по текущему курсу
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Bot extends TelegramLongPollingBot {
    private String token = "5324971416:AAE37SWHLqh6AlFDp7oMd854iLbx8IEYlmM";
    ComandSevice comandSevice = new ComandSevice();

    @Override
    public String getBotUsername() {
        return "@FKMTestBot";
    }

    @Override
    public String getBotToken() {
        return token;
    }

    @Override
    public void onUpdateReceived(Update update) {

        Message message = update.getMessage();
            if (message.hasText()){
                try {
                    sendMesg(message,comandSevice.printInfo(message.getText()));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    public void sendMesg(Message message, String text){
        SendMessage sendMessage = new SendMessage();
        sendMessage.enableMarkdown(true);
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setReplyToMessageId(message.getMessageId());
        sendMessage.setText(text);
            try {
                setButtons(sendMessage);
                   execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
    }

    public void setButtons(SendMessage sendMessage){
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        replyKeyboardMarkup.setSelective(true);
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setOneTimeKeyboard(false);

        List<KeyboardRow> keyboardRowList = new ArrayList<>();

        KeyboardRow k1 = new KeyboardRow();
        KeyboardRow k2 = new KeyboardRow();


        k1.add(new KeyboardButton("/help"));
        k1.add(new KeyboardButton("/info"));

        k2.add(new KeyboardButton("/money"));

        keyboardRowList.add(k1);
        keyboardRowList.add(k2);

        replyKeyboardMarkup.setKeyboard(keyboardRowList);
    }

}
