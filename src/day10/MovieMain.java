package day10;

public class MovieMain {

    public static void main(String[] args) {
        MovieDTO movie1 = new MovieDTO();
        movie1.title = "검은수녀들";
        movie1.startDate = 20250105;
        movie1.actor = "송혜교";
        movie1.runningTime = "150분";
        movie1.grade = "15세이상";
        movie1.gener ="공포";

        MovieDTO movie2 = new MovieDTO();
        movie2.title = "히트맨2";
        movie2.startDate = 20250110;
        movie2.actor = "권상우";
        movie2.runningTime = "180분";
        movie2.grade = "15세이상";
        movie2.gener = "?";

        //검은수녀들

//        System.out.println(movie1.title);
//        System.out.println("배우 : " + movie1.actor);
//        System.out.print("장르 : " + movie1.gener + " ," + movie1.runningTime);
//        System.out.println("기본정보 : " + movie1.grade);
//        System.out.println("개봉정보 : " + movie1.startDate);

        //히트맨 2
//        System.out.println(movie2.title);
//        System.out.println("배우 : " + movie2.actor);
//        System.out.print("장르 : " + movie2.gener + " ," + movie2.runningTime);
//        System.out.println("기본정보 : " + movie2.grade);
//        System.out.println("개봉정보 : " + movie2.startDate);

        //영화정보를 출력할때 마다 반복적인 문장의 묶음, printMovie 메서드로 리팰토링 하세요!
        movie1.moviePrint(movie1);
        movie2.moviePrint(movie2);
        //영화정보를 입력받는 inputMovie 메서드 생성하세요
        InputMovieSc movieSc = new InputMovieSc();
        MovieDTO movie3 = new MovieDTO();
        MovieDTO movie4 = movieSc.inputObject(movie3);
        movie3.moviePrint(movie4);


    }


}
