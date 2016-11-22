package task;
import java.util.Random;
import java.util.Scanner;
public class ProducerConsumerProblem {

	public static void main(String[] args) {		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter buffer size");
		int size=sc.nextInt();
		DataBuffer buffer = new DataBuffer(size);
		
		Producer p = new Producer(buffer);
		Consumer c = new Consumer(buffer);
	
		
		p.start();
		c.start();
	}
}
	
	class DataBuffer{
                
		private int dataBuffer[];
		private int capacity;
		
		private int front = 0;
		private int currentSize = 0;
		
		public DataBuffer(int capacity) {
			this.capacity = capacity;
			dataBuffer = new int[capacity];
		}
		
		public boolean isEmpty(){
			return (currentSize == 0);
		}
		
		public boolean isFull(){
			return (currentSize == capacity);
		}
		
		public  void produce(int data){
			synchronized (dataBuffer) 
			{
			while(isFull()){
				try {
					dataBuffer.notifyAll();
					dataBuffer.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			dataBuffer[(front+currentSize)%capacity] = data;
			System.out.println("Put "+ data);
			currentSize++;
			dataBuffer.notifyAll();
			}
		}
		
		public  int consume()
			{
				synchronized (dataBuffer) 
				{
					while (isEmpty())
					{
						try {
							dataBuffer.notifyAll();
							dataBuffer.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					int data = dataBuffer[front];
					front = (front+1)%capacity;
					currentSize--;
					dataBuffer.notifyAll();
					System.out.println("Get "+ data);
					return data;	
				}
				
			}
			
		
	}
	
	class Producer extends Thread{
		
		private DataBuffer buffer;
		private Random random;
		
		public Producer(DataBuffer buffer){
			this.buffer = buffer;
			random = new Random();
		}
		
		@Override
		public void run() {
			while(true){
				
				int data = random.nextInt(100);
				buffer.produce(data);
			}
		}
	}
	
	class Consumer extends Thread{
		
		private DataBuffer buffer;
		
		public Consumer(DataBuffer buffer){
			this.buffer = buffer;
		
		}
		
		@Override
		public void run() {
			{
				while(buffer.isEmpty())
				{
				buffer.consume();
				}
			}
		}
	}


