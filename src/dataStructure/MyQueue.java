package dataStructure;


import java.util.ArrayList;
import java.util.List;

public class MyQueue<T> {
    /**
     * Java ArrayList 클래스를 활용하여 enqueue,dequeue 기능 구현
     * dequeue 기능 호출 시, 큐에 데이터가 없을 경우, null 을 리턴
     * 다양한 데이터 타입을 다룰수 있도록, Java Generic 타입 문법을 활용해보기
     * @param args
     */
    public static void main(String[] args) {
        
        //테스트 str
        MyQueue<Integer> q1 = new MyQueue<>();
        q1.enqueue(0);
        q1.enqueue(1);
        q1.enqueue(2);

        System.out.println("q1 = " + q1.getQueue().toString());

        q1.dequeue();
        q1.dequeue();
        q1.dequeue();

        System.out.println("q1 = " + q1.getQueue().toString());
        System.out.println("q1 = " + q1.dequeue());
        //테스트 fin

    }

    //내가 만든것 str
    List<T> list = new ArrayList<>();

    void enqueue (T t) {
        list.add(t);
    }

    Boolean dequeue () {
        if(list.size() == 0){
            return null;
        }else{
            list.remove(0);
            return true;
        }
    }

    /**
     * getQueue 메소드는 내가 출력하기위해 만듬
     * @return
     */
    List<T> getQueue () {
        return list;
    }
    //내가 만든것 fin

    //문제의 정답 str
    private ArrayList<T> queue = new ArrayList<>();

    public void enqueue2(T item){
        queue.add(item);
    }

    public T dequeue2() {
        if(queue.isEmpty()) {
            return null;
        }
        return queue.remove(0);
    }
    //문제의 정답 fin
}
