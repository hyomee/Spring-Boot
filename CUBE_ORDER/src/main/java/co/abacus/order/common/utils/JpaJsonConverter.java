package co.abacus.order.common.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.AttributeConverter;
import java.io.IOException;

@Slf4j
public class JpaJsonConverter implements AttributeConverter<Object, String> {

  private final static ObjectMapper objectMapper = new ObjectMapper();

  @Override
  public String convertToDatabaseColumn(Object meta) {
    try {
      return objectMapper.writeValueAsString(meta);
    } catch (JsonProcessingException ex) {
      return null;
      // or throw an error
    }
  }

  @Override
  public JsonNode convertToEntityAttribute(String dbData) {
    try {
      log.debug("dbData " + dbData);
      log.debug("Object.class " + Object.class.getTypeName());
      return objectMapper.readValue(dbData, JsonNode.class);
    } catch (IOException ex) {
      // logger.error("Unexpected IOEx decoding json from database: " + dbData);
      return null;
    }
  }

}
