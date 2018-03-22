package basicAlgorithm;

public class Permutation11 {
    private static int Per(int... n){
    	int count=0;  //�������ָ��� 
    	if(n.length<3){
    		count =0;
    	}else{
    	int i=0;  //�����λ�ϵ���
    	int j=0;  //����ʮλ�ϵ���
    	int k=0;  //�����λ�ϵ���
    	
    	for(i=1;i<=n.length ;i++){
    	   for(j=1;j<=n.length ;j++){
    	   for(k=1;k<=n.length ;k++){
    	    if(i!=j && j!=k && i!=k){
    	    	count+=1;
    	        System.out.println(i*100+j*10+k);
    	    } 
    	     }  
    	   }
    	 } }
    	//System.out.println (t);
    	return count;
    	}
    			
    			
    	
    
    public static void main(String[] args) {
		int sum=Per(1,2,3);
		System.out.println("num: "+sum);
	}
}
