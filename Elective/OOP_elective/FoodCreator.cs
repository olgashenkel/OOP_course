using System.Drawing;

namespace OOP_elective
{
    class FoodCreator
    {
        int mapWidht;
        int mapHeight;
        char sym;

        Random random = new Random();

        public FoodCreator(int mapWidth, int mapHeight, char sym)
        {
            this.mapWidht = mapWidth;
            this.mapHeight = mapHeight;
            this.sym = sym;
        }

        public MyPoint CreateFood()
        {
            int x = random.Next(2, mapWidht - 2);
            int y = random.Next(2, mapHeight - 2);
            return new MyPoint(x, y, sym);
        }
    }
}