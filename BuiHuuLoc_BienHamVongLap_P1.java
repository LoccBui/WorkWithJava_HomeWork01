package buihuuloc_bienhamvonglap;

import java.util.Scanner;

public class BuiHuuLoc_BienHamVongLap_P1 {
    
    public static void ChuViDienTichHCN(int height, int width){      
        System.out.println("Diện tích hình chữ nhật là: " + height*width);
        System.out.println("Chu vi hình chữ nhật là: " + (height+width)*2);
    }
    
    public static final float pi = 3.14f;
    public static void ChuViVaDienTichHinhTron(int r){
        System.out.println("Chu vi hình tròn là: " + 2*pi*r);
        System.out.println("Diện tích hình tròn là: " + pi*r*r);
    }
    
    public static void Heron(int a, int b, int c ){
        int chuvi = a+b+c;
        int s = chuvi/2;
        double dientich = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Diện tích hình tròn là: "+ dientich);
    }
    
    public static void DistanceTwoPoint(int x1, int y1, int x2, int y2){
        double distance = Math.sqrt( (Math.pow(x2-x1, 2) - (Math.pow(y2-y1, 2) )));
        System.out.println("Khoảng cách hai điểm : " + distance );
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chon;
        System.out.println("1. Bài tập 1 ");
        System.out.println("2. Bài tập 2 ");
        System.out.println("3. Bài tập 3 ");
        System.out.println("4. Bài tập 4 ");
        System.out.println("5. Bài tập 5 ");
        System.out.println("6. Bài tập 6 ");
        System.out.println("7. Bài tập 7 ");
        System.out.print("Chọn số tương ứng với bài tập: ");
        chon = sc.nextInt();
        
        if ( chon < 1 || chon > 7){
            System.out.println("Chọn không hợp lệ mời nhập lại ");     
        }
        else{
            switch(chon){
            case 1:System.out.println("Hello world!");
            break;
                
            case 2:{
                System.out.print("Nhập vào số nguyên a: ");
                int a = sc.nextInt();
                System.out.print("Nhập vào số nguyên b: ");
                int b = sc.nextInt();
                System.out.println("Tổng của hai số: " + (a+b) );
                System.out.println("Hiệu của hai số: " + (a-b) );
                System.out.println("Tích của hai số: " + (a*b) );
                System.out.println("Thương của hai số: " + (a/b) );
            } break;
                
            case 3:{
                System.out.print("Nhập vào điểm toán: ");
                int math = sc.nextInt();
                System.out.print("Nhập vào điểm vật lý: ");
                int physics = sc.nextInt();
                System.out.print("Nhập vào điểm hóa: ");
                int chemistry = sc.nextInt();
                System.out.println("Điểm trung bình của học sinh: " + ((math+physics+chemistry)/3));            
            }break;
                
            
            case 4:{
                System.out.print("Nhập vào chiều rộng hình chữ nhật: ");
                int height = sc.nextInt();
                System.out.print("Nhập vào chiều dài hình chữ nhật: ");
                int width = sc.nextInt();
                ChuViDienTichHCN(height, width);
            }break;
                
            case 5:{                
                System.out.println("Nhập vào R của hình tròn: ");
                int r = sc.nextInt();
                ChuViVaDienTichHinhTron(r);
            }break;
                
                
            case 6:{             
                System.out.print("Nhập vào cạnh a tam giác: ");
                int side_a = sc.nextInt();
                System.out.print("Nhập vào cạnh b tam giác: ");
                int side_b = sc.nextInt();
                System.out.print("Nhập vào cạnh c tam giác: ");
                int side_c = sc.nextInt();
                Heron(side_a,side_b,side_c);               
            }break;
                
                
            case 7:{
                System.out.print("Nhập vào tọa độ x1: ");
                int x1 = sc.nextInt();
                System.out.print("Nhập vào tọa độ y1: ");
                int y1 = sc.nextInt();
                System.out.print("Nhập vào tọa độ x2: ");
                int x2 = sc.nextInt();
                System.out.print("Nhập vào tọa độ y2: ");
                int y2 = sc.nextInt();
                DistanceTwoPoint(x1, y1, x2, y2);
            }
            
            }

        }
     
        
    }
    
}
