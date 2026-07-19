public class Demo3 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();//it is thread safe methid use to solve race around condition so it is slow and take large 
        //amount of memory use instead of this metod we can use locks system in stringbuilder method 
        sb.append("ram");
        sb.append("shyam");
        sb.append("radha");
        sb.append("krishan");
        System.out.println(sb);
        sb.insert(2,"shiva");
        System.out.println(sb);
        //Delete
        sb.delete(2, 3);//1 inclusive 2 exclusive
        System.out.println(sb);
        sb.deleteCharAt(1);
        //sb.replace(0,1)
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        //sb.setCharAt(1, "bv");
        //System.out.println(sb);
        sb.length();
        System.out.println(sb);
        sb.capacity();
        System.out.println(sb);
        sb.trimToSize();
        System.out.println(sb);

    }

    }
    

