package co.abacus.order.common.utils;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.AttributeConverter;

public class JpaGsonConverter implements AttributeConverter<Object, String> {
  @Autowired
  private Gson gson;


  @Override
  public String convertToDatabaseColumn(Object attribute) {
    return gson.toJson(attribute);
  }

  @Override
  public Object convertToEntityAttribute(String dbData) {
    return gson.fromJson(dbData, Object.class);
  }
}
