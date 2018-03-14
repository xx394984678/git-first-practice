package git.lirui.practice.factory.simplefactory;

/**
 * Created by lirui on 2018/3/9.
 */

public class UserNameLogin implements Login{

    @Override
    public boolean verify(String accountNumber, String passWord) {

        return accountNumber.equals(passWord);
    }
}
