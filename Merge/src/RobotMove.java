import java.math.*;
import java.util.Arrays;

public class RobotMove {
    public static void main(String[] args) {
        Robot robot = new Robot(0, 0, Direction.DOWN);
        moveRobot(robot, 1000, 1);
    }

    public enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT
    }

    public static class Robot {
        int x;
        int y;
        Direction dir;

        public Robot(int x, int y, Direction dir) {
            this.x = x;
            this.y = y;
            this.dir = dir;
        }

        public Direction getDirection() {
            return dir;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public void turnLeft() {
            if (dir == Direction.UP) {
                dir = Direction.LEFT;
            } else if (dir == Direction.DOWN) {
                dir = Direction.RIGHT;
            } else if (dir == Direction.LEFT) {
                dir = Direction.DOWN;
            } else if (dir == Direction.RIGHT) {
                dir = Direction.UP;
            }
        }

        public void turnRight() {
            if (dir == Direction.UP) {
                dir = Direction.RIGHT;
            } else if (dir == Direction.DOWN) {
                dir = Direction.LEFT;
            } else if (dir == Direction.LEFT) {
                dir = Direction.UP;
            } else if (dir == Direction.RIGHT) {
                dir = Direction.DOWN;
            }
        }

        public void stepForward() {
            if (dir == Direction.UP) {
                y++;
            }
            if (dir == Direction.DOWN) {
                y--;
            }
            if (dir == Direction.LEFT) {
                x--;
            }
            if (dir == Direction.RIGHT) {
                x++;
            }
        }
    }

    public static void moveRobot(Robot robot, int toX, int toY) {
        int a = robot.getX();
        int b = robot.getY();

        if (a < toX) {
            while (robot.getDirection() != Direction.RIGHT) {
                               robot.turnRight();
            }

            for (int i = a; i < toX; i++) {
                robot.stepForward();
            }


        }
        if (a > toX) {
            while (robot.getDirection() != Direction.LEFT) {
                               robot.turnLeft();
            }
            for (int k = a; k > toX; k--) {
                robot.stepForward();
            }

        }
        if (b < toY) {
            while (robot.getDirection() != Direction.UP) {
                robot.turnRight();
            }
            for (int n = b; n < toY; n++) {
                robot.stepForward();
            }
        }
        if (b > toY) {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnRight();
            }
            for (int m = b; m > toY; m--) {
                robot.stepForward();
            }
        }
        // System.out.println("Заданные координаты: " + toX + " " + toY);
        //System.out.println("Приехал в точку: " + robot.getX() + " " + robot.getY());
    }
}
