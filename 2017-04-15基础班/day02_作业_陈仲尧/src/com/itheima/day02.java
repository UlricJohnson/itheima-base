/*1. 分析以下需求，并用代码实现
    (1).键盘录入一个三位整数数，请分别获取该三位数上每一位的数值
    (2).例如：键盘录入的整数123的个位、十位、百位，分别是3、2、1
    (3).打印格式:"数字123的个位是 3, 十位是 2, 百位是 1"(20分)

参考答案：
答案说明：
2、
分析以下需求，并用代码实现

         (1).键盘录入三个int类型的数字

         (2).要求：

                   a.求出三个数中的最小值并打印

                   b.求出三个数的和并打印

(20分)
参考答案：
答案说明：
3、
分析以下需求，并用代码实现

         (1).安装Eclipse

         (2).在Eclipse中建立工作空间：d:\\mycodes

         (3).在该工作空间中创建java项目mineday01

         (4).在mineday01项目的src中建立报名com.itheima.tests

         (5).在com.itheima.tests包中编写da01作业题中的编码题目(写代码时注意练习快捷键的使用)

         (6).将编码区和控制台的字体改为14号字体

(20分)
参考答案：
答案说明：
4、
分析以下需求，并用代码实现

         (1).键盘录入一个学生成绩(int类型)

         (2).判断该学生成绩是否及格

         (3).打印格式：

                   成绩>=60:打印"合格"

                   成绩<60:打印"不合格"

(20分)
参考答案：
答案说明：
实操题 共1题 满分：20分

5、
看程序说结果，请不要提前运行？

         public class Test05 {

                   public static void main(String[] args) {

                            short s = 30;

                            int i = 50;

                            s += i;

                            System.out.println("s="+s);	// 80

                            int x = 0;

                            int y = 0;

                            int z = 0;

                            boolean a,b;

                            a = (x>0) & (y++>1);	

                            System.out.println("a="+a);	// a=false

                            System.out.println("y="+y);	// y=1

                            b = (x>0) && (z++>1);

                            System.out.println("b="+b);	// b=false
                            
                            System.out.println("z="+z);	// z=0

                            a = (x>0) | (y++>1);

                            System.out.println("a="+a);	// a=false
                            
                            System.out.println("y="+y);	// y=2

                            b = (x>0) || (z++>1);

                            System.out.println("b="+b);	// b=false
                            
                            System.out.println("z="+z); // z=0                     	

                   }

         }

(20分)

* 精益求精附加题（加分题）：
1. 键盘录入一个长方形的长和宽 
   要求：
	1. 计算长方形面积。(长*宽)
    2. 计算长方形的周长((长+宽)*2)。
(20分)
2. 键盘录入圆形的半径
   要求：
    1. 计算圆形的周长(2πr)
	2. 计算圆形的面积(πr的平方)。
(20分)
3. AB之间距离5km，A速度为1.2km/h，B速度为2km/h，求B多久能赶上A。
(20分)
*/