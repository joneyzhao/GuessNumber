package com.twschool.practice;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuessNumberTest {
    @Test
    public void should_return_4A0B_when_input_num_and_position_all_are_right(){
        //given
        GuessNumber guessNumber = new GuessNumber();
        //when
        String resultString = guessNumber.getGuessResult("1,2,3,4", "1,2,3,4");
        //then
        assertEquals("4A0B", resultString);
    }
    @Test
    public void should_return_2A2B_when_input_nums_are_all_right_but_positions_are_not_all_right(){
    }
    @Test
    public void should_return_1A2B_when_input_nums_and_positions_are_not_all_right(){
    }
    @Test
    public void should_return_0A4B_when_input_nums_are_all_right_but_positions_are_all_wrong(){
    }
    @Test
    public void should_return_0A3B_when_input_nums_are_not_all_right_but_positions_all_are_wrong(){
    }
    @Test
    public void should_return_0A0B_when_input_nums_are_all_wrong_and_positions_all_are_wrong(){
    }
}
