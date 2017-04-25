package algorithm;

public class Sort {

    long executionTime = 0;
	/*
	 * Please implement all the sorting algorithm. Feel free to add helper methods.
	 * Store all the sorted data into one of the databases.
	 */


    public int[] selectionSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;

        for(int i=0; i<array.length; i++){
            for(int j=i+1; j<array.length; j++){
                if(array[j]<array[i]){
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] insertionSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        for(int i = 1; i<array.length; i++){
            for(int j = i; j>0; j--){
                if(array[j]<array[j-1]){
                    int temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
            }
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] bubbleSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        for(int i = (array.length-1); i>=0; i--){
            for(int j = 1; j<=i; j++){
                if(array[j-1]>array[j]){
                    int temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
            }
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int [] mergeSort(int [] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        if (array.length > 1) {
            int[] left = leftHalf(array);
            int[] right = rightHalf(array);

            mergeSort(left);
            mergeSort(right);

            merge(array, left, right);
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public static int[] leftHalf(int[] array) {
        int size1 = array.length / 2;
        int[] left = new int[size1];
        for (int i = 0; i < size1; i++) {
            left[i] = array[i];
        }
        return left;
    }

    public static int[] rightHalf(int[] array) {
        int size1 = array.length / 2;
        int size2 = array.length - size1;
        int[] right = new int[size2];
        for (int i = 0; i < size2; i++) {
            right[i] = array[i + size1];
        }
        return right;
    }

    public static void merge(int[] result, int[] left, int[] right) {
        int i1 = 0;
        int i2 = 0;

        for (int i = 0; i < result.length; i++) {
            if (i2 >= right.length || (i1 < left.length && left[i1] <= right[i2])) {
                result[i] = left[i1];
                i1++;
            } else {
                result[i] = right[i2];
                i2++;
            }
        }
    }

    public int[] quickSort(int [] array, int left, int right ){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here

        int index = left + (right - left)/2;
        int value = array[index];

        int i = left;
        int j = right;

        while (i <= j){
            while (array[i] < value){
                i++;
            }
            while (array[j] > value){
                j--;
            }
            if (i <= j){
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
            if (left < i){
                quickSort(array, left, j);
            }
            if(right > i){
                quickSort(array, i, right);
            }
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }
    
    public int [] heapSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here
        int i, j, leftIndex, rightIndex, middleIndex, root, temp,  bound = 0;
        root = (bound-1)/2;

        for(j = root; j>=0; j-- ){
            for(i =root; i>=0; i--){
                leftIndex = (2 * i) + 1;
                rightIndex = (2 * i) + 2;
                if((leftIndex <= bound) && (rightIndex<=bound)){
                    if(array[rightIndex] >= array[leftIndex])
                        middleIndex = rightIndex;
                    else
                        middleIndex = leftIndex;
                }else {
                    if(rightIndex > bound)
                        middleIndex = leftIndex;
                    else
                        middleIndex = rightIndex;
                }
                if(array[i] < array[middleIndex]){
                    temp = array[i];
                    array[i]= array[middleIndex];
                    array[middleIndex] = temp;
                }
            }
        }
        temp = array[0];
        array[0] = array[bound];
        array[bound] = temp;
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int [] bucketSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int[] bucket = new int[100];
        for (int i = 0; i < array.length; i++)
            bucket[array[i]]++;
        int [] list = array;
        int  bound = 0;
        for(int i = 0; i<list.length; i++){
            if(list[i] > 0)
                array[bound++] = i;
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return array;
    }

    public int [] shellSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        int left, right, temp;

        int n = 1;
        while (n <=array.length/3){
            n = n * 3 + 1;
        }
        while (n > 0){
            for(right = n; right<array.length; right++){
                temp = array[right];
                left = right;

                while (left > n -1 && array[left -n] >= temp){
                    array[left] = array[left-n];
                    left -= n;
                }
                array[left] = temp;

            }
            n = (n - 1) /3;
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public static void printSortedArray(int [] array){
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}
