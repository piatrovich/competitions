package com.piatrovich.leetcode;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

public class ListNodeUtilsTest {
    @Test
    void test() throws JsonProcessingException {
        ListNode listNode = ListNodeUtils.createList("3 4 5");

        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(listNode);
        System.out.println(json);
    }
}
