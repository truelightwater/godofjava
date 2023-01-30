package godofjavabook1.ch22;

import java.util.ArrayList;

public class ManageHeight {
    ArrayList<ArrayList<Integer>> gradeHeights = new ArrayList<>();
    public static void main(String[] args) {
        ManageHeight sample = new ManageHeight();
        sample.setData();

        for (int loop = 1; loop <= 5; loop++) {
            sample.printHeight(loop);
        }
        System.out.println();

        for (int loop = 1; loop <= 5; loop++) {
            sample.printAverage(loop);
        }


    }

    public void setData() {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(170);
        list1.add(180);
        list1.add(173);
        list1.add(175);
        list1.add(177);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(160);
        list2.add(165);
        list2.add(167);
        list2.add(186);

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(158);
        list3.add(177);
        list3.add(187);
        list3.add(176);

        ArrayList<Integer> list4 = new ArrayList<>();
        list4.add(173);
        list4.add(182);
        list4.add(181);

        ArrayList<Integer> list5 = new ArrayList<>();
        list5.add(170);
        list5.add(180);
        list5.add(165);
        list5.add(177);
        list5.add(172);

        gradeHeights.add(list1);
        gradeHeights.add(list2);
        gradeHeights.add(list3);
        gradeHeights.add(list4);
        gradeHeights.add(list5);

    }

    public void printHeight(int classNo) {
        ArrayList<Integer> classHeight = gradeHeights.get(classNo - 1);
        System.out.println("Class No. " + classNo);
        for (int data : classHeight) {
            System.out.println(data);
        }
    }

    public void printAverage(int classNo) {
        double averageHeight = 0.0;

        ArrayList<Integer> classHeight = gradeHeights.get(classNo - 1);
        System.out.println("Class No. " + classNo);

        int members = classHeight.size();
        for (int data : classHeight) {
            averageHeight += data;
        }
        averageHeight = averageHeight / members;
        System.out.println(averageHeight);

    }



}

