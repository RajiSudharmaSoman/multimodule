package org.raji;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

	@GetMapping(value = "create")
	public String getCaseCreatePage() {
		return "create";
	}
}
