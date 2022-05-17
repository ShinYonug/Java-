package DrawShape;

public class DrawShape {

	public static void main(String[] args) {
		Point[] p = {	new Point(100,400),   //p[0]=(100,400),  p[1]=(140,50),  p[2]=(200,100) 으로 초기화
						new Point(140,50),
						new Point(200,100)
					};
		Triangle t = new Triangle(p);        // 트라이 앵글이 p를 참조하는 객체 생성
		Circle c = new Circle(new Point(150,150),50);
	
		t.draw(); // 삼각형을 그린다
		c.draw(); // 원을 그린다.
	
	}
}
class Shape{
	String color = "Black";
	void draw() {
		System.out.printf("[color=%s]%n",color);
	}
}
class Point{
	int x, y;
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	Point(){ this(0,0);}
	String getXY() { return "("+x+","+y+")"; }
}
class Circle extends Shape{
	Point center; //원의 원점좌표
	int r;// 반지름
	
	Circle(){
		this(new Point(0,0),100 ); //  Circle(Point center, int r)	호출
	}
	Circle(Point center, int r){
		this.center = center;
		this.r = r;
	}
	void draw() { // 원을 그리는 대신에 원의 정보를 출력하도록 했다
		System.out.printf("[center=(%d,%d), r=%d, color=%s]",center.x,center.y, r, color);
	}
}
class Triangle extends Shape{
	Point[] p = new Point[3];   //앞에서 초기화시킨 값을 포인트 배열에 입력
	
	Triangle(Point[] p) {    //트라이앵글 클래스의 포인트 배열 초기화(주소값)
		this.p = p;
	}
	void draw() { 
		System.out.printf("[p1=%s, p2=%s, p3=%s, color=%s]%n",
				p[0].getXY(), p[1].getXY(),p[2].getXY(),color);
	}
}