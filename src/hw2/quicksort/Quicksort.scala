object Quicksort {
  def swap(a: Array[Int], pos1: Int, pos2: Int): Unit = {
    val stash = a(pos1)
    a(pos1) = a(pos2)
    a(pos2) = stash
  }

  def quicksort(a: Array[Int], low: Int, hi: Int): Unit = {
    if (low < hi) {
      val p = partition(a, low, hi)
      quicksort(a, low, p-1)
      quicksort(a, p+1, hi)
    }
  }

  def partition(subArray: Array[Int], low: Int, hi: Int): Int = {
    val pivot = hi;
    var i = low;
    for (
      j <- low to hi
      if subArray(j) < subArray(pivot)
    ) {swap(subArray, i, j); i+=1}

    swap(subArray, i, pivot);
    return i
  }
}