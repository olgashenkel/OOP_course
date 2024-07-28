using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace OOP_elective
{
    internal class Figure
    {
        protected List<MyPoint> pList;

        public void Draw()
        {
            foreach (MyPoint p in pList)
            {
                p.Draw();
            }
        }
    }
}
