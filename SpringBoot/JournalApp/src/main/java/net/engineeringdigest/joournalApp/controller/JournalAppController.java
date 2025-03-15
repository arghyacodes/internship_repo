package net.engineeringdigest.joournalApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JournalAppController {

	@GetMapping("/health-check")
	public String health()
	{
		return "Ok";
	}
}
