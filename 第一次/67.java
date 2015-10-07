/*public static String addBinary(String a,String b){
    char[] achar = a.toCharArray();
    char[] bchar = b.toCharArray();
    aIndex = achar.length -1;
    bIndex = bchar.length -1;
    //int SIZE = Math.max(aIndex , bIndex)+1;
    int SIZE = Math.max(aIndex , bIndex)+2;  //c as the sum
    char[] c = new char[SIZE];  
    int flag = 0;
    while(aIndex >= 0 && bIndex >=0) {
        int num = achar[aIndex] - '0' + bchar[bIndex] - '0' + flag;
        flag = num/2;
        num%=2;
        c[--SIZE] = (char)num;
        aIndex--;
        bIndex--;
    }
    while(aIndex >=0) {
        int num = achar[aIndex] - '0' + flag;
        flag = num/2;
        num%=2;
        c[--SIZE] = (char)num;
        aIndex--;
    }
    while(bIndex >=0) {
      int num = bchar[bIndex] - '0' + flag;
        flag = num/2;
        num%=2;
        c[--SIZE] = (char)num;
        bIndex--;  
    }
    if (c[SIZE - 1] == null) {
        int cIndex = c.length - 2;
        while (cIndex > 0 ) {
            int i = o;
            c [i++] = c[i+1];
            cIndex --;
        }
    }
    return c.toString();
}
public class Solution {
    public String addBinary(String a, String b) {
        addBinary(String a, String b);
    }
}
*/

public class Solution {
    public String addBinary(String a, String b) {
        if(a.length() < b.length()){      //��aΪ��ַ�����ȡ���������㷨�еĶ���ж����
            String tmp = a;
            a = b;
            b = tmp;
        }
        
        int pa = a.length()-1;   //����charAt��������ȡ�������ʹ�á�
        int pb = b.length()-1;
        int carries = 0;
        String rst = "";      //String ����ʼֵ
        
        while(pb >= 0){
            int sum = (int)(a.charAt(pa) - '0') + (int)(b.charAt(pb) - '0') + carries;    //��char ����int���͡�
            rst = String.valueOf(sum % 2) + rst;   //�ַ������ֱ������
            carries = sum / 2;         //��λ
            pa --;
            pb --;
        }
        
        while(pa >= 0){
            int sum = (int)(a.charAt(pa) - '0') + carries;
            rst = String.valueOf(sum % 2) + rst;
            carries = sum / 2;
            pa --;
        }       
        
        if (carries == 1)
            rst = "1" + rst;    //����λΪ1����Ҫ����
        return rst;
    }
}