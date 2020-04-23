public class Mario {
    private int size;

    public Mario() {
        this.size = 0;
    }

    public Mario(int size) {
        if (size >= 0 && size <=3) {
            this.size = size;
        } else {
            this.size = 0;
        }
    }

    public void display() {
        switch (this.size) {
            case 0: {
                System.out.println("small Mario");
                break;
            }
            case 1: {
                System.out.println("medium Mario");
                break;
            }
            case 2: {
                System.out.println("big Mario");
                break;
            }
            default: {
                System.out.println("");
            }
        }
    }

    public void attack() {
        if (this.size == 2) {
            System.out.println("shoot fireballs");
        } else {
            System.out.println("no attack");
        }
    }

    public void move() {
        //TODO Check for conditions and call corresponding function
        //walk()
        //run()
        //boosted run()
    }

    private void walk() {
        System.out.println("walk");
    }

    private void run() {
        System.out.println("run");
    }

    private void boostedRun() {
        System.out.println("boosted run");
    }

    public void jump() {
        //TODO Check for conditions and call corresponding function
        //shortJump()
        //longJump()
    }

    private void shortJump() {
        System.out.println("short jump");
    }

    private void longJump() {
        System.out.println("long jump");
    }

    private void getBigger() {
        if (this.size < 3) {
            this.size++;
        }
    }

    private void getSmaller() {
        if (this.size > 0) {
            this.size--;
        } else {
            die();
        }
    }

    private void die() {
        System.out.println("Mario is dead!");
    }

    public void eatMushroom() {
        getBigger();
    }

    public void touchEnemy() {
        getSmaller();
    }

}
