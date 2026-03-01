package com.project.llm;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class LlmApplicationTests {

	@Test
	void contextLoads() {

	}

	@Test
	void testListContents() {
		List<String> names = List.of("Alice", "Bob", "Charlie");

		// AssertJ allows fluent assertions
		assertThat(names)
				.isNotEmpty()
				.hasSize(3)
				.contains("Alice", "Charlie")
				.doesNotContain("David");
	}

}
