package org.mattos.sandbox.problemsolving;

import java.util.List;

public class CollisionDetection {

    public static int collision(List<Integer> speed, int pos) {

        Integer mySpeed = speed.get(pos);

        List<Integer> before = speed.subList(0, pos);
        List<Integer> after = speed.subList(pos+1, speed.size());

        return Long.valueOf(before.stream().mapToInt(v->v).filter(theirSpeed -> mySpeed>theirSpeed).count() +
                after.stream().filter(theirSpeed -> mySpeed<theirSpeed).count()).intValue();



    }
}
