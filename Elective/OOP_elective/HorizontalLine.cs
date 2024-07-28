using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace OOP_elective
{
    internal class HorizontalLine : Figure
    {
        
        public HorizontalLine(int xLeft, int xRight, int y, char sym)
        {
            pList = new List<MyPoint>();
            for (int x = xLeft; x <= xRight; x++)
            {
                MyPoint p = new MyPoint(x, y, sym);
                pList.Add(p);
            }

        }
                

    }
}
