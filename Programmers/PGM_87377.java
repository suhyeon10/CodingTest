package Programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PGM_87377 {

    private static class Point{
        public final long x,y;

        private Point(long x, long y){
            this.x = x;
            this.y = y;
        }
    }

    private Point intersection(long a1, long a2, long b1, long b2, long c1, long c2){
        double x = (double)(b1*c2 - b2*c1) / (a1*b2 - a2*b1);
        double y = (double)(a2*c1 - a1*c2) / (a1*b2 - a2*b1);

        if (x%1 !=0 || y%1 != 0) return  null;

        return new Point( (long) x, (long) y);
    }

    private Point findMaximum(List<Point> points){

        long x = Long.MIN_VALUE;
        long y = Long.MIN_VALUE;

        for(Point point : points){
            if(point.x > x ) x = point.x;
            if(point.y > y ) y = point.y;
        }

        return new Point(x,y);
    }
    private Point findMinimum(List<Point> points){
        long x = Long.MAX_VALUE;
        long y = Long.MAX_VALUE;

        for(Point point : points){
            if(point.x < x ) x = point.x;
            if(point.y < y ) y = point.y;
        }

        return new Point(x,y);
    }


    public String[] solution(int[][] line) {
        String[] answer = {};

        // 1. 교점 구하기
        // 2. 교점 중에 정수(x,y) 구하기
        List<Point> pointList = new ArrayList<>();
        for(int i = 0; i<line.length; i++){

            for(int j = i+1; j<line.length; j++){


                Point p = intersection(
                        line[i][0], line[j][0],
                        line[i][1], line[j][1],
                        line[i][2], line[j][2]);

                if(p!= null) pointList.add(p);
            }
        }


        // 3. x,y의 최소,최대값구하기

        Point maxPoint = findMaximum(pointList);
        Point minPoint = findMinimum(pointList);
        int yIndex = (int) (maxPoint.y - minPoint.y + 1);
        int xIndex = (int) (maxPoint.x - minPoint.x + 1);
        // 3-1. 배열 생성

        // System.out.println(yIndex);
        // System.out.println(xIndex);

        char[][] arr = new char[yIndex][xIndex];
        // 4. 별그리기

        for(char[] a : arr){
            Arrays.fill(a, '.');
        }

        for(Point point : pointList){
            int x = (int) (point.x - minPoint.x);
            int y = (int) (maxPoint.y - point.y);
            arr[y][x] = '*';
        }

        // 5. String 배열로 변경하기
        String[] result = new String[arr.length];

        for(int i = 0; i< result.length; i++){
            result[i] = new String(arr[i]);
        }

        return result;
    }

}
