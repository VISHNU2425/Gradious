import java.util.Arrays;
public class Sorto1{
	public static void main(String...args){
mergeSort(arr, left, right):
    if left < right:
        mid = (left + right) / 2
        mergeSort(arr, left, mid)
        mergeSort(arr, mid+1, right)
        merge(arr, left, mid, right)

merge(arr, left, mid, right):
    create temp arrays L and R
    copy data into L and R
    i = 0, j = 0, k = left

    while i < L.length and j < R.length:
        if L[i] <= R[j]:
            arr[k] = L[i]
            i++
        else:
            arr[k] = R[j]
            j++
        k++

    copy remaining elements	}

}