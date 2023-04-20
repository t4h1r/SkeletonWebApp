package com.develogical;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class QueryProcessorTest {

  QueryProcessor queryProcessor = new QueryProcessor();

  @Test
  public void returnsEmptyStringIfCannotProcessQuery() throws Exception {
    assertThat(queryProcessor.process("test"), is(""));
  }

  @Test
  public void knowsAboutShakespeare() throws Exception {
    assertThat(queryProcessor.process("Shakespeare"), containsString("playwright"));
  }


  @Test
  public void knowsAboutTahir() throws Exception {
    assertThat(queryProcessor.process("What is your name?"), containsString("Tahir"));
  }

  @Test
  public void findMaxValue() throws Exception {
    assertThat(queryProcessor.process("Which of the following numbers is the largest: 25, 11, 82?"), is("82"));
    assertThat(queryProcessor.process("Which of the following numbers is the largest: 25, 64, 24?"), is("64"));
    assertThat(queryProcessor.process("Which of the following numbers is the largest: 64, 22, 95?"), is("95"));
  }

  @Test
  public void findAddition() throws Exception {
    assertThat(queryProcessor.process("What is 2 plus 2?"), is("4"));
    assertThat(queryProcessor.process("What is 4 plus 4?"), is("8"));
    assertThat(queryProcessor.process("What is 8 plus 18?"), is("26"));
  }

  @Test
  public void findMultiplication() throws Exception {
    assertThat(queryProcessor.process("What is 86 multiplied by 34?"), is("2924"));
    assertThat(queryProcessor.process("What is 1 multiplied by 3?"), is("3"));
    assertThat(queryProcessor.process("What is 3 multiplied by 6?"), is("18"));
  }




}


