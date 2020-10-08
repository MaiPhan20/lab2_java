package ss1;

public class ss1_1_5 {
    enum Direction{
        East,West,North,South
    }

    public static void main(String[] args) {
        Direction direction;
        direction=Direction.East;
        direction=Direction.West;
        direction=Direction.North;
        direction=Direction.South;

        System.out.println("Value:"+direction);
    }
}
