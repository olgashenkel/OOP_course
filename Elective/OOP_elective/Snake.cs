using System;
using System.Collections.Generic;
using System.Linq;
using System.Net;
using System.Text;
using System.Threading.Tasks;

namespace OOP_elective
{
    class Snake : Figure
    {
        Direction direction;

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
    }
}
