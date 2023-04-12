package IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInput {

    public static void main(String[] args) {

//        String str = "Hello Java Programming" ;

        // 파일을 바이트로 출력하는 스트림이 있다.

        // 입출력은 문자기반이냐 바이트기반이냐에 따라 처리 속도 및 범위가 다르다

        // 문자기반일 경우 2byte 사용, 바이트기반의 경우 8byte? 이다.  >>> 한번 더 개념 정리 해야할 듯 하다. 스트림과 입출력, 파일에 관련해서

        try {
            File file = new File("gugudan");
            if (!file.exists()) { // 파일이 있는지 확인
                file.createNewFile(); // 새로운 파일은 있는지 묻고 없으면 생성.
            }

            FileInputStream fos = new FileInputStream(file); // 도대체 뭐하는 코드인지 모르겠다.. 따라치기 바쁘다 그냥.

            // null 나오기 전까지 읽어오기

            int i = 0;
            // read() 데이터를 읽을 것이 없다면 -1

            while((i =fos.read()) != -1) {// fos.read가 -1이라면 데이터가 없다는 뜻

                System.out.print((char)i); // 숫자형태로 저장돼있을 것이다.
            }

            fos.close();

            System.out.println("정상적");

            }catch(IOException e){
            System.out.println("파일에 대한 예외발생.");
        }

    }
}


