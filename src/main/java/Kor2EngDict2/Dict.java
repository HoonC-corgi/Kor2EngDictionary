package Kor2EngDict2;

public class Dict {
    private static String kor [] = {"사랑", "아기", "돈", "미래", "희망"};
    private static String eng [] = {"love", "baby", "money", "future", "hope"};

    public static String kor2Eng(String word) {
       String errCode = word + "는 저의 사전에 없습니다.";

       for(int i=0; i<kor.length; i++) {
           if(word.equals(kor[i])) {
               return word + "은 " + eng[i];
           }
           else if(word.equals("그만")) {
               System.exit(0);
           }
       }
       return errCode;
    }
}
