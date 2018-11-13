package post.it;

import java.awt.*;

public class PostIt {
    Color backgroundColor;
    String text;
    Color textColor;

    PostIt (Color backgroundColor, String text, Color textColor){ //<--- Constructor method, don't need to write public next to it, because it's default is public
        this.backgroundColor = backgroundColor;
        this.text = text;
        this.textColor = textColor;
    }

    public void postit(){
        System.out.println(String.valueOf(backgroundColor) + " " + text + " " + String.valueOf(textColor));
    }
}
