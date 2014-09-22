package mappers;

import fr.xebia.extras.selma.Mapper;
import models.User;
import dtos.UserDTO;

@Mapper
public interface UserMapper {
  UserDTO asDto(User user);
  User asModel(UserDTO user);
}
