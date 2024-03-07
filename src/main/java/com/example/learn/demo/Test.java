package com.example.learn.demo;


import org.json.JSONException;

import java.util.*;

public class Test {
        public static void main(String[] args) throws JSONException {
            //        UserMapper userMapper = new UserMapper();
            //        ResumeMapper resumeMapper = new ResumeMapper();
            //        JsonParser parser = new JsonParser(userMapper, resumeMapper);
//
//        String jsonString = "";
//
//        parser.parseJson(jsonString);
//        multiplicationTable();
            loop();
            }


 /**
  * 冒泡排序
     *
     * @param arr
     */
  public static void bubbleSort(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) { // 0 1 2 3 4
            for (int j = 0; j < arr.length - i - 1; j++) { // 0 1 2 3
                // 如果前面的数比后面的数大，则交换
                if (arr[j] > arr[j + 1]) { // 0 1 2 3 4
                    temp = arr[j]; // 0 1 2 3
                    arr[j] = arr[j + 1]; // 0 1 2 3
                    arr[j + 1] = temp; // 0 1 2 3
                }
            }
        }
    }

    /**
     * 从list中找到nf为2023的数据,得到map中的zcjz字段
     * list的类型为list<map<string,object>>
     * 用lambda表达式实现
     * zcjz字段的类型为Double
     */
    public static void findZcjz() {
        List<Map<String,Object>> list = new ArrayList();
//        往list中添加一点数据
        Map<String,Object> map1 = new HashMap<>();
        map1.put("nf","2023");
        map1.put("zcjz",100.0);
        list.add(map1);
        Map<String,Object> map2 = new HashMap<>();
        map2.put("nf","2024");
        map2.put("zcjz",200.0);
        list.add(map2);
        list.stream().filter(map -> map.get("nf").equals("2023")).forEach(map -> System.out.println(map.get("zcjz")));
    }
    /**
     * 写一个9*9乘法表
     */
    public static void multiplicationTable() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "*" + j + "=" + i * j + " ");
            }
            System.out.println();
        }

}

    public  static int change(int num){
        num = 2;
        return num;
    }
    /**
     * 我需要得到一个集合中的zcjz,whsjnf,zcflxl的值
     * list的类型为list<zcqwlbhqs>
     *     zcqwlbhqs : private String zcflxl; private int whsjnf; private Double zcjz; private int sjsm;private int zcnl;private int nf;
     *     我需要得到2023-2050的数据，如果sjsm = 25 则2023年对于的是zcnl = sjsm，2024年对于的是zcnl = sjsm-1，以此类推2050年是获取不到值的，所以我给2050的zcjz赋值为0，同理2049年是获取不到值的，所以我给2049的zcjz赋值为0
     *     我需要得到2023-2050的数据，如果sjsm = 26 则2023年对于的是zcnl = sjsm，2024年对于的是zcnl = sjsm-1，以此类推2050年是获取不到值的，所以我给2050的zcjz赋值为0
     *     将获得的数据保存zcqwlbhqs中到按照nf排序
     */

    public static void loop() {
        String[] sblxs = {"A","B","C","D","E"};
        List<Byql> byqls1 = new ArrayList<>();
        Random random = new Random();
        for (String sblx : sblxs) {
            Byql byql1 = new Byql();
            List<Byql> Byqls = new ArrayList<>();
            for (int i = 0; i < 27; i++) {
                Byql byql = new Byql();
                double r = random.nextDouble();
                byql.setNf(2023+i);
                byql.setZcjz(r);
                byql.setSblx(sblx);
                Byqls.add(byql);
            }
            byql1.setSblx(sblx);
            byql1.setByql(Byqls);
            byqls1.add(byql1);
        }
        // 计算byqls1的数据，通过nf匹配，zcjz相加,按照nf排序,用byql这个对象接收
        Byql byql = calculateData(byqls1);
        System.out.println(byql);
    }

    public static Byql calculateData(List<Byql> byqls1) {
        Map<Integer, Double> nfZcjzMap = new HashMap<>();
        for (Byql byql : byqls1) {
            for (Byql innerByql : byql.getByql()) {
                int nf = innerByql.getNf();
                double zcjz = innerByql.getZcjz();
                if (nfZcjzMap.containsKey(nf)) {
                    double sum = nfZcjzMap.get(nf) + zcjz;
                    nfZcjzMap.put(nf, sum);
                } else {
                    nfZcjzMap.put(nf, zcjz);
                }
            }
        }

        List<Byql> sortedByqls = new ArrayList<>();
        for (Map.Entry<Integer, Double> entry : nfZcjzMap.entrySet()) {
            int nf = entry.getKey();
            double zcjz = entry.getValue();
            Byql sortedByql = new Byql();
            sortedByql.setNf(nf);
            sortedByql.setZcjz(zcjz);
            sortedByqls.add(sortedByql);
        }

        Collections.sort(sortedByqls, Comparator.comparingInt(Byql -> Byql.getNf()));

        Byql resultByql = new Byql();
        resultByql.setByql(sortedByqls);

        return resultByql;
    }

}
