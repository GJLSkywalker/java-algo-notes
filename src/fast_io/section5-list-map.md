# 第 5 节 · List 与 Map

> 本节笔记包含核心 API 查表、必须默写的计数模板，以及易错点。
> 完整可运行验收代码见 `src/MostFrequent.java`。

## 核心 API 查表（抄一遍，不用背）

### ArrayList
```java
List<Integer> list = new ArrayList<>();   // 不能写 new ArrayList<int>()
list.add(5);              // 末尾加
list.add(0, 9);           // 插到下标 0
int v = list.get(2);      // 取
list.set(1, 7);           // 改
int sz = list.size();     // 长度（List 用 size()，数组用 length）
list.remove(1);           // ← 删下标 1
list.remove(Integer.valueOf(5));  // ← 删「值 5」，这两句完全不同
Collections.sort(list);   // 升序
list.sort((x, y) -> y - x); // 降序