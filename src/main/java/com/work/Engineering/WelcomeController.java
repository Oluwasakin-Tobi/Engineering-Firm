package com.work.Engineering;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.file.StandardCopyOption;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.UUID;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.support.RequestContextUtils;

import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
public class WelcomeController {
	
	static final Logger LOGGER = LoggerFactory.getLogger(WelcomeController.class);
	final static DateFormat RECONDATEFORMAT = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	final static DateFormat DORECONDATEFORMAT = new SimpleDateFormat("yyyy-MM-dd");
	final static ObjectMapper MAPPER = new ObjectMapper();

	@Autowired
	MessageSource messageSource;
	@Autowired
	Environment environment;
	@Autowired
	private ServletContext servletContext;
	@Autowired
	HttpServletRequest request;
	
	
	
	@SuppressWarnings("unchecked")
	@RequestMapping(value = { "/welcome" }, method = RequestMethod.GET)
	public String createUserss() throws Exception {
		

		return "OnePageMerge";
	}
	
	

}
