public class Main {
    public static void main(String[] args) {

        int randomDirection = (int) (Math.random() * 3 + 1);
        int startX = (int) (Math.random() * 20 - 10);
        int startY = (int) (Math.random() * 20 - 10);
        int finishX = (int) (Math.random() * 20 - 10);
        int finishY = (int) (Math.random() * 20 - 10);

        Robot robot;
        switch (randomDirection) {
            case 1:
                robot = new Robot(startX, startY, Direction.DOWN);
                break;
            case 2:
                robot = new Robot(startX, startY, Direction.RIGHT);
                break;
            case 3:
                robot = new Robot(startX, startY, Direction.UP);
                break;
            case 4:
                robot = new Robot(startX, startY, Direction.LEFT);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + randomDirection);
        }
        moveRobot(robot, finishX, finishY);
    }

    public enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT
    }

    public static class Robot {
        private int x;
        private int y;
        private Direction dir;

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

        if (toY > robot.getY()) {
            do {
                robot.turnRight();
            } while (robot.getDirection() != Direction.UP);
            while (robot.getY() != toY) {
                robot.stepForward();
            }
        }

        if (toY < robot.getY()) {
            do {
                robot.turnLeft();
            } while (robot.getDirection() != Direction.DOWN);
            while (robot.getY() != toY) {
                robot.stepForward();
            }
        }

        if (toX > robot.getX()) {
            do {
                robot.turnLeft();
            } while (robot.getDirection() != Direction.RIGHT);
            while (robot.getX() != toX) {
                robot.stepForward();
            }
        }

        if (toX < robot.getX()) {
            do robot.turnLeft(); while (robot.getDirection() != Direction.LEFT);
            while (robot.getX() != toX) {
                robot.stepForward();
            }
        }
    }
}