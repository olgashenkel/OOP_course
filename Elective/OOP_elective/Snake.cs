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
        public Snake(MyPoint tail, int lenght, Direction direction) 
        { 
            pList = new List<MyPoint>();

            for (int i = 0; i < lenght; i++)
            {
                MyPoint p = new MyPoint(tail);
                p.Move(i, direction);
                pList.Add(p);
            }
        }
    }
}
