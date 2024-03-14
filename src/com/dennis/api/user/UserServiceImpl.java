package com.dennis.api.user;

import com.dennis.api.common.AbstractService;
import com.dennis.api.common.UtilService;
import com.dennis.api.common.UtilServiceImpl;
import com.dennis.api.enums.Messenger;

import java.sql.SQLException;
import java.util.*;
import java.util.stream.Collectors;

public class UserServiceImpl extends AbstractService<User> implements UserService {
    private static UserServiceImpl instance = new UserServiceImpl();
    Map<String, User> users;
    UserRepository repo;

    public UserServiceImpl() {
        this.repo = UserRepository.getInstance();
        this.users = new HashMap<>();
    }
    public static UserServiceImpl getInstance() {
        return instance;
    }

    public String addUsers() {
        UtilService util = UtilServiceImpl.getInstance();
        Map<String, User> map = new HashMap<>();
        for (int i = 0; i < 5; i++) {
            String username = util.createRandomUsername(); // util.을 통해 UtilServiceImpl 클래스의 createRandomUsername 이라는 기능을 가져와 String 타입의 문자열 값을 넣기 위해 username 이라는 변수에 참조값을 할당하였음.
            map.put(username,
                    User.builder()
                            .username(username)
                            .password("1")
                            .name(util.createRandomName())
                            .build());
        }
        users = map;
        return "addusers 결과 : " + users + "개 더미값 추가";
    }
    @Override
    public User findUserById(Scanner sc) {
        System.out.println("찾을 계정의 아이디를 입력하세요.");
        String userId = sc.next();
        User user = users.get(userId);
        if (user != null) {
            System.out.println(user);
        } else {
            System.out.println("아이디가 존재하지 않습니다");
        }
        return user;
    }
    @Override
    public Messenger save(User user) {
        users.put(user.getUsername(), user);
        return Messenger.SUCCESS;
    }

    @Override
    public List<User> findAll() {
        return new ArrayList<>(users.values());
    }

    @Override
    public Optional<User> findById(Long id) {
        return Optional.of(users
                .values()
                .stream()
                .filter(i -> i.getUsername().equals(id))
                .collect(Collectors.toList()).get(0));
    }

    @Override
    public String count() {
        return users.size()+"";
    }

    @Override
    public Optional<User> getOne(String id) {
        return Optional.of(users.get(id));
    }

    @Override
    public String delete(User user) {
        return null;
    }

    @Override
    public String deleteAll() {
        return null;
    }

    @Override
    public Boolean existsById(Long id) {
        return null;
    }

    @Override
    public Map<String, User> userList() {
        return users;
    }

    @Override
    public String login(User build) {
        String msg = "";
        User userInMap = users.get(build.getUsername());
        if (userInMap == null) {
            msg = "계정을 찾을 수 없습니다.";
        } else {
            if (userInMap.getPassword().equals(userInMap.getPassword())) {
                msg = "로그인에 성공했습니다!";
            } else {
                msg = "비밀번호가 일치하지 않습니다.";
            }
        }
        return msg;
    }

    @Override
    public String updatePassword(User user) {
        users.get(user.getUsername()).setPassword(user.getPassword());
        return "비밀번호가 변경되었습니다.";
    }

    @Override
    public User findUserByName(Scanner sc) {
        return null;
    }

    @Override
    public String deleteAccount(Scanner sc) {
        String msg = "";
        System.out.println("삭제할 계정의 아이디를 입력하세요.");
        String username = sc.next();
        User user = users.get(username);
        if (username != null) ;
        {
            System.out.println("비밀번호를 입력하세요.");
            String password = sc.next();
            if (password != null) {
                msg = "계정이 삭제됩니다.";
            } else {
                msg = "존재하지 않는 아이디입니다.";
            }
            return null;

        }
    }

    @Override
    public Messenger createTable() throws SQLException {
        return repo.createTable();
    }


    @Override
    public String deleteTable() throws SQLException {
        return repo.deleteTable();
    }
}
