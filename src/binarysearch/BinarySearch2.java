package binarysearch;

import java.util.Arrays;

public class BinarySearch2 {
    public int solution(int[] budgets, int M) {

        validateArguments(budgets, M);

        //M 보다 적으면 걍 max값 return
        if (getTotalAmount(budgets, budgets.length-1) <= M) {
            Arrays.sort(budgets);
            return budgets[budgets.length-1];
        }

        //책정된 전체 budget에서 지방수를 나누어 평균을 구함.
        double budgetAverage = M / (double)(budgets.length);

        //지방 별 budget이 평균 값 에 비해 얼만큼 +/-인지를 저장
        double[] budgetsPerAverage = new double[budgets.length];

        int temp = 0;
        for(int budget : budgets) {
            budgetsPerAverage[temp] = budgetAverage - budget;
            temp ++;
        }
        // 평균 별 예산 +/- 정렬
        Arrays.sort(budgetsPerAverage);

        // 평균인 0을 기준으로 평균 미만의 갯수와 평균 이상의 갯수를 구한다. average 초과가 일어나는 시작점의 index
        int centralIndex = getCentralIndex(Arrays.binarySearch(budgetsPerAverage, 0));

        //0번째면 다 초과하는거니까 걍 평균값 바로 return
        if(centralIndex == 0) {
            return (int)budgetAverage;
        }

        else {
            //N번째면 n-1까지 예산남는 것 계산.
            double getTotalAmount = getTotalAmount(budgetsPerAverage, centralIndex);
            //남는 금액을 넘치는 애들한테 분배 할 예정.
            double ttt = getTotalAmount / (double) centralIndex;

            return (int)(budgetAverage + ttt);
        }
    }

    //input값에 대한 validation
    public void validateArguments(int[] budgets, int M) {
        if (budgets.length < 3 || budgets.length > 100_000) {
            throw new IllegalArgumentException();
        }

        if (M < budgets.length || M > 1_000_000_000) {
            throw new IllegalArgumentException();
        }
    }

    public int getCentralIndex(int centralIndex) {
        //0이 index에 포함 되어 있는 것임으로 해당 index+1 부터 초과분으로 잡으면 됨
        if (centralIndex >= 0) {
            return centralIndex + 1;
        }

        //-가 나오면 -삽입포인트-1 return 값 임을 활용, 삽입point 부터 초과분으로 잡는다.
        else {
            return (-1)*centralIndex  - 1;
        }
    }

    //int형 배열에서 해당 index까지의 totalNumber를 구함
    public int getTotalAmount(int[] amounts, int index) {
        int totalAmount = 0;

        for(int i=0; i <= index; i++) {
            totalAmount += amounts[i];
        }

        return totalAmount;
    }

    //int형 배열에서 해당 index까지의 totalNumber를 구함
    public double getTotalAmount(double[] amounts, int index) {
        double totalAmount = 0;

        for(int i= index; i < amounts.length; i++) {
            totalAmount += amounts[i];
        }

        return totalAmount;
    }
}