using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace OOP_elective
{
    internal class MyPoint
    {
        public int x;
        public int y;
        public char sym;

        public MyPoint()
        {            
        }

        public MyPoint(int _x, int _y, char _sym)
        {
            x = _x;
            y = _y;
            sym = _sym;
        }

        public MyPoint(MyPoint p)
        {
            x = p.x; 
            y = p.y; 
            sym = p.sym;
        }

        public void Move(int offset, Direction direction)
        {
            if (direction == Direction.RIGHT) 
            { 
                x += offset;
            }
            else if (direction == Direction.LEFT)
            {
                x -= offset;
            }
            else if(direction == Direction.UP)
            {
                y += offset;
            }
            else if (direction == Direction.DOWN) 
            { 
                y -= offset; 
            }
        }

        public void Draw()
        {
            Console.SetCursorPosition(x, y);
            Console.Write(sym);
        }
        public override string ToString()
        {
            return x + ", " + y + ", " + sym;
        }

    }
}
