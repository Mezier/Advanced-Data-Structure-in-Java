package day0322Repeat2;

import java.util.ArrayList;

public class Point24 {
    public static String res=null;

    public String make24Points(String cards) {
        String[] c=cards.split(" ");
        if(c.length!=4){
            return "ERROR";
        }
        ArrayList<Double> d=new ArrayList<Double>();
        ArrayList<String> s=new ArrayList<String>();
        for(int i=0;i<4;i++){
            double td=Double.valueOf(c[i]);
            if(td==-1){
                return "ERROR";
            }
            d.add(td);
            s.add(c[i]);
        }
        res=null;       //清空数据
        recursion(d,s);
        if(res==null){
            return "NONE";
        }
        return res;
    }

    //递归，数组中取出两个数计算后结果放回数组
    private void recursion(ArrayList<Double> d,ArrayList<String> s){
        int n=d.size();
        if(n==1){
            if(Math.abs(d.get(0)-24.0)<=0.000000001){    //防止有分数而产生误差
                res=s.get(0);       //若数组只有一个数，且为24，则将算式字符串赋值给类静态变量
//              System.out.println(res);
            }
            return;
        }

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                ArrayList<Double> dd=new ArrayList<Double>();//用于递归的新数组
                ArrayList<String> ss=new ArrayList<String>();//用于存放算式的新数组
                //任意取出两个数的不同组合情况
                for(int r=0;r<n;r++){
                    if(r!=i&&r!=j){
                        dd.add(d.get(r));
                        ss.add(s.get(r));
                    }
                }
                dd.add(d.get(i)+d.get(j));//加入取出的两数计算结果 a+b
                ss.add("("+s.get(i)+"+"+s.get(j)+")");//记录两数计算的算式
                recursion(dd, ss);//递归
                if(res!=null){  //若静态变量已有值，则返回
                    return;
                }

                dd.remove(dd.size()-1);//移除上次添加的两数计算结果
                ss.remove(ss.size()-1);
                dd.add(d.get(i)-d.get(j));//a-b
                ss.add("("+s.get(i)+"-"+s.get(j)+")");
                recursion(dd, ss);
                if(res!=null){
                    return;
                }

                dd.remove(dd.size()-1);
                ss.remove(ss.size()-1);
                dd.add(d.get(i)*d.get(j));//a*b
                ss.add(s.get(i)+"*"+s.get(j));
                recursion(dd, ss);
                if(res!=null){
                    return;
                }

                dd.remove(dd.size()-1);
                ss.remove(ss.size()-1);
                dd.add(d.get(i)/d.get(j));//a/b
                ss.add(s.get(i)+"/"+s.get(j));
                recursion(dd, ss);
                if(res!=null){
                    return;
                }

                dd.remove(dd.size()-1);
                ss.remove(ss.size()-1);
                dd.add(d.get(j)-d.get(i));//b-a
                ss.add("("+s.get(j)+"-"+s.get(i)+")");
                recursion(dd, ss);
                if(res!=null){
                    return;
                }  

                dd.remove(dd.size()-1);
                ss.remove(ss.size()-1);
                dd.add(d.get(j)/d.get(i));//b/a
                ss.add(s.get(j)+"/"+s.get(i));
                recursion(dd, ss);
                if(res!=null){
                    return;
                }
            }
        }


    }

    public static void main(String[] args) {
        Point24 c = new Point24();
        String cards = "3 4 1 2";
        System.out.println("The method to make 24 points is: " + c.make24Points(cards));
    }
}
