using System;
using System.Collections.Generic;
using System.Drawing;
using System.Linq;
using System.Net;
using System.Text;
using System.Threading.Tasks;

namespace OOP_elective
{
    class Snake : Figure
    {
        public Direction direction;

        public Snake(MyPoint tail, int lenght, Direction _direction) 
        {
            direction = _direction;
            pList = new List<MyPoint>();

            for (int i = 0; i < lenght; i++)
            {
                MyPoint p = new MyPoint(tail);
                p.Move(i, direction);
                pList.Add(p);
            }
        }

        internal void Move()
        {
            MyPoint tail = pList.First();
            pList.Remove(tail);
            MyPoint head = GetNextMyPoint();
            pList.Add(head);

            tail.Clear();
            head.Draw();
        }

        public MyPoint GetNextMyPoint()
        {
            MyPoint head = pList.Last();
            MyPoint nextMyPoint = new MyPoint(head);
            nextMyPoint.Move(1, direction);
            return nextMyPoint;
        }

        internal bool IsHitTail()
        {
            var head = pList.Last();
            for (int i = 0; i < pList.Count - 2; i++)
            {
                if (head.IsHit(pList[i]))
                    return true;
            }
            return false;
        }

        public void HandleKey(ConsoleKey key)
        {
            if (key == ConsoleKey.LeftArrow)
            {
                direction = Direction.LEFT;
            }
            else if (key == ConsoleKey.RightArrow)
            {
                direction = Direction.RIGHT;
            }
            else if (key == ConsoleKey.DownArrow)
            {
                direction = Direction.DOWN;
            }
            else if (key == ConsoleKey.UpArrow)
            {
                direction = Direction.UP;
            }
        }

        internal bool Eat(MyPoint food)
        {
            MyPoint head = GetNextMyPoint();
            if (head.IsHit(food))
            {
                food.sym = head.sym;
                pList.Add(food);
                return true;
            }
            else
                return false;
        }
    }
}
