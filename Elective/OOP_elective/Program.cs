﻿
using OOP_elective;
using System;
using System.Drawing;

class Program
{
    static void Main(string[] args)
    {

        Console.SetWindowSize(81, 27);
        Console.SetBufferSize(81, 27); // Console.SetBufferSize - функция задаёт размер окна, что позволяет убрать полосу прокрутки)
        
        // Отрисовка рамочки:
        HorizontalLine upLine = new HorizontalLine(0, 80, 0, '+');
        HorizontalLine downLine = new HorizontalLine(0, 80, 25, '+');
        VerticalLine leftLine = new VerticalLine(0, 25, 0, '+');
        VerticalLine rightLine = new VerticalLine(0, 25, 80, '+');
        upLine.Draw();
        downLine.Draw();
        leftLine.Draw();
        rightLine.Draw();


        // Отрисовка точек
        MyPoint p = new MyPoint(4, 5, '*');
        Snake snake = new Snake(p, 4, Direction.RIGHT);
        snake.Draw();
        snake.Move();
        Thread.Sleep(100); // задержка вывода следующего действия на определенное количество времени
        snake.Move();
        Thread.Sleep(100);
        snake.Move();
        Thread.Sleep(100);
        snake.Move();
        Thread.Sleep(100);
        snake.Move();
        Thread.Sleep(100);
        snake.Move();
        Thread.Sleep(100);
        snake.Move();
        Thread.Sleep(100);
        snake.Move();
        Thread.Sleep(100);
        snake.Move();
        Thread.Sleep(100);


        // Console.ReadLine();


    }
    
}

/* Урок 4. Конструкторы. Инкапсуляция.
 * Инкапсуляция - это свойство системы, позволяющая объединить данные и методы, работающие с ними в классе,
 * и скрыть все детали реализации от пользователя. Таким образом, пользователи класса MyPoint могут и вовсе
 * не знать, как он выглядить изнутри.
 */

/* Урок 5. Оперативная память: вид изнутри.
 * 
 * Стек (stack) — это способ организации данных в памяти компьютера. 
 * Он работает по принципу «последним пришёл, первым вышел» (last in first out, LIFO). 
 * Это значит, что последний элемент, добавленный в стек, будет взят из него первым.
 * 
 *  Куча - это область памяти, где данные могут быть размещены динамически во время выполнения 
 *  программы. В отличие от стека, где данные удаляются автоматически после выхода из функции, 
 *  данные в куче остаются, пока их явно не удалить.
 *  
 */

/* Урок 6. Осваиваем класс «Список»
 * 
 * //List<int> numList = new List<int>();
        //numList.Add(0);
        //numList.Add(1);
        //numList.Add(2);  

        //int x = numList[0];
        //int y = numList[1];
        //int z = numList[2];

        //foreach (int i in numList) // перебор элементов списка
        //{
        //    Console.WriteLine(i);   
        //}

        //numList.RemoveAt(0); // удаление элемента списка

        //List<MyPoint> pList = new List<MyPoint>();
        //pList.Add(p1);
        //pList.Add(p2);
*/

/* Урок 9. Класс «Змейка»
 * Абстракция в программировании – это как упрощение реального объекта до его ключевых характеристик.
 * Представь, что ты рисуешь домик: вместо деталей (кирпичи, окна) ты рисуешь просто квадрат и 
 * треугольник сверху. В коде это помогает сосредоточиться на важном, игнорируя мелочи.
 * 
 * Это решает проблему перегрузки информацией и сложности в коде. 
 * Когда ты работаешь только с тем, что действительно важно, код становится проще и чище. 
 * Это делает разработку быстрее и эффективнее, а также помогает легче понять, как работает программа.
 * Важно знать об абстракции, потому что это упрощает написание программ, 
 * делает их более безопасными и гибкими к изменениям. Это ключ к созданию мощного и 
 * легко поддерживаемого кода.
 * */