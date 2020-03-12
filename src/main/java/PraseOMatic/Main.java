package PraseOMatic;

public class Main {

    public static void main(String[] args) {
        String [] wordListOne = {"toss","fool","summer","crew","serious","unlike","curve","seal","overcharge"};
        String [] wordListTwo = {"waist","drink","abnormal","castle","sweep","singer","pursuit","volunteer","possible"};
        String [] wordListThree = {"start","wonder","period","precision","embark","flesh","document","knot","tip","pile"};

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

        System.out.println("What we need is a " + phrase);
    }
}

