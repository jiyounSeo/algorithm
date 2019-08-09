package codility;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution{

    public int solution8(int[] A) {
        int dominator = A.length/2+1;
        List<Integer> numslist = IntStream.of(A).boxed().collect(Collectors.toList());
        HashSet<Integer> distinctNumsSet = new HashSet<>(numslist);
        Iterator<Integer> itr = distinctNumsSet.iterator();
        int resultIndex = -1;
        while(itr.hasNext()){
            int number = itr.next();
            int count = (int) Arrays.stream(A).filter(num -> num == number).count();
            if (count >= dominator) {
                resultIndex = numslist.indexOf(number);
            }
        }
        return resultIndex;
    }
    public int solution7_1(String S) {
        if (S.length()%2 == 1) {
            return 0;
        }
        while (S.length() > 0) {
            int[] index = new int[]{S.indexOf(")"), S.indexOf("]"), S.indexOf("}")};
            Arrays.sort(index);
            int min = Arrays.stream(index).filter(idx -> idx > 0).findFirst().orElse(-1);
            if (min <= 0) {
                return 0;
            }

            int length = S.length();
            if (S.charAt(min) == ')') {
                S = S.replaceAll("\\(\\)", "");
            } else if (S.charAt(min) == ']') {
                S = S.replaceAll("\\[\\]", "");
            } else if (S.charAt(min) == '}') {
                S = S.replaceAll("\\{\\}", "");
            }

            if (S.length() == length) {
                return 0;
            }

            /*if (S.charAt(min) == ')') {
                if (S.charAt(min-1) != '(') {
                    return 0;
                }
                S = S.replaceAll("\\(\\)", "");
            } else if (S.charAt(min) == ']') {
                if (S.charAt(min-1) != '[') {
                    return 0;
                }
                S = S.replaceAll("\\[\\]", "");
            } else if (S.charAt(min) == '}') {
                if (S.charAt(min-1) != '{') {
                    return 0;
                }
                S = S.replaceAll("\\{\\}", "");
            }*/
        }
        return 1;
    }

    public int solution7(String s) {

        //"(]", "(}", "[)","[}","{)", "{]"
        if (s.length()%2 == 1) {
            return 0;
        } else if (s.length() == 2) {
            if (s.equals("()") || s.equals("{}") || s.equals("[]") ) {
                return 1;
            } else {
                return 0;
            }
        }

        if (s.indexOf("(]") > 0) {
            return 0;
        } else if (s.indexOf("(}") > 0) {
            return 0;
        } else if (s.indexOf("[)") > 0) {
            return 0;
        } else if (s.indexOf("[}") > 0) {
            return 0;
        } else if (s.indexOf("{)") > 0) {
            return 0;
        } else if (s.indexOf("{]")> 0) {
            return 0;
        }
        return 1;
    }
    public int solution6(int[] A) {
        ArrayList<Integer> numslist = new ArrayList<>();
        for (int i = 0; i < A.length; i++) {
            numslist.add(A[i]);
        }
        HashSet<Integer> distinctNumsSet = new HashSet<>(numslist);
        return distinctNumsSet.size();
        //return IntStream.of(A).distinct().toArray().length;
        //return (int) Arrays.stream(A).distinct().count();

    }
    public int solution5_1(int[] A) {
        if (A.length == 0) {
            return -1;
        }

        int passingcar = 0;
        int total = 0;
        for (int index=0; index < A.length ; index++) {
            if (A[index] == 0) {
                passingcar++;
            } else {
                total += passingcar;
            }

            if (total > 1000000000 ) {
                return -1;
            }
        }
        return total;
    }

    public int solution5(int[] A) {
        int count = 0;
        while(true) {
            int index = -1;
            for (int i = 0; i<A.length; i++) {
                if (A[i] == 0) {
                    index = i;
                    break;
                }
            }
            if (index < 0 || A.length == index+1) {
                break;
            }
            A = Arrays.copyOfRange(A, index+1, A.length);
            count += Arrays.stream(A).filter(a -> a > 0).count();
        }
        return count;
    }

    public int solution4_4(int[] A) {
        Arrays.sort(A);
        int result = 1;
        if (A[A.length-1] < 0) {
            return result;
        } else {
            int index = Arrays.binarySearch(A, 1);
            if (index < 0) {
                return result;
            }
            for (; index<A.length; index++) {
                if (A[index] != result) {
                    break;
                }
                if (index == A.length-1 || A[index+1] != result) {
                    result++;
                }
            }
        }
        return result;
    }
    public int solution4(int[] A) {
        Arrays.sort(A);

        for (int index = 0; index<A.length; index++) {
            if (index+1 != A[index]) {
                return 0;
            }
        }
        return 1;
    }
    public int solution3(int[] A) {
        if (A.length == 0) {
            return 1;
        }
        Arrays.sort(A);
        int result = 0;
        for(int index=0; index<A.length; index++) {
            result = index+1;
            if(result != A[index]) {
                break;
            } else if (A.length == result) {
                result = result+1;
            }
        }
        return result;
    }

    public int solution2_1(int[] A) {

        if (A.length == 1) {
            return A[0];
        }
        Arrays.sort(A);
        for (int index=0; index<A.length-1; index = index+2) {
            if (A[index] != A[index+1]) {
                return A[index];
            }
        }
        return A[A.length-1];

    }

    public int[] solution2_2(int[] A, int K) {
        if (A.length == K || A.length == 0 || K == 0) {
            return A;
        }
        if (A.length < K) {
            K = K%A.length;
        }
        int a[] = Arrays.copyOfRange(A, A.length-K, A.length);
        int b[] = Arrays.copyOfRange(A, 0, A.length-K);
        return IntStream.concat(Arrays.stream(a), Arrays.stream(b)).toArray();
    }

    public int solution1(int N) {
        String binaryNum = Integer.toBinaryString(N).substring(1);
        if (!binaryNum.contains("1")) {
            return 0;
        }
        String[] array = binaryNum.split("1");
        int arrayLength = (binaryNum.charAt(binaryNum.length() - 1) == '0') ? array.length-1 : array.length;
        int max = 0;
        if (binaryNum.contains("0")) {
            for (int i=0; i<arrayLength; i++) {
                if (max <= array[i].length()) {
                    max = array[i].length();
                }
            }
        }
        return  max;
    }



        /*
                // write your code in Java SE 8

        if (A.length == 1) {
            return A[0];
        }
        //Integer[] integerA = Arrays.stream(A).boxed().toArray(Integer[]::new);
        Arrays.sort(A);
        int index = 0;
        for (int i=0; i<A.length;i++) {
            index = i;
            if (A.length-1 == i || A[i] != A[i+1]) {
                break;
            }
            i = i+1;
        }
        return A[index];


        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(integerA));
        List<Integer> result1 = arrayList.stream().distinct().collect(Collectors.toList());

        int index = 0;
        for (int i=0; i<result1.size(); i++) {
            if(arrayList.indexOf(result1.get(i)) == arrayList.lastIndexOf(result1.get(i))) {
                index = i;
                break;
            }
        }
        return result1.get(index);*/
    //출처: https://mommoo.tistory.com/32 [개발자로 홀로 서기]
}
