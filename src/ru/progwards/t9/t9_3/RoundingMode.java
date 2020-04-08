package ru.progwards.t9.t9_3;

//Способы округления BigDecimal
public enum RoundingMode {
    UP,   //UP - от нуля
    DOWN,  //DOWN - к нулю
    FLOOR,  //FLOOR - к меньшему числу
    HALF_UP,  //HALF_UP - от 5 в сторону от нуля
    HALF_DOWN, //HALF_DOWN - от 5 в сторону к нулю
    UNNERCESSARY,  //HALF_EVEN - от 5 к четной цифре
}
