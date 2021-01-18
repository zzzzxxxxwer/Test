package com.DaoImpl;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import com.Dao.UserDao;
import com.domain.User;
public class UserDaoImpl implements UserDao{
    static File file = new File("user.txt");
    //静态代码块，随着类的加载而加载
    static{
        try {
            file.createNewFile();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    @Override
    public void regist(User user) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(file,true));
            //拼接字符串
            String info = user.getName() + "--" + user.getPassword();
            //写进去
            bw.write(info);
            //换行
            bw.newLine();
            //刷新
            bw.flush();
            //释放资源
            bw.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    @Override
    public boolean isLogin(String name, String password) {
        boolean flag = false;
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            //读数据，然后进行比对数据
            String line;
            while((line = br.readLine())!= null){
                String[] strings = line.split("--");
                if(name.equals(strings[0])&&password.equals(strings[1])){
                    flag = true;
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }

}