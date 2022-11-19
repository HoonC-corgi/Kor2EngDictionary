package Kor2EngDict;

public class Dict {
    private static String kor [] = {"사랑", "아기", "돈", "미래", "희망"};
    private static String eng [] = {"love", "baby", "money", "future", "hope"};

    public static String kor2Eng(String word) {
        String errCode = word + "는 저의 사전에 없습니다.";

        switch(word) {
            case "사랑":
                return word + "은 " + eng[0];
            case "아기":
                return word + "는 " + eng[1];
            case "돈":
                return word + "은 " + eng[2];
            case "미래":
                return word + "는 " + eng[3];
            case "희망":
                return word + "은 " + eng[4];
            case "그만" :
                System.exit(0);
            default :
                return errCode;
        }
    }
}
