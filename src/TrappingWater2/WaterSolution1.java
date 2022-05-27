package TrappingWater2;

public class WaterSolution {
    public int trap(int[] height) {
        int heightLength = height.length;
        int peak = 0;
        int[] rightSideBiggerBuilding = new int[heightLength];
        int[] leftSideBiggerBuilding = new int[heightLength];

        for(int i = 0; i < heightLength; i++)
        {
            if(peak < height[i]) {
                peak = height[i];
            }

            rightSideBiggerBuilding[i] = peak;
        }

        for(int i = heightLength-1; i >= 0; i++)
        {
            if(peak < height[i]) {
                peak = height[i];
            }

            rightSideBiggerBuilding[i] = peak;
        }

//        for(int i = 0; i < heightLength; i++) {
//            System.out.print(rightSideBiggerBuilding[i]+" ");
//        }
        System.out.println();
        for(int j = 0; j < heightLength; j++) {
            System.out.print(leftSideBiggerBuilding[j]+" ");
        }
        return 0;
    }
    public static void main(String arg[])
    {
        TrappingWater2.WaterSolution w = new TrappingWater2.WaterSolution();
        int[] height = new int[]{0,1,0,2,1,0,1,3,2,1,2,1};
        w.trap(height);
    }
}
