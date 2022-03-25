package com.example.kafkaexample.domain;

public class MessageRequest {
  private String message;

  public String getMessage() {
    return message;
  }

  public MessageRequest(String message) {
    this.message = message;
  }
}
