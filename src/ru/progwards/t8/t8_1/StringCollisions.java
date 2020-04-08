package ru.progwards.t8.t8_1;

//Пример коллизии со строками в Java
public class StringCollisions {

    public static void main(String[] args) {

        String[] collisionStrings = {
                "pollinating sandboxes",
                "amusement & hemophilias",
                "schoolworks = perversive",
                "electrolysissweeteners.net",
                "Microcomputers: the unredeemed lollipop..."
        };
        for (String s : collisionStrings) {
            System.out.println(s.hashCode());
        }

        ////////////////////////////////////////////////////////////////////////////////
        String strArray[] = {"pollinating sandboxes", "amusement & hemophilias",
                "schoolworks = perversive",
                "electrolysissweeteners.net",
                "Microcomputers: the unredeemed lollipop..."};
        for (String str : strArray) {
            System.out.println(str + " " + str.hashCode());
        }

        String test = "pollinating sandboxes";
        System.out.println(test.hashCode());
    }
}
