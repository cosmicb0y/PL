#include <stdio.h>

int (int[] array, int left, int right) {
    int wall = left;
    int pivot = right;

    for (int i = left; i < right; i++) {
        if (array[i] <= array[pivot]) {
            int temp = array[wall];
            array[wall] = array[i];
            array[i] = temp;
            wall++;
        }
    }
    int temp = array[wall];
    array[wall] = array[pivot];
    array[pivot] = temp;

    return wall;
}

void quicksort(int[] array, left, right) {
    if (left >= right) {
        return;
    }

    int pivot = partition(array, left, right);
    quicksort(array, left, pivot - 1);
    quicksort(array, pivot + 1, right);
}


int main(void) {
    printf("hello world\n");
    return 0;
}

