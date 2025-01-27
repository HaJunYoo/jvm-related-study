package pack;

import com.google.common.collect.Lists; // Guava
import org.apache.commons.lang3.StringUtils; // Apache Commons Lang3
import org.slf4j.Logger; // SLF4J
import org.slf4j.LoggerFactory;
import pack.a.User;

public class PackageMain4 {
    // SLF4J 로거 설정
    private static final Logger logger = LoggerFactory.getLogger(PackageMain4.class);

    public static void main(String[] args) {
        // Guava 라이브러리 사용
        var users = Lists.newArrayList(
                new User(),
                new pack.b.User()
        );

        // Apache Commons Lang3 사용
        String name = "  John Doe  ";
        String trimmedName = StringUtils.trim(name);

        // SLF4J를 사용한 로깅
        logger.info("Total users: {}", users.size());
        logger.info("Trimmed name: {}", trimmedName);

        // StringUtils의 다른 유용한 메서드 사용
        if (StringUtils.isNotBlank(trimmedName)) {
            logger.info("Name is not blank");
        }
    }
}