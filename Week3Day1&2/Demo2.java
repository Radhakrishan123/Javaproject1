public class Demo2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("ram");
        sb.append("shyam");
        sb.append("kabir");
        sb.append("rohn");
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
