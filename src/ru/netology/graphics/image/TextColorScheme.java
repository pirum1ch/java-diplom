package ru.netology.graphics.image;

public class TextColorScheme implements TextColorSchema{

    char [] chars  = {'▇', '●', '◉', '◍', '◎', '○', '☉', '◌', '-'};

    @Override
    public char convert(int color) {
        char returnValue = chars[0];

        if(color>=30&& color<60){
            returnValue = chars[1];
        }
        else if(color>=60&& color<90){
            returnValue = chars[2];
        }
        else if(color>=90&& color<110){
            returnValue = chars[3];
        }
        else if(color>=110&& color<140){
            returnValue = chars[4];
        }
        else if(color>=140&& color<170){
            returnValue = chars[5];
        }
        else if(color>=170&& color<200){
            returnValue = chars[6];
        }
        else if(color>=200&& color<220){
            returnValue = chars[7];
        }
        else if(color>=220){
            returnValue = chars[8];
        }
        return returnValue;
    }

}
