
public class test {

    /**
     * 给一个 char 数组，和 一个 char，要求删除这个char数组里面的所有匹配的 char，不匹配的字符需要前移，数组尾部空出的位置以 '-' 填充。
     * 比如，['a', 'b', 'a', 'd', 'a', 'd']，'a'，处理后返回数组['b', 'c', 'd', 'd', '-', '-']。
     * 注意：
     * 1. 要求算法复杂度为 O(n)
     * 2. 允许生成新的 char 数组
     * 3. 不使用 String.replace 等系统函数
     * 4. 不使用 List, StringBuffer 等数据结构
     * <p>
     *
     * @param charArr      需要查找的字符数组
     * @param charToRemove 需要删除的字符
     */
    public static void removeChar(char[] charArr, char charToRemove) {
        char[] char1 = new char[charArr.length];
        for (int i = 0; i < char1.length; i++) {
            char1[i] = '-';
        }
        int j = 0;
        for (int i = 0;i < charArr.length; i++){
            if (charArr[i] == charToRemove){
                continue;
            }
            char1[j] = charArr[i];
            j++;
        }
        for (int i = 0;i<charArr.length; i++ ){
            charArr[i] = char1[i];
        }
    }


    public static void main(String[] args) {
        char[] chars = {'b', 'a', 'b', 'a', 'a', 'd', 'c', 'a', 'd'};
        removeChar(chars, 'a');
        for (char c : chars) {
            System.out.print(c);
        }
        System.out.println();
    }

}