package com.bluecode;

import com.bluecode.entity.ShortenerRequest;
import com.bluecode.repository.ShortenerRepository;
import com.bluecode.service.ShortenerService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = BlueCodeApplication.class)
class ShortenerServiceTest {

	@Autowired
	private ShortenerService service;

	@MockBean
	private ShortenerRepository repository;

	@Test
	public void givenAnUrlShort() {
		Mockito.when(repository.save(Mockito.any())).thenReturn(getMock());

		ShortenerRequest request = new ShortenerRequest();
		request.setUrl("www.google.com");

		ShortenerRequest result = service.applyShortener(request);

		assertEquals("http://shortner/encripted", result.getShortenedUrl());
	}

	private ShortenerRequest getMock() {
		ShortenerRequest response = new ShortenerRequest();
		response.setShortenedUrl("http://shortner/encripted");

		return response;
	}

}
