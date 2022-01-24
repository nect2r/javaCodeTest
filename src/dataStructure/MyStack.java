package dataStructure;


import java.util.ArrayList;
import java.util.List;

public class MyStack<T> {
    /**
     * Java ArrayList 클래스를 활용하여 push,pop 기능 구현
     * push 기능 호출 시, 스택에 데이터가 없을 경우, null 을 리턴
     * 다양한 데이터 타입을 다룰수 있도록, Java Generic 타입 문법을 활용해보기
     * @param args
     */
    public static void main(String[] args) {
        

    }

    //내가 만든것 str
    List<T> list = new ArrayList<>();

    void push (T t) {
        list.add(t);
    }

    T pop () {
        if(list.isEmpty()){
            return null;
        }else{
            return list.remove(list.size() - 1);
        }
    }

    /**
     * getQueue 메소드는 내가 출력하기위해 만듬
     * @return
     */
    List<T> getStack () {
        return list;
    }
    //내가 만든것 fin
}
