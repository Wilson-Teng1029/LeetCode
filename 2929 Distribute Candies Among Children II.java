//2929. Distribute Candies Among Children II
class Solution {
    public long distributeCandies(int n, int limit) {
        if (n > 3 * limit) {
            return 0;
        }
        // 10顆球放入3箱子有2個隔板，因此comb用2
        long ans = comb2(n + 2);
        // 去除掉有箱子放超出上限的
        //ex:(n=5,limit=2)但(3,2,0)、(3,1,1)之類的
        if (n > limit) {
            ans -= 3 * comb2(n - limit + 1);
        }
        // 把多扣的兩盒子放入超出Limit的部分加回來
        if (n - 2 >= 2 * limit) {
            ans += 3 * comb2(n - 2 * limit);
        }
        return ans;
    }

    private long comb2(int n) {
        return 1L * n * (n - 1) / 2;
    }
}
