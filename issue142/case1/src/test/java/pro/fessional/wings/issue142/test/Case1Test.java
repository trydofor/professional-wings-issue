package pro.fessional.wings.issue142.test;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Case1Test {

    @Test
    void excepted() {
        AssertService142Helper.excepted("`@ImportAutoConfiguration` with `@AutoConfiguration` and `@AutoConfigureOrder`");
    }
}
