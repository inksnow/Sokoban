package com.inks.sokoban;

import java.util.ArrayList;

/**
 * Created by Administrator on 17-4-11.
 */
public class LV_data {
  final ArrayList<int[][]> arrayList = new ArrayList<>();

    LV_data(){
        int[][] LV_1 ={//0是墙，1是空，2是人，3是空箱子，4是满箱子，5是花,6是人加花
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,5,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,1,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,3,1,3,5,0,0,0,0,0},
                {0,0,0,0,5,3,2,1,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,3,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,5,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
        };
        arrayList.add(LV_1);


        int[][] LV_2 ={//0是墙，1是空，2是人，3是空箱子，4是满箱子，5是花,6是人加花
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,2,1,1,0,0,0,0,0,0,0,0},
                {0,0,0,0,1,3,3,0,0,0,0,0,0,0,0},
                {0,0,0,0,1,3,1,0,0,0,5,0,0,0,0},
                {0,0,0,0,0,0,1,0,0,0,5,0,0,0,0},
                {0,0,0,0,0,0,1,1,1,1,5,0,0,0,0},
                {0,0,0,0,0,1,1,1,0,1,1,0,0,0,0},
                {0,0,0,0,0,1,1,1,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
        };
        arrayList.add(LV_2);

        int[][] LV_3 ={//0是墙，1是空，2是人，3是空箱子，4是满箱子，5是花,6是人加花
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,1,1,1,1,1,0,0,0,0,0},
                {0,0,0,0,0,3,0,0,0,1,1,1,0,0,0},
                {0,0,0,0,1,2,1,3,1,1,3,1,0,0,0},
                {0,0,0,0,1,5,5,0,1,3,1,0,0,0,0},
                {0,0,0,0,0,5,5,0,1,1,1,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
        };
        arrayList.add(LV_3);

        int[][] LV_4 ={//0是墙，1是空，2是人，3是空箱子，4是满箱子，5是花,6是人加花
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,1,1,0,0,0,0,0,0,0},
                {0,0,0,0,0,2,3,1,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,3,1,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,1,3,1,0,0,0,0,0,0},
                {0,0,0,0,0,5,3,1,1,0,0,0,0,0,0},
                {0,0,0,0,0,5,5,4,5,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
        };
        arrayList.add(LV_4);

        int[][] LV_5 ={//0是墙，1是空，2是人，3是空箱子，4是满箱子，5是花,6是人加花
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,2,1,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,1,3,1,1,0,0,0,0,0,0},
                {0,0,0,0,0,0,1,0,1,0,0,0,0,0,0},
                {0,0,0,0,5,0,1,0,1,1,0,0,0,0,0},
                {0,0,0,0,5,3,1,1,0,1,0,0,0,0,0},
                {0,0,0,0,5,1,1,1,3,1,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
        };
        arrayList.add(LV_5);

        int[][] LV_6 ={//0是墙，1是空，2是人，3是空箱子，4是满箱子，5是花,6是人加花
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,1,1,1,1,1,0,0,0,0,0},
                {0,0,1,1,1,5,0,0,0,1,0,0,0,0,0},
                {0,0,1,0,1,0,1,1,1,1,0,0,0,0,0},
                {0,0,1,0,1,3,1,3,0,5,1,0,0,0,0},
                {0,0,1,0,1,1,4,1,1,0,1,0,0,0,0},
                {0,0,1,5,0,3,1,3,1,0,1,0,0,0,0},
                {0,0,0,1,1,1,1,0,1,0,1,0,0,0,0},
                {0,0,0,1,0,0,0,5,1,1,1,1,2,0,0},
                {0,0,0,1,1,1,1,1,0,0,1,1,1,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
        };
        arrayList.add(LV_6);

        int[][] LV_7 ={//0是墙，1是空，2是人，3是空箱子，4是满箱子，5是花,6是人加花
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,1,1,1,0,0,0,0,0,0,0,0,0},
                {0,0,0,1,3,1,5,5,1,3,1,0,0,0,0},
                {0,0,0,0,3,1,5,5,3,3,2,0,0,0,0},
                {0,0,0,0,1,1,5,5,1,3,1,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
        };
        arrayList.add(LV_7);

        int[][] LV_8 ={//0是墙，1是空，2是人，3是空箱子，4是满箱子，5是花,6是人加花
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,1,1,1,1,0,0,0,0},
                {0,0,0,0,0,5,1,3,0,0,1,0,0,0,0},
                {0,0,0,0,5,5,3,1,3,1,1,2,0,0,0},
                {0,0,0,0,5,5,1,3,1,3,1,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,1,1,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
        };
        arrayList.add(LV_8);

        int[][] LV_9 ={//0是墙，1是空，2是人，3是空箱子，4是满箱子，5是花,6是人加花
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,1,1,0,0,1,1,1,0,0,0,0},
                {0,0,0,0,1,1,1,3,1,1,1,0,0,0,0},
                {0,0,0,0,3,1,0,0,0,1,3,0,0,0,0},
                {0,0,0,0,1,0,5,5,5,0,1,0,0,0,0},
                {0,0,0,0,1,0,5,5,5,0,1,0,0,0,0},
                {0,0,0,1,3,1,1,3,1,1,3,1,0,0,0},
                {0,0,0,1,1,1,1,1,0,1,1,2,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
        };
        arrayList.add(LV_9);

        int[][] LV_10 ={//0是墙，1是空，2是人，3是空箱子，4是满箱子，5是花,6是人加花
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,1,1,1,1,0,0,0,0,0},
                {0,0,0,0,0,0,3,3,3,1,0,0,0,0,0},
                {0,0,0,0,2,1,3,5,5,1,0,0,0,0,0},
                {0,0,0,0,1,3,5,5,5,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,1,1,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
        };
        arrayList.add(LV_10);

        int[][] LV_11 ={//0是墙，1是空，2是人，3是空箱子，4是满箱子，5是花,6是人加花
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,1,1,0,0,0,0,1,1,1,0,0,0},
                {0,0,1,3,1,0,0,0,0,3,1,1,0,0,0},
                {0,0,1,1,3,5,5,5,5,1,3,1,0,0,0},
                {0,0,0,1,1,1,1,0,1,2,1,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
        };
        arrayList.add(LV_11);

        int[][] LV_12 ={//0是墙，1是空，2是人，3是空箱子，4是满箱子，5是花,6是人加花
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,1,1,2,0,0,0,0,0,0},
                {0,0,0,0,1,1,3,5,1,0,0,0,0,0,0},
                {0,0,0,0,1,1,5,3,5,1,0,0,0,0,0},
                {0,0,0,0,1,1,1,4,3,1,0,0,0,0,0},
                {0,0,0,0,0,0,1,1,1,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
        };
        arrayList.add(LV_12);
        int[][] LV_13 ={//0是墙，1是空，2是人，3是空箱子，4是满箱子，5是花,6是人加花
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,5,5,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,1,5,0,0,0,0,0,0},
                {0,0,0,0,0,0,1,1,3,5,0,0,0,0,0},
                {0,0,0,0,0,0,1,3,1,1,0,0,0,0,0},
                {0,0,0,0,0,1,1,0,3,3,1,0,0,0,0},
                {0,0,0,0,0,2,1,1,1,1,1,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
        };
        arrayList.add(LV_13);
        int[][] LV_14 ={//0是墙，1是空，2是人，3是空箱子，4是满箱子，5是花,6是人加花
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,1,1,0,1,1,1,0,0,0,0,0},
                {0,0,0,0,1,3,5,5,3,1,0,0,0,0,0},
                {0,0,0,0,2,3,5,4,1,0,0,0,0,0,0},
                {0,0,0,0,1,3,5,5,3,1,0,0,0,0,0},
                {0,0,0,0,1,1,0,1,1,1,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
        };
        arrayList.add(LV_14);

        int[][] LV_15 ={//0是墙，1是空，2是人，3是空箱子，4是满箱子，5是花,6是人加花
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,1,1,1,1,0,0,0,0,0,0},
                {0,0,0,0,1,3,1,3,3,1,0,0,0,0,0},
                {0,0,0,0,5,5,5,5,5,5,0,0,0,0,0},
                {0,0,0,0,1,3,3,1,3,1,0,0,0,0,0},
                {0,0,0,0,0,0,1,2,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
        };
        arrayList.add(LV_15);


        int[][] LV_16 ={//0是墙，1是空，2是人，3是空箱子，4是满箱子，5是花,6是人加花
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,1,1,1,1,0,0,0,0,0,0},
                {0,0,0,0,0,1,3,1,1,1,1,0,0,0,0},
                {0,0,0,0,0,1,3,1,0,0,1,0,0,0,0},
                {0,0,0,5,5,5,1,3,1,1,1,0,0,0,0},
                {0,0,0,5,5,5,3,0,3,0,0,0,0,0,0},
                {0,0,0,0,0,0,1,0,1,3,1,0,0,0,0},
                {0,0,0,0,0,0,1,1,1,1,2,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
        };
        arrayList.add(LV_16);

        int[][] LV_17={//0是墙，1是空，2是人，3是空箱子，4是满箱子，5是花,6是人加花
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,1,1,1,1,0,0,0,0,0,0,0},
                {0,0,0,0,1,3,3,3,0,0,0,0,0,0,0},
                {0,0,0,0,1,1,0,5,5,0,0,0,0,0,0},
                {0,0,0,0,0,1,1,5,5,3,1,0,0,0,0},
                {0,0,0,0,0,1,2,1,1,1,1,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
        };
        arrayList.add(LV_17);

        int[][] LV_18 ={//0是墙，1是空，2是人，3是空箱子，4是满箱子，5是花,6是人加花
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,1,1,1,0,5,1,0,0,0,0},
                {0,0,0,0,0,1,1,3,5,5,5,0,0,0,0},
                {0,0,0,0,1,1,3,1,0,4,5,0,0,0,0},
                {0,0,0,0,1,0,0,3,0,1,0,0,0,0,0},
                {0,0,0,1,1,1,3,1,1,3,1,0,0,0,0},
                {0,0,0,1,1,1,0,1,1,1,1,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,1,2,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
        };
        arrayList.add(LV_18);

        int[][] LV_19 ={//0是墙，1是空，2是人，3是空箱子，4是满箱子，5是花,6是人加花
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,5,5,5,5,1,0,0,0,0,0,0},
                {0,0,0,0,0,5,5,5,3,0,0,0,0,0,0},
                {0,0,0,1,1,3,0,3,1,3,1,0,0,0,0},
                {0,0,0,1,3,3,1,1,0,3,1,0,0,0,0},
                {0,0,0,1,1,1,1,0,1,1,1,0,0,0,0},
                {0,0,0,0,0,0,1,2,1,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
        };
        arrayList.add(LV_19);

        int[][] LV_20 ={//0是墙，1是空，2是人，3是空箱子，4是满箱子，5是花,6是人加花
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,5,5,3,5,5,0,0,0,0,0},
                {0,0,0,0,0,5,5,0,5,5,0,0,0,0,0},
                {0,0,0,0,0,1,3,3,3,1,0,0,0,0,0},
                {0,0,0,0,0,1,1,3,1,1,0,0,0,0,0},
                {0,0,0,0,0,1,3,3,3,1,0,0,0,0,0},
                {0,0,0,0,0,1,1,0,1,2,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
        };
        arrayList.add(LV_20);

        int[][] LV_21 ={//0是墙，1是空，2是人，3是空箱子，4是满箱子，5是花,6是人加花
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,1,5,5,5,0,0,0,0,0},
                {0,0,0,0,0,0,5,5,5,5,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,3,1,0,0,0,0,0},
                {0,0,0,2,3,1,3,1,1,3,3,1,0,0,0},
                {0,0,0,1,1,3,1,3,1,1,1,1,0,0,0},
                {0,0,0,1,1,1,0,0,0,1,1,1,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
        };
        arrayList.add(LV_21);

        int[][] LV_22 ={//0是墙，1是空，2是人，3是空箱子，4是满箱子，5是花,6是人加花
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,1,1,1,1,1,1,0,0,0,0,0},
                {0,0,0,0,1,0,3,3,1,1,0,0,0,0,0},
                {0,0,0,0,1,5,5,5,0,1,0,0,0,0,0},
                {0,0,0,0,0,5,5,5,3,1,0,0,0,0,0},
                {0,0,0,0,0,1,0,0,1,3,1,0,0,0,0},
                {0,0,0,0,0,3,1,1,3,1,1,0,0,0,0},
                {0,0,0,0,0,1,1,0,1,1,2,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
        };
        arrayList.add(LV_22);

        int[][] LV_23 ={//0是墙，1是空，2是人，3是空箱子，4是满箱子，5是花,6是人加花
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,1,1,1,0,0,0,0,0,0,0},
                {0,0,0,1,1,1,3,1,3,1,1,0,0,0,0},
                {0,0,0,1,3,1,1,1,3,1,2,0,0,0,0},
                {0,0,0,0,0,3,3,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,1,1,5,5,0,0,0,0,0,0},
                {0,0,0,0,0,5,5,5,5,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
        };
        arrayList.add(LV_23);

        int[][] LV_24 ={//0是墙，1是空，2是人，3是空箱子，4是满箱子，5是花,6是人加花
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,1,1,1,1,0,0,0,0,0,1,1,5,0,0},
                {0,1,1,3,1,3,1,0,0,0,5,5,5,0,0},
                {0,1,0,1,1,3,1,0,0,0,1,1,5,0,0},
                {0,1,1,3,3,3,1,1,1,3,1,2,5,0,0},
                {0,0,0,1,1,3,1,1,3,0,1,1,5,0,0},
                {0,0,0,1,1,3,0,3,1,0,5,5,5,0,0},
                {0,0,0,0,1,1,1,1,1,0,1,1,5,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
        };
        arrayList.add(LV_24);


        int[][] LV_25 ={//0是墙，1是空，2是人，3是空箱子，4是满箱子，5是花,6是人加花
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,5,1,1,1,0,0,0},
                {0,0,0,0,1,1,0,5,5,0,0,1,0,0,0},
                {0,0,0,0,1,1,3,5,5,1,1,1,0,0,0},
                {0,0,0,0,1,1,0,1,5,0,1,0,0,0,0},
                {0,0,0,0,0,1,0,0,3,0,1,1,0,0,0},
                {0,0,0,1,3,1,1,1,1,3,3,1,0,0,0},
                {0,0,0,2,0,3,0,1,1,0,1,1,0,0,0},
                {0,0,0,1,1,1,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
        };
        arrayList.add(LV_25);


        int[][] LV_26 ={//0是墙，1是空，2是人，3是空箱子，4是满箱子，5是花,6是人加花
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,1,1,1,0,0,1,1,0,0,0,0,0},
                {0,0,0,1,3,1,1,1,1,1,1,1,1,0,0},
                {0,0,0,0,3,0,0,0,1,0,0,1,1,0,0},
                {0,0,0,1,1,0,0,1,4,1,0,1,0,0,0},
                {0,0,0,1,3,5,5,5,5,5,5,1,0,0,0},
                {0,0,0,1,0,0,0,1,5,1,0,1,0,0,0},
                {0,0,1,1,1,1,1,3,0,0,0,3,0,0,0},
                {0,0,1,1,1,0,1,1,1,1,3,2,0,0,0},
                {0,0,0,0,0,0,3,0,1,0,0,0,0,0,0},
                {0,0,0,0,0,0,1,1,1,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
        };
        arrayList.add(LV_26);

        int[][] LV_27 ={//0是墙，1是空，2是人，3是空箱子，4是满箱子，5是花,6是人加花
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,1,1,1,1,1,1,1,0},
                {0,0,0,0,0,0,0,1,0,1,0,1,0,1,0},
                {0,0,0,0,0,0,0,1,1,3,1,3,0,1,0},
                {0,0,0,0,0,0,0,0,1,1,3,1,1,1,0},
                {0,5,5,0,1,1,0,0,1,3,1,3,0,1,0},
                {0,5,5,1,1,1,0,0,1,3,1,3,1,1,0},
                {0,5,5,0,1,1,0,0,1,0,0,0,0,0,0},
                {0,5,5,0,1,0,1,3,1,3,1,0,0,0,0},
                {0,5,5,1,1,1,1,1,3,1,1,0,0,0,0},
                {0,1,1,0,0,0,1,2,1,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
        };
        arrayList.add(LV_27);

        int[][] LV_28 ={//0是墙，1是空，2是人，3是空箱子，4是满箱子，5是花,6是人加花
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,5,5,5,5,5,5,0,0,0,0,0},
                {0,0,0,0,1,1,3,1,0,1,0,0,0,0,0},
                {0,0,0,0,1,3,1,0,1,3,1,0,0,0,0},
                {0,0,0,0,0,3,1,3,1,3,1,0,0,0,0},
                {0,0,0,0,0,1,1,2,1,1,1,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
        };
        arrayList.add(LV_28);

        int[][] LV_29 ={//0是墙，1是空，2是人，3是空箱子，4是满箱子，5是花,6是人加花
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,1,1,1,5,1,1,1,1,0,0,0},
                {0,0,1,1,1,0,0,3,0,0,1,1,0,0,0},
                {0,0,2,1,3,5,1,5,1,5,3,0,0,0,0},
                {0,0,0,1,3,0,0,3,0,0,1,0,0,0,0},
                {0,0,0,1,1,1,1,5,1,1,1,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
        };
        arrayList.add(LV_29);

        int[][] LV_30 ={//0是墙，1是空，2是人，3是空箱子，4是满箱子，5是花,6是人加花
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,2,1,1,1,1,1,0,1,1,1,1,1,1,0},
                {0,1,3,1,0,3,1,0,1,3,0,0,3,1,0},
                {0,1,0,1,1,3,1,0,1,1,1,1,1,1,0},
                {0,1,1,1,0,0,3,0,3,0,0,3,3,1,0},
                {0,1,0,1,0,1,5,5,5,1,0,1,1,1,0},
                {0,1,3,1,1,5,1,0,1,5,3,1,0,1,0},
                {0,1,3,0,1,3,5,5,5,1,1,0,1,1,0},
                {0,1,1,1,1,5,1,0,1,5,1,1,3,1,0},
                {0,1,0,0,5,3,0,0,0,3,5,1,0,1,0},
                {0,1,0,1,3,5,5,5,5,5,1,0,0,1,0},
                {0,1,1,1,1,1,1,1,1,1,1,1,1,1,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
        };
        arrayList.add(LV_30);

        int[][] LV_31 ={//0是墙，1是空，2是人，3是空箱子，4是满箱子，5是花,6是人加花
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,2,1,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,1,3,1,1,0,0,0,0,0,0,0,0,0,0},
                {0,1,3,1,3,1,1,0,0,0,0,0,0,0,0},
                {0,1,3,1,3,1,3,1,1,0,0,0,0,0,0},
                {0,1,3,1,3,1,3,1,1,1,1,0,0,0,0},
                {0,1,3,1,3,1,1,0,1,1,1,0,0,0,0},
                {0,1,3,1,1,0,0,1,3,3,3,1,0,0,0},
                {0,1,1,0,0,0,0,1,1,1,1,1,0,0,0},
                {0,0,1,0,0,0,5,3,3,3,3,3,5,0,0},
                {0,0,1,0,0,0,5,5,5,5,5,5,5,0,0},
                {0,0,1,1,1,5,4,4,4,4,4,4,4,5,0},
                {0,0,0,0,0,5,5,5,5,5,5,5,5,5,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
        };
        arrayList.add(LV_31);


        int[][] LV_32 ={//0是墙，1是空，2是人，3是空箱子，4是满箱子，5是花,6是人加花
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,2,1,3,1,3,1,3,5,4,5,5,0,0},
                {0,0,1,3,1,3,1,3,1,4,5,5,5,0,0},
                {0,0,1,1,3,1,3,1,3,5,4,5,5,0,0},
                {0,0,1,3,1,3,1,3,1,4,5,5,5,0,0},
                {0,0,1,1,3,1,3,1,3,5,4,5,5,0,0},
                {0,0,1,3,1,3,1,3,1,4,5,5,5,0,0},
                {0,0,1,1,3,1,3,1,3,5,4,5,5,0,0},
                {0,0,1,3,1,3,1,3,1,4,5,5,5,0,0},
                {0,0,1,1,3,1,3,1,3,5,4,5,5,0,0},
                {0,0,1,3,1,3,1,3,1,4,5,5,5,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
        };
        arrayList.add(LV_32);

        int[][] LV_33 ={//0是墙，1是空，2是人，3是空箱子，4是满箱子，5是花,6是人加花
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,1,1,2,0,0},
                {0,0,0,0,0,0,0,0,0,0,1,0,1,0,0},
                {0,0,1,3,1,3,1,3,1,3,1,1,1,0,0},
                {0,0,1,0,5,0,5,0,5,0,1,3,0,0,0},
                {0,0,5,5,5,5,5,5,5,1,1,1,0,0,0},
                {0,0,1,0,1,0,1,0,1,0,3,0,0,0,0},
                {0,0,1,3,1,3,1,3,1,3,1,1,1,0,0},
                {0,0,0,0,0,0,0,0,0,0,1,0,1,0,0},
                {0,0,0,0,0,0,0,0,0,0,1,1,1,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
        };
        arrayList.add(LV_33);

        int[][] LV_34 ={//0是墙，1是空，2是人，3是空箱子，4是满箱子，5是花,6是人加花
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,2,1,1,1,0,1,1,1,1,0,0,0},
                {0,0,0,1,3,1,3,3,3,3,3,1,0,0,0},
                {0,0,0,1,1,1,1,1,1,1,1,1,0,0,0},
                {0,0,0,0,0,0,0,1,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,5,1,1,0,0,0,0,0,0},
                {0,0,0,0,0,0,5,1,1,0,0,0,0,0,0},
                {0,0,0,0,0,0,5,5,5,0,0,0,0,0,0},
                {0,0,0,0,0,0,5,1,1,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
        };
        arrayList.add(LV_34);

        int[][] LV_35 ={//0是墙，1是空，2是人，3是空箱子，4是满箱子，5是花,6是人加花
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,1,2,1,0,0,0,0,0,0},
                {0,0,0,0,0,0,1,3,1,0,0,0,0,0,0},
                {0,0,0,0,0,0,1,5,1,0,0,0,0,0,0},
                {0,0,0,0,1,1,1,4,1,1,1,0,0,0,0},
                {0,0,0,0,1,4,4,4,4,4,1,0,0,0,0},
                {0,0,0,0,1,1,1,4,1,1,1,0,0,0,0},
                {0,0,0,0,0,0,3,4,3,0,0,0,0,0,0},
                {0,0,0,0,0,0,1,5,1,0,0,0,0,0,0},
                {0,0,0,0,0,0,1,4,1,0,0,0,0,0,0},
                {0,0,0,0,0,0,1,5,1,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
        };
        arrayList.add(LV_35);

        int[][] LV_36 ={//0是墙，1是空，2是人，3是空箱子，4是满箱子，5是花,6是人加花
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,1,1,1,1,5,5,5,1,3,1,0,0,0},
                {0,0,1,3,3,3,4,4,4,1,3,2,0,0,0},
                {0,0,1,1,1,1,5,5,5,1,3,1,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
        };
        arrayList.add(LV_36);

        int[][] LV_37 ={//0是墙，1是空，2是人，3是空箱子，4是满箱子，5是花,6是人加花
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,5,1,5,1,5,0,0,0,0,0},
                {0,0,0,0,0,1,3,3,3,1,0,0,0,0,0},
                {0,0,0,0,0,5,3,2,3,5,0,0,0,0,0},
                {0,0,0,0,0,1,3,3,3,1,0,0,0,0,0},
                {0,0,0,0,0,5,1,5,1,5,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
        };
        arrayList.add(LV_37);


        int[][] LV_38 ={//0是墙，1是空，2是人，3是空箱子，4是满箱子，5是花,6是人加花
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,2,1,4,1,1,0,0,0,0,0},
                {0,0,0,0,0,1,1,5,3,1,0,0,0,0,0},
                {0,0,0,0,0,1,3,5,1,1,0,0,0,0,0},
                {0,0,0,0,0,4,5,4,4,4,0,0,0,0,0},
                {0,0,0,0,0,1,1,4,1,1,0,0,0,0,0},
                {0,0,0,0,0,1,3,4,3,1,0,0,0,0,0},
                {0,0,0,0,0,1,1,5,1,1,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
        };
        arrayList.add(LV_38);

        int[][] LV_39 ={//0是墙，1是空，2是人，3是空箱子，4是满箱子，5是花,6是人加花
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,1,1,0,0,0,0,1,1,1,2,0,0},
                {0,0,0,4,1,1,1,4,1,4,4,1,1,0,0},
                {0,0,1,3,1,4,1,1,1,1,4,0,1,0,0},
                {0,0,1,5,1,1,1,0,0,0,1,1,1,0,0},
                {0,0,0,0,0,0,0,1,1,1,0,1,0,0,0},
                {0,0,1,4,1,5,1,4,1,1,4,4,1,0,0},
                {0,0,1,1,1,0,1,1,1,0,1,1,1,0,0},
                {0,0,0,4,1,1,1,4,1,0,3,0,1,0,0},
                {0,0,0,1,1,0,0,0,0,0,1,1,1,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
        };
        arrayList.add(LV_39);

        int[][] LV_40 ={//0是墙，1是空，2是人，3是空箱子，4是满箱子，5是花,6是人加花
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,1,2,1,0,0,0,0,0,0,0,0},
                {0,0,0,0,1,0,5,5,4,1,1,1,0,0,0},
                {0,0,0,0,1,5,5,5,0,1,1,1,0,0,0},
                {0,0,0,0,3,0,0,1,3,1,3,1,0,0,0},
                {0,0,0,1,1,1,0,3,0,0,0,0,0,0,0},
                {0,0,0,1,1,1,3,1,1,1,0,0,0,0,0},
                {0,0,0,0,0,0,0,1,0,1,0,0,0,0,0},
                {0,0,0,0,0,0,0,1,1,1,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
        };
        arrayList.add(LV_40);

        int[][] LV_41 ={//0是墙，1是空，2是人，3是空箱子，4是满箱子，5是花,6是人加花
                {2,2,2,2,2,2,2,2,2,2,2,2,2,2,2},
                {2,2,2,2,2,2,2,2,2,2,2,2,2,2,2},
                {2,2,2,2,2,2,2,2,2,2,2,2,2,2,2},
                {2,2,2,2,2,2,2,2,2,2,2,2,2,2,2},
                {2,2,2,2,2,2,2,2,2,2,2,2,2,2,2},
                {2,2,2,2,2,2,2,2,2,2,2,2,2,2,2},
                {2,2,2,2,2,2,2,2,2,2,2,2,2,2,2},
                {2,2,2,2,2,2,2,2,2,2,2,2,2,2,2},
                {2,2,2,2,2,2,2,2,2,2,2,2,2,2,2},
                {2,2,2,2,2,2,2,2,2,2,2,2,2,2,2},
                {2,2,2,2,2,2,2,2,2,2,2,2,2,2,2},
                {2,2,2,2,2,2,2,2,2,2,2,2,2,2,2},
                {2,2,2,2,2,2,2,2,2,2,2,2,2,2,2},
                {2,2,2,2,2,2,2,2,2,2,2,2,2,2,2},
                {2,2,2,2,2,2,2,2,2,2,2,2,2,2,2}

        };
       // arrayList.add(LV_41);


    }














}
