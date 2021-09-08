## 快速排序算法
```
  public static void qSort(int[] arr, int low, int high) {
    int pivotLoc;
    if (low < high) {
      pivotLoc = partition(arr, low, high);
      qSort(arr, low, pivotLoc);
      qSort(arr, pivotLoc + 1, high);
    }
  }

  public static void main(String[] args) {
    int[] arr = new int[] { 2, 5, 1, -3, 6, 9, 3, 6 };
    qSort(arr, 0, arr.length - 1);
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }
```
## partition实现1（arr[0] is pivot : O(n)）
```
<pre>
  |              |        partitioned         |unpartitioned|
  +---------------------------------------------------------+
  |       p      |      < p     |     > p     |       ?     |
  +---------------------------------------------------------+
                                ^             ^															   	
                                |             |																
                                i---->        j---->   (i <= j)
</pre>                
```
###### version-01
```
  private static int partition(int[] arr, int low, int high) {
    int pivotValue = arr[low];
    int i = low + 1;
    for (int j = i; j <= high && i <= j; j++) {
      if (arr[j] >= pivotValue) {
        // do nothing
      } else {
        // swap i and j
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
        i++;
      }
    }
    // swap low and i-1
    int tmp = arr[i - 1];
    arr[i - 1] = arr[low];
    arr[low] = tmp;
    return i - 1;
  }
```

## partition实现2（arr[0] is pivot : O(n)）
```
<pre>
  | partitioned  |unpartitioned|          |unpartitioned|  partitioned |  
  +--------------------------------------------------------------------+
  |      < p     |       ?     |     p    |      ?      |     > p      |
  +--------------------------------------------------------------------+
                 ^                                      ^
                 |                                      |
                low-----------------> <----------------high   ( low < high)
</pre>
```

###### version-01
```
  public static int partition(int[] arr, int low, int high) {
		int pivotValue = arr[low];
		while (low < high) {
			while (arr[high] >= pivotValue && low < high) {
				high--;
			}
			// swap low and high
			int tmp = arr[low];
			arr[low] = arr[high];
			arr[high] = tmp;
			if (low >= high) {
				break;
			} else {
				low = low + 1;
				while (arr[low] <= pivotValue && low < high) {
					low++;
				}
				// swap low and high
				tmp = arr[high];
				arr[high] = arr[low];
				arr[low] = tmp;
			}
		}
		return low;
  }
```
###### version-02
在交换的过程中，实际上tmp一直等于pivotValue，所以可以优化交换部分的代码。
```
  public static int partition(int[] arr, int low, int high) {
		int pivotValue = arr[low];
		while (low < high) {
			while (arr[high] >= pivotValue && low < high) {
				high--;
			}
			// swap low and high
			arr[low] = arr[high];
			arr[high] = pivotValue;
			if (low >= high) {
				break;
			} else {
				low = low + 1;
				while (arr[low] <= pivotValue && low < high) {
					low++;
				}
				// swap low and high
				arr[high] = arr[low];
				arr[low] = pivotValue;
			}
		}
		return low;
  }
```
###### version-03
pivotValue是不变的，赋值pivotValue的代码片段实际上可以暂存后最后赋值`arr[low] = pivotValue;`，不需要中途每次交换时都赋值。
```
  public static int partition(int[] arr, int low, int high) {
		int pivotValue = arr[low];
		while (low < high) {
			while (arr[high] >= pivotValue && low < high) {
				high--;
			}
			// swap low and high
			arr[low] = arr[high];
			if (low >= high) {
				break;
			} else {
				low = low + 1;
				while (arr[low] <= pivotValue && low < high) {
					low++;
				}
				// swap low and high
				arr[high] = arr[low];
			}
		}
		arr[low] = pivotValue;
		return low;
  }
```
###### version-04
分析代码逻辑，if-else的逻辑可以进行代码简化，`low = low + 1;`和`low++;`的条件其实是一样的，可以简化代码。
```
  public static int partition(int[] arr, int low, int high) {
		int pivotValue = arr[low];
		while (low < high) {
			while (arr[high] >= pivotValue && low < high) {
				high--;
			}
			// swap low and high
			arr[low] = arr[high];
			while (arr[low] <= pivotValue && low < high) {
				low++;
			}
			// swap low and high
			arr[high] = arr[low];
		}
		arr[low] = pivotValue;
		return low;
  }
```











最近偶然做到快速排序的习题，找了几本书参考，发现书上说的有些不一样？
有的说，快速排序算法的性能取决于划分的对称性，因此可以设计出采用随机选择划分基准的算法，因为划分基准的选择是随机的，从而可以期望划分是较对称的。
这么说的有：
《算法与数据结构(第二版)》傅清祥，王晓东
《计算机算法设计与分析》王晓东
《程序设计实践》Brian W.Kernighan,Rob Pike
可是《程序设计实践》的译者裘宗燕却在页脚上加了个注释，说“这个说法是错误的，从概率上看，采用随机选取方法并不能减少不平均划分的可能性”。
而另一本《数据结构算法与应用--C++语言描述》Sartaj Sahni则说，找仨元素，用它们中不大不小的那个作为划分基准，可以得到更平均的划分。
到底谁说的对？-_-

裘宗燕和Sartaj Sahni可能是对的。
