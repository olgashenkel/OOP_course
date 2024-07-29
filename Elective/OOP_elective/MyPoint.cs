using System;
using System.Collections.Generic;
using System.Drawing;
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

        public MyPoint(int x, int y, char sym)
        {
            this.x = x;
            this.y = y;
            this.sym = sym;
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
                y -= offset;
            }
            else if (direction == Direction.DOWN) 
            { 
                y += offset; 
            }
        }


        public bool IsHit(MyPoint p)
        {
            return p.x == this.x && p.y == this.y;
        }


        public void Draw()
        {
            Console.SetCursorPosition(x, y);
            Console.Write(sym);
        }

        public void Clear()
        {
            sym = ' ';
            Draw();
        }

        public override string ToString()
        {
            return x + ", " + y + ", " + sym;
        }

    }
}
