package git.lirui.practice.factory.simplefactory;

/**
 * Created by lirui on 2018/3/9.
 */

public interface Login {
    boolean verify(String accountNumber, String passWord);
}
