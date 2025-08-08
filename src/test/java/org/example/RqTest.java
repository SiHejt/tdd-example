package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RqTest {
    @Test
    @DisplayName("getActionName")
    void t1() {

        Rq rq = new Rq("삭제?id=1");
        String actionName = rq.getActionName();

        assertThat(actionName).isEqualTo("삭제");
    }

    @Test
    @DisplayName("getActionName")
    void t2() {

        Rq rq = new Rq("수정?id=1");
        String actionName = rq.getActionName();

        assertThat(actionName).isEqualTo("수정");
    }

    @Test
    @DisplayName("getActionName")
    void t3() {

        Rq rq = new Rq("삭제?id=1");
        String actionName = rq.getActionName();

        assertThat(actionName).isEqualTo("삭제");
    }
}
