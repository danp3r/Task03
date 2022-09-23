package impl.queue;

import java.util.Arrays;

// Класс для представления java.queue
public class MyQueue<T> {
    private T[] arr;      // массив для хранения элементов java.queue
    private int front;      // front указывает на передний элемент в java.queue
    private int rear;       // задняя часть указывает на последний элемент в java.queue
    private int capacity;   // максимальная емкость java.queue
    private int count;      // текущий размер java.queue

    // Конструктор для инициализации java.queue
    public MyQueue(int size) {
        arr = (T[]) new Object[size];
        capacity = size;
        front = 0;
        rear = -1;
        count = 0;
    }

    // Вспомогательная функция для добавления элемента в java.queue
    public void enqueue(T item) {
        // проверка на переполнение java.queue
        if (isFull()) {
            System.out.println("Overflow\nProgram Terminated");
            System.exit(-1);
        }

        rear = (rear + 1) % capacity;
        arr[rear] = item;
        count++;
    }

    // Вспомогательная функция для возврата размера java.queue
    public int size() {
        return count;
    }

    // Вспомогательная функция для проверки того, заполнена ли java.queue или нет
    public boolean isFull() {
        return (size() == capacity);
    }

    @Override
    public String toString() {
        return Arrays.toString(arr);
    }
}
