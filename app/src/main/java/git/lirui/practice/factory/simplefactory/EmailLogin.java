package git.lirui.practice.factory.simplefactory;

/**
 * Created by lirui on 2018/3/9.
 */

public class EmailLogin implements Login{
    @Override
    public boolean verify(String accountNumber, String passWord) {

        return false;
    }
}
