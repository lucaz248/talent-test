package com.igz.talenttest.rest;

import com.igz.talenttest.TalentTestApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest(
        webEnvironment = SpringBootTest.WebEnvironment.MOCK,
        classes = TalentTestApplication.class)
@AutoConfigureMockMvc
public class OperationControllerTest {

    public static final String INPUT_TEST = "15,7,3,5,1";
    public static final String EXPECTED_OUTPUT = "15,7,3,5,1";
    public static final String URL_TEMPLATE = "/operation/binary-sort/";
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void binarySort() throws Exception {
        this.mockMvc.perform(post(URL_TEMPLATE).contentType(MediaType.APPLICATION_JSON).content(String.format("[%s]", INPUT_TEST)))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(containsString(EXPECTED_OUTPUT)));

    }

    @Test
    public void binarySortGet() throws Exception {
        String urlTemplate = "/operation/binary-sort/".concat(INPUT_TEST);
        this.mockMvc.perform(get(urlTemplate).contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(containsString(EXPECTED_OUTPUT)));
    }
}