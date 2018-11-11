package com.epam;

import com.epam.controller.Controller;

/**
*This is the main class of the project
*
* @author  Serhii Prokopenko
*/

public class Main {
    public static void main(String[] args) {

        new Controller().run();

    }

}
//OUTPUT:
//        TEXT EDITOR MENU:
//        1. Read and show initial text from the TXT file.
//        2. Change the initial text according to the requirements of the task.
//        3. Save the result text to the new TXT file.
//        0. Exit
//
//        Choose a menu item (0-3): 1
//        SOURCE TEXT FROM THE FILE 'Source_Txt_File.txt':
//        Имена переменных
//        В многих языках программирования существуют идентификаторы
//        (имена переменных и т. п.), которые состоят только из алфавитно-
//        цифровых символов и знаков подчеркивания, но не могут начинаться
//        с цифры. На языке регулярных выражений эта формулировка записы-
//        вается в виде [a-zA-Z_][a-zA-Z_0-9]*. Первый класс определяет воз-
//        можные значения первого символа идентификатора, второй (вместе
//        с суффиксом *) определяет оставшуюся часть идентификатора. Если
//        длина идентификатора ограничивается, допустим, 32 символами,
//        звездочку можно заменить выражением {0,31}, если вашей програм-
//        мой поддерживается конструкция {minimum, maximum} (интервальный кванти-
//        фикатор кратко упоминается на стр. 45).
//
//        TEXT EDITOR MENU:
//        1. Read and show initial text from the TXT file.
//        2. Change the initial text according to the requirements of the task.
//        3. Save the result text to the new TXT file.
//        0. Exit
//
//        Choose a menu item (0-3): 2
//        THE RESULT TEXT AFTER TRANSFORMATION EVERY WORD IN THE TEXT,
//        REMOVING ALL SUBSEQUENT OCCURRENCES (PREVIOUS) OF FIRST (LAST) LETTER OF THIS WORD:
//
//        Имена переменных
//        В многих языках программирования сущевуют идентфкаторы
//        (имена переменных и т. п.), которые сооят тлько из алфвитно-
//        цифровых симолов и знаков подчеркивания, но не могут начиаться
//        с цифры. На языке регуляных выражений эта формулировка записы-
//        вается в виде [a-zA-Z_][a-zA-Z_0-9]*. Первый клас определяет воз-
//        можные значения первго символа идентфктора, второй (вмсте
//        с суффиком *) определяет оставшуюся часть идентфктора. Если
//        длина идентфктора ограничивается, допустим, 32 смволами,
//        зведочку мжно заменить выражением {0,31}, если вашей програм-
//        мой поддерживается конструция {iniu, axiu} (интервальный кванти-
//        фикатор крато упоминается на стр. 45).
//        TEXT EDITOR MENU:
//        1. Read and show initial text from the TXT file.
//        2. Change the initial text according to the requirements of the task.
//        3. Save the result text to the new TXT file.
//        0. Exit
//
//        Choose a menu item (0-3): 3
//        THE FILE 'Result_Txt_File.txt'  was created
//
//        TEXT EDITOR MENU:
//        1. Read and show initial text from the TXT file.
//        2. Change the initial text according to the requirements of the task.
//        3. Save the result text to the new TXT file.
//        0. Exit
//
//        Choose a menu item (0-3): й
//        Wrong input. Please try again. Choose a menu item (0-3): 0
//        Bye!